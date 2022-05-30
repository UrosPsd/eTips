package com.etips.models;

import com.etips.models.enums.CourtType;
import com.etips.models.enums.SeasonPart;

import java.io.Serializable;
import java.util.Date;

public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Date date;
    private Player player;
    private boolean played;
    private int points;
    private Club opposingClub;
    private CourtType courtType;
    private SeasonPart seasonPart;
    private Score score;

    public Game() {
    }

    public Game(Date date, Player player, boolean played, int points, Club opposingClub, CourtType courtType, SeasonPart seasonPart, Score score) {
        this(null, date, player, played, points, opposingClub, courtType, seasonPart, score);
    }

    public Game(Long id, Date date, Player player, boolean played, int points, Club opposingClub, CourtType courtType, SeasonPart seasonPart, Score score) {
        this.id = id;
        this.date = date;
        this.player = player;
        this.played = played;
        this.points = points;
        this.opposingClub = opposingClub;
        this.courtType = courtType;
        this.seasonPart = seasonPart;
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Player getPlayer() { return player; }

    public void setPlayer(Player player) { this.player = player; }

    public boolean isPlayed() {
        return played;
    }

    public void setPlayed(boolean played) {
        this.played = played;
    }

    public int getPoints() { return points; }

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
