package com.example.MichaelCirincioneU1M5Summative.dao;


import com.example.MichaelCirincioneU1M5Summative.model.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AuthorDaoTest {
    @Autowired
    AuthorDao AuthorDao;
    @Autowired
    BookDao BookDao;
    @Autowired
    PublisherDao PublisherDao;

    @Before
    public void setUp() throws Exception {

        List<Book> bookList = BookDao.getAllBooks();
        for (Book book : bookList) {
            BookDao.deleteBook(book.getBookId());
        }

        List<Publisher> pubList = PublisherDao.getAllPublishers();
        for (Publisher pub : pubList) {
            PublisherDao.deletePublisher(pub.getPublisherId());
        }

        List<Author> authorList = AuthorDao.getAllAuthors();
        for (Author author : authorList) {
            AuthorDao.deleteAuthor(author.getAuthor_id());
        }
    }


    @Test
    public void addGetDeletePublisher() {
        Author author = new Author();
        author.setFirstName("Mike");
        author.setLastName("Steele");
        author.setStreet("123 Street");
        author.setCity("City");
        author.setState("NY");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("My@email.com");

        author = AuthorDao.addAuthor(author);
        Author author2 = AuthorDao.getAuthor(author.getAuthor_id());

        assertEquals(author2, author);

        AuthorDao.deleteAuthor(author.getAuthor_id());

        author2 = AuthorDao.getAuthor(author.getAuthor_id());

        assertNull(author2);


    }

    @Test
    public void getAllAuthors() {
        Author author = new Author();
        author.setFirstName("steven");
        author.setLastName("duffield");
        author.setStreet("321 Street");
        author.setCity("MyTown");
        author.setState("NJ");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("my@email.com");

        AuthorDao.addAuthor(author);

        author = new Author();
        author.setFirstName("Parmesan");
        author.setLastName("Don");
        author.setStreet("123 fake Street");
        author.setCity("Big town");
        author.setState("NY");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("my@email.com");

        AuthorDao.addAuthor(author);

        List<Author> authorList = AuthorDao.getAllAuthors();

        assertEquals(authorList.size(), 2);

    }

    @Test
    public void updateAuthor() {
        Author author = new Author();
        author.setFirstName("Kent");
        author.setLastName("Brockman");
        author.setStreet("My Street");
        author.setCity("HoustonLantaVegas");
        author.setState("TX");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("my@email.com");


        author = AuthorDao.addAuthor(author);

        author.setFirstName("Jefe");
        author.setLastName("Dequeso");
        author.setStreet("Mystreet");
        author.setCity("mycity");
        author.setState("OH");

        AuthorDao.updateAuthor(author);

        Author author2 = AuthorDao.getAuthor(author.getAuthor_id());

        assertEquals(author2, author);
    }

}