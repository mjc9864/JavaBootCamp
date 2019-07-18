package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Console;
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
public class ConsoleDaoTest {

    @Autowired
    ConsoleDao consoleDao;


    @Before
    public void setUp() throws Exception {
        List<Console> consoles = consoleDao.getAllConsoles();
        for (Console console : consoles) {
            consoleDao.deleteConsole(console.getConsoleID());
        }
    }

    @Test
    public void addGetDeleteConsole() {
        Console console = new Console();
        console.setModel("model1");
        console.setManufacturer("manf1");
        console.setMemoryAmount("mem1");
        console.setProcessor("proc1");
        console.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        console.setQuantity(4);

        console = consoleDao.addConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleID());
        assertEquals(console1, console);

        consoleDao.deleteConsole(console.getConsoleID());
        console1 = consoleDao.getConsole(console.getConsoleID());
        assertNull(console1);



    }



    @Test
    public void getAllConsoles() {
        Console console = new Console();
        console.setModel("model1");
        console.setManufacturer("manf1");
        console.setMemoryAmount("mem1");
        console.setProcessor("proc1");
        console.setPrice(new BigDecimal(12.12));
        console.setQuantity(4);

        console = consoleDao.addConsole(console);

        console = new Console();
        console.setModel("model2");
        console.setManufacturer("manf2");
        console.setMemoryAmount("mem2");
        console.setProcessor("proc2");
        console.setPrice(new BigDecimal(132.132));
        console.setQuantity(43);

        console = consoleDao.addConsole(console);

        List<Console> consoleList = consoleDao.getAllConsoles();
        assertEquals(2, consoleList.size());

    }

    @Test
    public void getConsoleByManufacturer() {

        Console console = new Console();
        console.setModel("model1");
        console.setManufacturer("manf1");
        console.setMemoryAmount("mem1");
        console.setProcessor("proc1");
        console.setPrice(new BigDecimal(12.12));
        console.setQuantity(4);

        console = consoleDao.addConsole(console);

        console = new Console();
        console.setModel("model2");
        console.setManufacturer("manf2");
        console.setMemoryAmount("mem2");
        console.setProcessor("proc2");
        console.setPrice(new BigDecimal(132.132));
        console.setQuantity(43);

        console = consoleDao.addConsole(console);

        List<Console> consoleList = consoleDao.getConsoleByManufacturer("manf1");

        assertEquals(consoleList.size(),1);

        consoleList = consoleDao.getConsoleByManufacturer("shouldntexist");

        assertEquals(consoleList.size(),0);


    }

    @Test
    public void updateConsole() {
        Console console = new Console();
        console.setModel("model1");
        console.setManufacturer("manf1");
        console.setMemoryAmount("mem1");
        console.setProcessor("proc1");
        console.setPrice(new BigDecimal(12.12).setScale(2, RoundingMode.HALF_UP));
        console.setQuantity(4);

        console = consoleDao.addConsole(console);

        console.setModel("model145");

        consoleDao.updateConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleID());
        assertEquals(console1, console);


    }

}