package com.etips.services;

import com.etips.models.*;
import com.etips.models.enums.ClubDefense;
import com.etips.models.enums.CourtType;
import com.etips.models.enums.PlayerForm;
import com.etips.models.enums.ResultState;
import com.etips.repositories.ClubRepository;
import com.etips.repositories.GameRepository;
import com.etips.repositories.PlayerRepository;
import org.drools.template.ObjectDataCompiler;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.utils.KieHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class InputStateService  {

    private final KieContainer kieContainer;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private ClubRepository clubRepository;

    @Autowired
    private PlayerRepository playerRepository;

    public Player findByNameAndSurname(String name, String surname) {
        return playerRepository.findOneByNameAndSurname(name, surname);
    }

    public Club findByName(String name) {
        return clubRepository.findOneByName(name);
    }

    public List<Game> geAllGames() {
        return gameRepository.findAll();
    }

    @Autowired
    public InputStateService(KieContainer kieContainer) {
        System.out.println("Initialising a new example session.");
        this.kieContainer = kieContainer;
    }

    public InputState getResult(InputState i, Player p, Club c, GamesHelper g) throws FileNotFoundException {
        KieSession kieSession = kieContainer.newKieSession();
        KieSession kieSession1 = generateTemplate();
        kieSession.insert(i);
        kieSession.insert(p);
        kieSession.insert(c);
        kieSession.insert(g);
        kieSession.fireAllRules();

        kieSession1.insert(i);
        kieSession1.insert(p);
        kieSession1.insert(c);
        kieSession1.insert(g);
        kieSession.fireAllRules();
        kieSession1.fireAllRules();
        kieSession.dispose();
        kieSession1.dispose();
        return i;
    }

    public KieSession generateTemplate() throws FileNotFoundException {
        InputStream template = new FileInputStream("../drools-spring-kjar/src/main/resources/sbnz/integracija/result-template.drt");

        List<TemplateModel> data = new ArrayList<TemplateModel>();

        data.add(new TemplateModel(ResultState.NA, true, PlayerForm.EXTREMELY_OUT_OF_FORM, ClubDefense.EXCELENT_DEFENSE, CourtType.AWAY_COURT, ResultState.MINUS));
        data.add(new TemplateModel(ResultState.NA, true, PlayerForm.IN_FORM, ClubDefense.BAD_DEFENSE, CourtType.HOME_COURT, ResultState.PLUS));

        ObjectDataCompiler converter = new ObjectDataCompiler();
        String drl = converter.compile(data, template);

        return createKieSessionFromDRL(drl);

//        ksession.fireAllRules();
    }

    private KieSession createKieSessionFromDRL(String drl) {
        KieHelper kieHelper = new KieHelper();
        kieHelper.addContent(drl, ResourceType.DRL);

        Results results = kieHelper.verify();

        if (results.hasMessages(Message.Level.WARNING, Message.Level.ERROR)){
            List<Message> messages = results.getMessages(Message.Level.WARNING, Message.Level.ERROR);
            for (Message message : messages) {
                System.out.println("Error: "+message.getText());
            }

            throw new IllegalStateException("Compilation errors were found. Check the logs.");
        }

        return kieHelper.build().newKieSession();
    }
}
