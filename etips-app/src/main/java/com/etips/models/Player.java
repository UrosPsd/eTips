package com.etips.models;

import java.util.List;

public class Player {

    private String name;
    private String surname;
    private Club club;
    private boolean injury;
    private List<Game> gamesPlayed;

    public Player() {
    }

    public Player(String name, String surname, Club club, boolean injury, List<Game> gamesPlayed) {
        this.name = name;
        this.surname = surname;
        this.club = club;
        this.injury = injury;
        this.gamesPlayed = gamesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public boolean isInjury() {
        return injury;
    }

    public void setInjury(boolean injury) {
        this.injury = injury;
    }

    public List<Game> getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(List<Game> gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
}
