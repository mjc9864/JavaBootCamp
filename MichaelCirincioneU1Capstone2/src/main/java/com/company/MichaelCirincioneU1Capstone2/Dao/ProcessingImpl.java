package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Processing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProcessingImpl implements ProcessingDao{


    private final JdbcTemplate jdbcTemplate;


    private static final String SELECT_PROCESSING_SQL =
            "select * from processing_fee where product_type = ?";





    @Autowired
    public ProcessingImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public Processing getProcessing(String productType) {

        try {
            return jdbcTemplate.queryForObject(SELECT_PROCESSING_SQL, this::mapRowToConsole,productType);
        } catch (EmptyResultDataAccessException e){
            return null;}
    }


    private Processing mapRowToConsole(ResultSet rs, int rowNum) throws SQLException {
        Processing processing = new Processing();
        processing.setProductType(rs.getString("product_type"));
        processing.setFee(rs.getBigDecimal("fee"));


        return processing;
    }

}