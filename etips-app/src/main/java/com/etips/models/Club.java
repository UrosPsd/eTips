package com.etips.models;

import java.util.List;

public class Club {

    private String name;
    private String city;
    private List<Game> gamesPlayed;

    public Club() {
    }

    public Club(String name, String city, List<Game> gamesPlayed) {
        this.name = name;
        this.city = city;
        this.gamesPlayed = gamesPlayed;
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
}
