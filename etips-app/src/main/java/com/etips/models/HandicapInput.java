package com.etips.models;

import com.etips.models.enums.HandicapValue;

import java.util.List;

public class HandicapInput {

    private Club club1;
    private Club club2;
    private float handicap;
    private double offRating1;
    private double offRating2;
    private double value;
    private HandicapValue handicapValue;
    private List<Game> games;

    public HandicapInput() {
    }

    public HandicapInput(Club club1, Club club2, float handicap) {
        this.club1 = club1;
        this.club2 = club2;
        this.handicap = handicap;
        this.offRating1 = 0;
        this.offRating2 = 0;
        this.value = 0;
        this.handicapValue = HandicapValue.NA;
    }

    public Club getClub1() {
        return club1;
    }

    public void setClub1(Club club1) {
        this.club1 = club1;
    }

    public Club getClub2() {
        return club2;
    }

    public void setClub2(Club club2) {
        this.club2 = club2;
    }

    public float getHandicap() {
        return handicap;
    }

    public void setHandicap(float handicap) {
        this.handicap = handicap;
    }

    public double getOffRating1() {
        return offRating1;
    }

    public void setOffRating1(double offRating1) {
        this.offRating1 = offRating1;
    }

    public double getOffRating2() {
        return offRating2;
    }

    public void setOffRating2(double offRating2) {
        this.offRating2 = offRating2;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public HandicapValue getHandicapValue() {
        return handicapValue;
    }

    public void setHandicapValue(HandicapValue handicapValue) {
        this.handicapValue = handicapValue;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
