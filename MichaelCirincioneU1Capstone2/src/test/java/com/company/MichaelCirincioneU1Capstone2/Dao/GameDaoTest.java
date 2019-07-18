package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Console;
import com.company.MichaelCirincioneU1Capstone2.Model.Game;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GameDaoTest {


    @Autowired
    GameDao gameDao;



    @Before
    public void setUp() throws Exception {

        List<Game> games = gameDao.getAllGames();
        for (Game game : games) {
            gameDao.deleteGame(game.getGameID());
        }

    }

    @Test
    public void addGetDeleteGame() {

        Game game = new Game();
        game.setTitle("title1");
        game.setEsrbRating("T");
        game.setDescription("desc1");
        game.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        game.setStudio("studio1");
        game.setQuantity(4);

        game = gameDao.addGame(game);

        Game game1 = gameDao.getGame(game.getGameID());
        assertEquals(game1, game);

        gameDao.deleteGame(game.getGameID());
        game1 = gameDao.getGame(game.getGameID());
        assertNull(game1);

    }


    @Test
    public void getAllGames() {

        Game game = new Game();
        game.setTitle("title1");
        game.setEsrbRating("T");
        game.setDescription("desc1");
        game.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        game.setStudio("studio1");
        game.setQuantity(4);

        game = gameDao.addGame(game);


        game = new Game();
        game.setTitle("title1");
        game.setEsrbRating("T");
        game.setDescription("desc1");
        game.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        game.setStudio("studio1");
        game.setQuantity(4);

        game = gameDao.addGame(game);

        List<Game> gameList = gameDao.getAllGames();
        assertEquals(2, gameList.size());

    }


    @Test
    public void getGameByTitle() {
    }

    @Test
    public void getGameByEsrbRating() {
    }

    @Test
    public void getGameByStudio() {
    }

    @Test
    public void updateGame() {

        Game game = new Game();
        game.setTitle("title1");
        game.setEsrbRating("T");
        game.setDescription("desc1");
        game.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        game.setStudio("studio1");
        game.setQuantity(4);

        game = gameDao.addGame(game);

        game.setTitle("title2");

        gameDao.updateGame(game);

        Game game1 = gameDao.getGame(game.getGameID());
        assertEquals(game1, game);


    }

    }


