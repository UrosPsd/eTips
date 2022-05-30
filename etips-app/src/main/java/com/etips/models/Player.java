package com.etips.models;

import com.etips.models.enums.PlayerForm;

import java.io.Serializable;
import java.security.PrivilegedAction;
import java.util.List;

public class Player implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String surname;
    private Club club;
    private boolean injury;
    private List<Game> gamesPlayed;
    private PlayerForm playerForm;

    public Player() {
    }

    public Player(String name, String surname, Club club, List<Game> gamesPlayed) {
        this(null, name, surname, club, gamesPlayed);
    }

    public Player(Long id, String name, String surname, Club club, List<Game> gamesPlayed) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.club = club;
        this.gamesPlayed = gamesPlayed;
        this.injury = false;
        this.playerForm = PlayerForm.NA;
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

    public PlayerForm getPlayerForm() {
        return playerForm;
    }

    public void setPlayerForm(PlayerForm playerForm) {
        this.playerForm = playerForm;
    }
}
