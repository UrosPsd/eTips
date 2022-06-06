package com.etips.models;

public class PlayerOffRating {
    private Player player;
    private double average;

    public PlayerOffRating(Player player, double average) {
        this.player = player;
        this.average = average;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
