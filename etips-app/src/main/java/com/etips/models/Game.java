package com.etips.models;

import com.etips.models.enums.CourtType;
import com.etips.models.enums.SeasonPart;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Game implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "date_played")
    private LocalDateTime date;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "player_id",insertable = false,updatable = false)
    private Player player;
    @Column
    private boolean played;
    @Column
    private int points;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "opposing_club_id",insertable = false,updatable = false)
    private Club opposingClub;
    @Column(name = "court_type")
    @Enumerated(EnumType.STRING)
    private CourtType courtType;
    @Column(name = "season_part")
    @Enumerated(EnumType.STRING)
    private SeasonPart seasonPart;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "score_id")
    private Score score;

    public Game() {
    }

    public Game(LocalDateTime date, Player player, boolean played, int points, Club opposingClub, CourtType courtType, SeasonPart seasonPart, Score score) {
        this(null, date, player, played, points, opposingClub, courtType, seasonPart, score);
    }

    public Game(Long id, LocalDateTime date, Player player, boolean played, int points, Club opposingClub, CourtType courtType, SeasonPart seasonPart, Score score) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
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

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", date=" + date +
                ", player=" + player +
                ", played=" + played +
                ", points=" + points +
                ", opposingClub=" + opposingClub +
                ", courtType=" + courtType +
                ", seasonPart=" + seasonPart +
                ", score=" + score +
                '}';
    }
}
