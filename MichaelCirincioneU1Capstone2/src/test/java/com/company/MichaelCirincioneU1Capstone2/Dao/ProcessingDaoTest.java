package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Console;
import com.company.MichaelCirincioneU1Capstone2.Model.Processing;
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
public class ProcessingDaoTest {


    @Autowired
    ProcessingDao processingDao;





    @Test
    public void getProcessingFee() {

        Processing processingFee = processingDao.getProcessing("product1");

        Processing processingFee1 = new Processing();
        processingFee1.setProductType("product1");
        processingFee1.setFee(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));

        processingFee1 = processingDao.getProcessing(processingFee1.getProductType());
        assertEquals(processingFee1, processingFee);
    }


}