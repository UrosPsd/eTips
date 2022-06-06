package com.etips.models;

public class OffRating {
    private Club club;
    private double average;

    public OffRating(Club club, double average) {
        this.club = club;
        this.average = average;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
