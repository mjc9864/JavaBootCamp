package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Console;
import com.company.MichaelCirincioneU1Capstone2.Model.Processing;
import com.company.MichaelCirincioneU1Capstone2.Model.SalesTaxRate;
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
public class SalesTaxRateDaoTest {


    @Autowired
    SalesTaxRateDao salesTaxRateDao;


    @Test
    public void getSalesTaxRate() {

        SalesTaxRate salesTaxRate  = salesTaxRateDao.getSalesTaxRate("NJ");

        SalesTaxRate salesTaxRate1 = new SalesTaxRate();
        salesTaxRate1.setState("NJ");
        salesTaxRate1.setRate(new BigDecimal(0.05).setScale(2, RoundingMode.HALF_UP));

        salesTaxRate1 = salesTaxRateDao.getSalesTaxRate(salesTaxRate1.getState());
        assertEquals(salesTaxRate1, salesTaxRate);
    }


}