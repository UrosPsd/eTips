package com.etips.services;

import com.etips.models.*;
import com.etips.repositories.ClubRepository;
import com.etips.repositories.GameRepository;
import com.etips.repositories.PlayerRepository;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChampionsService {
    private final KieContainer kieContainer;

    @Autowired
    private ClubRepository clubRepository;
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    public ChampionsService(KieContainer kieContainer) {
        System.out.println("Initialising ChampionsService session.");
        this.kieContainer = kieContainer;
    }

    public ChampionsInput getChampion(ChampionsInput i) {
        KieSession kieSession = kieContainer.newKieSession();
        for (Club c: clubRepository.findAll()) {
            if(c.getGamesPlayed()==null)
                c.setGamesPlayed(new ArrayList<>());
            kieSession.insert(c);
        }
        for (Player p: playerRepository.findAll()) {
            if(p.getGamesPlayed()==null)
                p.setGamesPlayed(new ArrayList<>());
            kieSession.insert(p);
        }
        kieSession.insert(i);
        kieSession.fireAllRules();
        kieSession.dispose();
        return i;
    }

    public List<Club> getAllClubs(){
        return clubRepository.findAll();
    }

    public List<Game> getAllGames(){
        return gameRepository.findAll();
    }
}
