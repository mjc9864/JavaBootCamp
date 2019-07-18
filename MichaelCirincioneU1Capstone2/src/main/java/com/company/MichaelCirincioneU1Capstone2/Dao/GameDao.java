package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Game;

import java.util.List;

public interface GameDao {

    Game addGame(Game game);

    Game getGame(int gameID);

    List<Game> getAllGames();

    List<Game> getGameByTitle(String title);

    List<Game> getGameByEsrbRating(String esrbRating);

    List<Game> getGameByStudio(String studio);

    Game updateGame(Game game);

    void deleteGame(int gameID);

}