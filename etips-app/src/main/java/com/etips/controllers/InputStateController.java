package com.etips.controllers;

import com.etips.models.*;
import com.etips.models.enums.CourtType;
import com.etips.models.enums.SeasonPart;
import com.etips.services.InputStateService;
import com.etips.services.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
@RequestMapping("/inputs")
public class InputStateController {

    private final InputStateService inputStateService;

    private final TemplateService templateService;


    @Autowired
    public InputStateController(InputStateService inputStateService, TemplateService templateService) {
        this.inputStateService = inputStateService;
        this.templateService = templateService;
    }

    @RequestMapping(value = "/plus-minus", method = RequestMethod.GET, produces = "application/json")
    public InputState calculateResult(@RequestParam(required = true) String name, @RequestParam(required = true) String surname, @RequestParam(required = true) String opposingClub, @RequestParam(required = true) CourtType courtType, @RequestParam(required = true) SeasonPart seasonPart, @RequestParam(required = true) float averagePointsBet) throws FileNotFoundException {
//        templateService.generateTemplate();

        Player player = inputStateService.findByNameAndSurname(name, surname);
        Club club = inputStateService.findByName(opposingClub);
        GamesHelper gh = new GamesHelper(inputStateService.geAllGames());

        InputState inputState = new InputState(player, club, courtType, seasonPart, averagePointsBet);

        System.out.println("Input request received for: " + inputState);

        InputState ist = inputStateService.getResult(inputState, player, club, gh);

        return ist;
    }
}
