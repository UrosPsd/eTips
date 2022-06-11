package com.etips.models;

import com.etips.models.enums.ClubDefense;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.kie.api.definition.type.Position;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Club implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Position(0)
    private String name;
    @Column
    private String city;
    @OneToMany(mappedBy = "opposingClub",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Game> gamesPlayed;
    @Column(name = "average_points_received")
    private float averagePointsReceived;
    @Column(name = "club_defense")
    @Enumerated(EnumType.STRING)
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setClubDefense(ClubDefense clubDefense) {
        this.clubDefense = clubDefense;
    }
}
