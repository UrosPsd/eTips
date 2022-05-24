package com.etips.models;

import com.etips.models.enums.CourtType;
import com.etips.models.enums.SeasonPart;

public class Game {
    private Player player;
    private int points;
    private Club opposingClub;
    private CourtType courtType;
    private SeasonPart seasonPart;
    private Score score;

    public Game() {
    }

    public Game(Player player, int points, Club opposingClub, CourtType courtType, SeasonPart seasonPart, Score score) {
        this.player = player;
        this.points = points;
        this.opposingClub = opposingClub;
        this.courtType = courtType;
        this.seasonPart = seasonPart;
        this.score = score;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
