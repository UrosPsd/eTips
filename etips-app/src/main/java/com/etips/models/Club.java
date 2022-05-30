package com.etips.models;

import com.etips.models.enums.ClubDefense;

import java.io.Serializable;
import java.util.List;

public class Club implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String city;
    private List<Game> gamesPlayed;
    private float averagePointsReceived;
    private ClubDefense clubDefense;

    public Club() {
    }

    public Club(String name, String city, List<Game> gamesPlayed) {
        this(null, name, city, gamesPlayed);
    }

    public Club(Long id, String name, String city, List<Game> gamesPlayed) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.gamesPlayed = gamesPlayed;
        setAveragePointsReceived();
        this.clubDefense = ClubDefense.NA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Game> getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(List<Game> gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public float getAveragePointsReceived() {
        return averagePointsReceived;
    }

    private void setAveragePointsReceived() {
        int sum = 0;
        for (Game game : gamesPlayed)
            sum += game.getScore().getPointsReceived();
        this.averagePointsReceived = sum / gamesPlayed.size();
    }

    public void setAveragePointsReceived(float averagePointsReceived) {
        this.averagePointsReceived = averagePointsReceived;
    }

    public ClubDefense getClubDefense() {
        return clubDefense;
    }

    public void setClubDefense(ClubDefense clubDefense) {
        this.clubDefense = clubDefense;
    }
}
