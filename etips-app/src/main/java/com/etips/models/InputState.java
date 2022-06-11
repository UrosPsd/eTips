package com.etips.models;

import com.etips.models.enums.CourtType;
import com.etips.models.enums.PlayerForm;
import com.etips.models.enums.ResultState;
import com.etips.models.enums.SeasonPart;

public class InputState {

    private Player player;
    private Club opposingClub;
    private CourtType courtType;
    private SeasonPart seasonPart;
    private float averagePointsBet;
    private boolean formCalculated;
    private ResultState resultState;

    public InputState() {
    }

    public InputState(Player player, Club opposingClub, CourtType courtType, SeasonPart seasonPart, float averagePointsBet) {
        this.player = player;
        this.opposingClub = opposingClub;
        this.courtType = courtType;
        this.seasonPart = seasonPart;
        this.averagePointsBet = averagePointsBet;
        this.formCalculated = false;
        this.resultState = ResultState.NA;
    }



    public ResultState getResultState() {
        return resultState;
    }

    public void setResultState(ResultState resultState) {
        this.resultState = resultState;
    }

    public boolean isFormCalculated() {
        return formCalculated;
    }

    public void setFormCalculated(boolean formCalculated) {
        this.formCalculated = formCalculated;
    }

    public void setPlayerInjury(boolean injury) {
        this.player.setInjury(injury);
    }

    public void setPlayerForm(PlayerForm playerForm) {
        this.player.setPlayerForm(playerForm);
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Club getOpposingClub() {
        return opposingClub;
    }

    public void setOpposingClub(Club opposingClub) {
        this.opposingClub = opposingClub;
    }

    public CourtType getCourtType() {
        return courtType;
    }

    public void setCourtType(CourtType courtType) {
        this.courtType = courtType;
    }

    public SeasonPart getSeasonPart() {
        return seasonPart;
    }

    public void setSeasonPart(SeasonPart seasonPart) {
        this.seasonPart = seasonPart;
    }

    public float getAveragePointsBet() {
        return averagePointsBet;
    }

    public void setAveragePointsBet(float averagePointsBet) {
        this.averagePointsBet = averagePointsBet;
    }

    @Override
    public String toString() {
        return "InputState{" +
                "player=" + player +
                ", opposingClub=" + opposingClub +
                ", courtType=" + courtType +
                ", seasonPart=" + seasonPart +
                ", averagePointsBet=" + averagePointsBet +
                ", formCalculated=" + formCalculated +
                '}';
    }
}
