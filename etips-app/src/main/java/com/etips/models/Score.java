package com.etips.models;

import javax.persistence.*;

@Entity
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "points_scored")
    private int pointsScored;
    @Column(name = "points_received")
    private int pointsReceived;

    public Score() {
    }

    public Score(int pointsScored, int pointsReceived) {
        this.pointsScored = pointsScored;
        this.pointsReceived = pointsReceived;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
