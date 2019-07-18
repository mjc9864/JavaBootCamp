package com.company.MichaelCirincioneU1Capstone2.Dao;

import com.company.MichaelCirincioneU1Capstone2.Model.TShirt;

import java.util.List;

public interface TShirtDao {

    TShirt addTShirt(TShirt tShirt);

    TShirt getTShirt(int tShirtID);

    List<TShirt> getTShirtByColor(String color);

    List<TShirt> getTShirtBySize(String size);

    List<TShirt> getAllTShirt();

    TShirt updateTShirt(TShirt tShirt);

    void deleteTShirt(int tShirtID);

}