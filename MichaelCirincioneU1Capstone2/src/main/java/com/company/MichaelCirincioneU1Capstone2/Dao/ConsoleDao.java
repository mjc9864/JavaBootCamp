package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.Console;

import java.util.List;

public interface ConsoleDao {

    Console addConsole(Console console);

    Console getConsole(int consoleID);

    List<Console> getAllConsoles();

    List<Console> getConsoleByManufacturer(String manufacturer);

    Console updateConsole(Console console);

    void deleteConsole(int consoleID);

}
