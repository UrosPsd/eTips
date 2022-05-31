package com.etips.controllers;

import com.etips.models.Club;
import com.etips.models.Game;
import com.etips.models.HandicapInput;
import com.etips.services.HandicapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/inputs")
public class HandicapController {

    private final HandicapService handicapService;

    @Autowired
    public HandicapController(HandicapService handicapService) {
        this.handicapService = handicapService;
    }

    @RequestMapping(value = "/handicap", method = RequestMethod.GET, produces = "application/json")
    public HandicapInput calculateHandicap(@RequestParam String club1, @RequestParam String club2, @RequestParam float handicap) {
        Club c1 = handicapService.findByName(club1);
        Club c2 = handicapService.findByName(club2);

        List<Game> games = handicapService.getGames();

        HandicapInput handicapInput = new HandicapInput(c1, c2, handicap);
        handicapInput.setGames(games);

        System.out.println("Input request received for: " + handicapInput);

        HandicapInput hi = handicapService.getHandicap(handicapInput);

        return hi;
    }

}
