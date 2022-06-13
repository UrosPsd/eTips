package com.etips.services;

import com.etips.models.*;
import com.etips.repositories.ClubRepository;
import com.etips.repositories.GameRepository;
import com.etips.repositories.PlayerRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QueryService {

    private final KieContainer kieContainer;

    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private ClubRepository clubRepository;
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    public QueryService(KieContainer kieContainer) {
        System.out.println("Initialising a new example session.");
        this.kieContainer = kieContainer;
    }

    public QueryResults getResult(QueryResults q) {
        KieSession kieSession = kieContainer.newKieSession();
        for (Game g: gameRepository.findAll()) {
            kieSession.insert(g);
        }
        for (Player p: playerRepository.findAll()) {
            kieSession.insert(p);
        }
        for (Club c: clubRepository.findAll()) {
            kieSession.insert(c);
        }
        kieSession.insert(q);
        kieSession.fireAllRules();
        kieSession.dispose();
        return q;
    }

}
