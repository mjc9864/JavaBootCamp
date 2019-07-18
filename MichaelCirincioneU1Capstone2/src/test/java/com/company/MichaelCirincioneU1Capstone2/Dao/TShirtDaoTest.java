package com.company.MichaelCirincioneU1Capstone2.Dao;


import com.company.MichaelCirincioneU1Capstone2.Model.TShirt;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TShirtDaoTest {

    @Autowired
    TShirtDao tShirtDao;

    @Before
    public void setUp() throws Exception {
        List<TShirt> tShirts = tShirtDao.getAllTShirt();
        for (TShirt tShirt : tShirts) {
            tShirtDao.deleteTShirt(tShirt.gettShirtID());
        }
    }

    @Test
    public void addGetDeleteTShirt() {

        TShirt tShirt = new TShirt();
        tShirt.setSize("size1");
        tShirt.setColor("color1");
        tShirt.setDescription("desc1");
        tShirt.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        tShirt.setQuantity(4);

        tShirt = tShirtDao.addTShirt(tShirt);

        TShirt tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtID());
        assertEquals(tShirt1, tShirt);

        tShirtDao.deleteTShirt(tShirt.gettShirtID());
        tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtID());
        assertNull(tShirt1);
    }

    @Test
    public void getTShirtByColor() {
    }

    @Test
    public void getTShirtBySize() {
    }

    @Test
    public void getAllTShirt() {

        TShirt tShirt = new TShirt();
        tShirt.setSize("size1");
        tShirt.setColor("color1");
        tShirt.setDescription("desc1");
        tShirt.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        tShirt.setQuantity(4);

        tShirt = tShirtDao.addTShirt(tShirt);


        tShirt = new TShirt();
        tShirt.setSize("size2");
        tShirt.setColor("color2");
        tShirt.setDescription("desc2");
        tShirt.setPrice(new BigDecimal(123.123).setScale(2, RoundingMode.HALF_UP));
        tShirt.setQuantity(6);

        tShirt = tShirtDao.addTShirt(tShirt);

        List<TShirt> tShirtList = tShirtDao.getAllTShirt();
        assertEquals(2, tShirtList.size());


    }

    @Test
    public void updateTShirt() {

        TShirt tShirt = new TShirt();
        tShirt.setSize("size1");
        tShirt.setColor("color1");
        tShirt.setDescription("desc1");
        tShirt.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        tShirt.setQuantity(4);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt.setSize("size3");

        tShirtDao.updateTShirt(tShirt);

        TShirt tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtID());
        assertEquals(tShirt1, tShirt);


    }

}