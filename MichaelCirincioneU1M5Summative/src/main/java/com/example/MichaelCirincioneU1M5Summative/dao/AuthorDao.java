package com.example.MichaelCirincioneU1M5Summative.dao;

import com.example.MichaelCirincioneU1M5Summative.model.Author;

import java.util.List;

public interface AuthorDao {

    Author addAuthor(Author author);

    List<Author> getAllAuthors();

    Author getAuthor(int id);

    void updateAuthor(Author author);

    void deleteAuthor(int id);





}
