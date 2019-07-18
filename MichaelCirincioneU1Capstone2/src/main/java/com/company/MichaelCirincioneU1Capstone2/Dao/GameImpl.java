package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Game;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class GameImpl implements GameDao {


    private final JdbcTemplate jdbcTemplate;

    private static final String INSERT_GAME_SQL =
            "insert into game (title, esrb_rating, description, price, studio, quantity) values (?, ?, ?, ?, ?, ?)";

    private static final String SELECT_GAME_SQL =
            "select * from game where game_id = ?";

    private static final String SELECT_ALL_GAME_SQL =
            "select * from game";

    private static final String UPDATE_GAME_SQL =
            "update game set title = ?, esrb_rating = ?, description = ?, price = ?," +
                    " studio = ?, quantity = ? where game_id = ?";

    private static final String DELETE_GAME_SQL =
            "delete from game where game_id = ?";

    private static final String SELECT_GAME_BY_TITLE_SQL =
            "select * from game where title = ?";

    private static final String SELECT_GAME_BY_ESRBRATING_SQL =
            "select  * from game where esrb_rating= ?";

    private static final String SELECT_GAME_BY_STUDIO_SQL =
            "select  *  from game where studio = ?";





    @Autowired
    public GameImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Game> getGameByTitle(String title) {
        return null;
    }

    @Override
    public List<Game> getGameByEsrbRating(String esrbRating) {
        return null;
    }

    @Override
    public List<Game> getGameByStudio(String studio) {
        return null;
    }


    @Override
    public Game addGame(Game game) {

        jdbcTemplate.update(INSERT_GAME_SQL,
                game.getTitle(),
                game.getEsrbRating(),
                game.getDescription(),
                game.getPrice(),
                game.getStudio(),
                game.getQuantity());

        int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()",Integer.class);
        game.setGameID(id);

        return game;



    }

    @Override
    public Game getGame(int gameID) {
        try {
            return jdbcTemplate.queryForObject(SELECT_GAME_SQL, this::mapRowToConsole,gameID);
        } catch (EmptyResultDataAccessException e){
            return null;}
    }

    @Override
    public List<Game> getAllGames() {

        return jdbcTemplate.query(SELECT_ALL_GAME_SQL, this::mapRowToConsole);


    }

    @Override
    public Game updateGame(Game game) {

        jdbcTemplate.update(UPDATE_GAME_SQL,
                game.getTitle(),
                game.getEsrbRating(),
                game.getDescription(),
                game.getPrice(),
                game.getStudio(),
                game.getQuantity(),
                game.getGameID());

        return game;

    }


    @Override
    public void deleteGame(int gameID) {

        jdbcTemplate.update(DELETE_GAME_SQL, gameID);
    }

    private Game mapRowToConsole(ResultSet rs, int rowNum) throws SQLException {
        Game game = new Game();
        game.setGameID(rs.getInt("game_id"));
        game.setTitle(rs.getString("title"));
        game.setEsrbRating(rs.getString("esrb_rating"));
        game.setDescription(rs.getString("description"));
        game.setPrice(rs.getBigDecimal("price"));
        game.setStudio(rs.getString("studio"));
        game.setQuantity(rs.getInt("quantity"));

        return game;
    }

}
