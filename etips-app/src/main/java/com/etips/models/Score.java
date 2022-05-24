package com.etips.models;

public class Score {
    private int pointsScored;
    private int pointsReceived;

    public Score() {
    }

    public Score(int pointsScored, int pointsReceived) {
        this.pointsScored = pointsScored;
        this.pointsReceived = pointsReceived;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public void setPointsScored(int pointsScored) {
        this.pointsScored = pointsScored;
    }

    public int getPointsReceived() {
        return pointsReceived;
    }

    public void setPointsReceived(int pointsReceived) {
        this.pointsReceived = pointsReceived;
    }
}
