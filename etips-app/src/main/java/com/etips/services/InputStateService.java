package com.etips.services;

import com.etips.models.Club;
import com.etips.models.InputState;
import com.etips.models.Player;
import com.etips.repositories.ClubRepository;
import com.etips.repositories.PlayerRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InputStateService  {

    private final KieContainer kieContainer;

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

    @Autowired
    public InputStateService(KieContainer kieContainer) {
        System.out.println("Initialising a new example session.");
        this.kieContainer = kieContainer;
    }

    public InputState getResult(InputState i) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(i);
        kieSession.fireAllRules();
        kieSession.dispose();
        return i;
    }
}
