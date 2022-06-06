package com.etips.models;

import com.etips.models.enums.ClubDefense;
import com.etips.models.enums.CourtType;
import com.etips.models.enums.PlayerForm;
import com.etips.models.enums.ResultState;

public class TemplateModel {
    private ResultState resState;
    private boolean formBool;
    private PlayerForm playerForm;
    private ClubDefense clubDefense;
    private CourtType courtType;
    private ResultState resultState;

    public TemplateModel() {
    }

    public TemplateModel(ResultState resState, boolean formBool, PlayerForm playerForm, ClubDefense clubDefense, CourtType courtType, ResultState resultState) {
        this.resState = resState;
        this.formBool = formBool;
        this.playerForm = playerForm;
        this.clubDefense = clubDefense;
        this.courtType = courtType;
        this.resultState = resultState;
    }

    public ResultState getResState() {
        return resState;
    }

    public void setResState(ResultState resState) {
        this.resState = resState;
    }

    public boolean isFormBool() {
        return formBool;
    }

    public void setFormBool(boolean formBool) {
        this.formBool = formBool;
    }

    public PlayerForm getPlayerForm() {
        return playerForm;
    }

    public void setPlayerForm(PlayerForm playerForm) {
        this.playerForm = playerForm;
    }

    public ClubDefense getClubDefense() {
        return clubDefense;
    }

    public void setClubDefense(ClubDefense clubDefense) {
        this.clubDefense = clubDefense;
    }

    public CourtType getCourtType() {
        return courtType;
    }

    public void setCourtType(CourtType courtType) {
        this.courtType = courtType;
    }

    public ResultState getResultState() {
        return resultState;
    }

    public void setResultState(ResultState resultState) {
        this.resultState = resultState;
    }
}
