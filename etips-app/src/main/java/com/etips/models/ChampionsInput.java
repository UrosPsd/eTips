package com.etips.models;


public class ChampionsInput {

    private String champion;
    private Club bestClub;
    private Player bestPlayer;
    private String out;

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }

    public ChampionsInput() {}

    public ChampionsInput(String champion) {
        this.champion = champion;
    }

    public ChampionsInput(String champion, Club bestClub, Player bestPlayer) {
        this.champion = champion;
        this.bestClub = bestClub;
        this.bestPlayer = bestPlayer;
    }

    public String getChampion() {
        return champion;
    }

    public void setChampion(String champion) {
        this.champion = champion;
    }

    public Club getBestClub() {
        return bestClub;
    }

    public void setBestClub(Club bestClub) {
        this.bestClub = bestClub;
    }

    public Player getBestPlayer() {
        return bestPlayer;
    }

    public void setBestPlayer(Player bestPlayer) {
        this.bestPlayer = bestPlayer;
    }
}
