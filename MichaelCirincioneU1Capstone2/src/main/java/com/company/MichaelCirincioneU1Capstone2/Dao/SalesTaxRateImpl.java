package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.SalesTaxRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class SalesTaxRateImpl implements SalesTaxRateDao{


    private final JdbcTemplate jdbcTemplate;



    private static final String SELECT_SALESTAXRATE_SQL =
            "select * from sales_tax_rate where state = ?";



    @Autowired
    public SalesTaxRateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }



    @Override
    public SalesTaxRate getSalesTaxRate(String state) {

        try {
            return jdbcTemplate.queryForObject(SELECT_SALESTAXRATE_SQL, this::mapRowToConsole,state);
        } catch (EmptyResultDataAccessException e){
            return null;}
    }



    private SalesTaxRate mapRowToConsole(ResultSet rs, int rowNum) throws SQLException {
        SalesTaxRate salesTaxRate = new SalesTaxRate();
        salesTaxRate.setState(rs.getString("state"));
        salesTaxRate.setRate(rs.getBigDecimal("rate"));


        return salesTaxRate;
    }
}
