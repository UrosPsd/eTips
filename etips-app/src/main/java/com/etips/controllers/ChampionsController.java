package com.etips.controllers;

import com.etips.models.ChampionsInput;
import com.etips.models.Club;
import com.etips.models.Game;
import com.etips.models.HandicapInput;
import com.etips.services.ChampionsService;
import com.etips.services.HandicapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/champions")
public class ChampionsController {

    private final ChampionsService championsService;

    @Autowired
    public ChampionsController(ChampionsService championsService) {
        this.championsService = championsService;
    }

    @RequestMapping(value = "/find", method = RequestMethod.GET, produces = "application/json")
    public ChampionsInput calculateHandicap(@RequestParam String champions) {
        ChampionsInput championsInput = new ChampionsInput(champions);

        ChampionsInput ci = championsService.getChampion(championsInput);

        return ci;
    }

}
