package com.etips.services;

import com.etips.models.Club;
import com.etips.models.Game;
import com.etips.models.HandicapInput;
import com.etips.models.InputState;
import com.etips.repositories.ClubRepository;
import com.etips.repositories.GameRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandicapService {

    private final KieContainer kieContainer;

    @Autowired
    private ClubRepository clubRepository;
    @Autowired
    private GameRepository gameRepository;

    public Club findByName(String name) {
        return clubRepository.findOneByName(name);
    }

    @Autowired
    public HandicapService(KieContainer kieContainer) {
        System.out.println("Initialising a new example session.");
        this.kieContainer = kieContainer;
    }

    public HandicapInput getHandicap(HandicapInput i) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(i);
        kieSession.fireAllRules();
        kieSession.dispose();
        return i;
    }

    public List<Game> getGames() {
        return gameRepository.findAll();
    }
}
