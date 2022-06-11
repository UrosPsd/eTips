package com.etips.models;

import java.util.List;

public class GamesHelper {

    private List<Game> allGames;

    public GamesHelper() {
    }

    public GamesHelper(List<Game> allGames) {
        this.allGames = allGames;
    }

    public List<Game> getAllGames() {
        return allGames;
    }

    public void setAllGames(List<Game> allGames) {
        this.allGames = allGames;
    }
}
