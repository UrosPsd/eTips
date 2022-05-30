package com.etips.controllers;

import com.etips.models.Club;
import com.etips.models.InputState;
import com.etips.models.Player;
import com.etips.models.enums.CourtType;
import com.etips.models.enums.SeasonPart;
import com.etips.services.InputStateService;
import org.apache.tools.ant.taskdefs.Input;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inputs")
public class InputStateController {

    private final InputStateService inputStateService;

    @Autowired
    public InputStateController(InputStateService inputStateService) {
        this.inputStateService = inputStateService;
    }

    @RequestMapping(value = "/plus-minus", method = RequestMethod.GET, produces = "application/json")
    public InputState calculateResult(@RequestParam(required = true) String name, @RequestParam(required = true) String surname, @RequestParam(required = true) String opposingClub, @RequestParam(required = true) CourtType courtType, @RequestParam(required = true) SeasonPart seasonPart, @RequestParam(required = true) float averagePointsBet) {
        Player player = inputStateService.findByNameAndSurname(name, surname);
        Club club = inputStateService.findByName(opposingClub);

        InputState inputState = new InputState(player, club, courtType, seasonPart, averagePointsBet);

        System.out.println("Input request received for: " + inputState);

        InputState ist = inputStateService.getResult(inputState);

        return ist;
    }
}
