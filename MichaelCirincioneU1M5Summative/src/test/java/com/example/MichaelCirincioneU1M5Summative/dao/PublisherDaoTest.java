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
public class PublisherDaoTest {
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
    public void addGetDeletePublisher(){

        Publisher publisher = new Publisher();
        publisher.setName("Mike");
        publisher.setStreet("MyStreet");
        publisher.setCity("TheCity");
        publisher.setState("AZ");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("My@email.com");

        publisher = PublisherDao.addPublisher(publisher);

        Publisher publisher2 = PublisherDao.getPublisher(publisher.getPublisherId());

        assertEquals(publisher, publisher2);

        PublisherDao.deletePublisher(publisher.getPublisherId());

        publisher2 = PublisherDao.getPublisher(publisher.getPublisherId());

        assertNull(publisher2);

    }

    @Test
    public void getAllPublishers() {
        Publisher publisher = new Publisher();
        publisher.setName("Jefe Queso Del Grande");
        publisher.setStreet("fake street");
        publisher.setCity("Mytown");
        publisher.setState("NY");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("My@email.com");

        PublisherDao.addPublisher(publisher);

        publisher = new Publisher();
        publisher.setName("pubname");
        publisher.setStreet("streetname");
        publisher.setCity("cityname");
        publisher.setState("NY");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("My@Email.com");

        PublisherDao.addPublisher(publisher);

        List<Publisher> publisherList = PublisherDao.getAllPublishers();

        assertEquals(publisherList.size(), 2);


    }


    @Test
    public void updatePublisher() {
        Publisher publisher = new Publisher();
        publisher.setName("Name");
        publisher.setStreet("Street");
        publisher.setCity("City");
        publisher.setState("NJ");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("my@email.com");

        publisher = PublisherDao.addPublisher(publisher);

        publisher.setName("Cloud");
        publisher.setStreet("midgar");
        publisher.setCity("asgard");
        publisher.setState("NJ");

        PublisherDao.updatePublisher(publisher);

        Publisher publisher2 = PublisherDao.getPublisher(publisher.getPublisherId());

        assertEquals(publisher2, publisher);
    }



}