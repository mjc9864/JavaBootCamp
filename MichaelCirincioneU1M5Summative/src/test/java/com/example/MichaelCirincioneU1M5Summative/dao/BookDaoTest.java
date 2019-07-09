package com.example.MichaelCirincioneU1M5Summative.dao;


import com.example.MichaelCirincioneU1M5Summative.model.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.dao.DataIntegrityViolationException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookDaoTest {

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
    public void addGetDeleteBook() {

        Publisher publisher = new Publisher();
        publisher.setName("waldo");
        publisher.setStreet("name of street");
        publisher.setCity("capitol");
        publisher.setState("MN");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("my@email.com");

        publisher = PublisherDao.addPublisher(publisher);

        Author author = new Author();
        author.setFirstName("Cloud");
        author.setLastName("Strife");
        author.setStreet("midgar");
        author.setCity("Aerith");
        author.setState("NC");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("Tifa@Lockeheart.com");

        author = AuthorDao.addAuthor(author);

        Book book = new Book();
        book.setIsbn("100");
        book.setPublish_date(LocalDate.of(1989, 06, 06));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("titleoftitle");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("45.45"));

        book = BookDao.addBook(book);

        Book book2 = BookDao.getBook(book.getBookId());

        assertEquals(book2, book);

        BookDao.deleteBook(book.getBookId());

        book2 = BookDao.getBook(book.getBookId());

        assertNull(book2);

    }


    @Test
    public void getAllBooks() {
        Publisher publisher = new Publisher();
        publisher.setName("Barret");
        publisher.setStreet("main street");
        publisher.setCity("city wall");
        publisher.setState("GA");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("Houston@LantaVegas.com");

        publisher = PublisherDao.addPublisher(publisher);

        Author author = new Author();
        author.setFirstName("Mike");
        author.setLastName("Corlione");
        author.setStreet("houston");
        author.setCity("lantavegas");
        author.setState("MI");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("my@email.com");

        author = AuthorDao.addAuthor(author);

        Book book = new Book();
        book.setIsbn("564321");
        book.setPublish_date(LocalDate.of(1989, 06, 06));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("chicken and pizza");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("38.38"));

        book = BookDao.addBook(book);

        book = new Book();
        book.setIsbn("56789");
        book.setPublish_date(LocalDate.of(1989, 06, 06));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("chrome");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("25.25"));
        book = BookDao.addBook(book);

        List<Book> bookList = BookDao.getAllBooks();
        assertEquals(bookList.size(), 2);

    }


    @Test
    public void updateBook() {
        Publisher publisher = new Publisher();
        publisher.setName("Akon");
        publisher.setStreet("andYoungJeezy");
        publisher.setCity("BigBLue");
        publisher.setState("NJ");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("My@email.com");

        publisher = PublisherDao.addPublisher(publisher);

        Author author = new Author();
        author.setFirstName("michael");
        author.setLastName("cain");
        author.setStreet("between");
        author.setCity("twolions");
        author.setState("MI");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("teenage@mutantninjaturtles.com");

        author = AuthorDao.addAuthor(author);

        Book book = new Book();
        book.setIsbn("09123");
        book.setPublish_date(LocalDate.of(1989, 06, 06));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("newtitle");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("44.44"));

        book = BookDao.addBook(book);

        book.setIsbn("6789");
        book.setPublish_date(LocalDate.of(1989, 06, 06));
        book.setTitle("title");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("66.66"));

        BookDao.updateBook(book);

        Book book2 = BookDao.getBook(book.getBookId());

        assertEquals(book2, book);
    }


    @Test
    public void getBooksByAuthor() {

        Author author = new Author();
        author.setFirstName("Captain");
        author.setLastName("America");
        author.setStreet("123 street");
        author.setCity("big city");
        author.setState("MI");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("my@email.com");

        author = AuthorDao.addAuthor(author);

        Author author2 = new Author();
        author.setFirstName("Captain");
        author.setLastName("Planet");
        author.setStreet("street name");
        author.setCity("City name");
        author.setState("SD");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("my@email.com");

        author2 = AuthorDao.addAuthor(author2);

        Author author3 = new Author();
        author.setFirstName("john");
        author.setLastName("jameson");
        author.setStreet("whisky street");
        author.setCity("pub city");
        author.setState("NH");
        author.setPostalCode("08816");
        author.setPhone("1234567890");
        author.setEmail("my@email.com");

        author3 = AuthorDao.addAuthor(author3);

        Publisher publisher = new Publisher();
        publisher.setName("pubname");
        publisher.setStreet("pubstreet");
        publisher.setCity("pubcity");
        publisher.setState("RI");
        publisher.setPostalCode("08816");
        publisher.setPhone("1234567890");
        publisher.setEmail("my@email.com");

        publisher = PublisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("852369");
        book.setPublish_date(LocalDate.of(1989, 06, 06));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("totally a title");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("22.22"));

        BookDao.addBook(book);

        book = new Book();
        book.setIsbn("097325");
        book.setPublish_date(LocalDate.of(1989, 06, 06));
        book.setAuthorId(author.getAuthor_id());
        book.setTitle("title of title");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(new BigDecimal("11.11"));

        BookDao.addBook(book);

        Book book1 = new Book();
        book1.setIsbn("230823");
        book1.setPublish_date(LocalDate.of(1989, 06, 06));
        book1.setAuthorId(author2.getAuthor_id());
        book1.setTitle("my title");
        book1.setPublisherId(publisher.getPublisherId());
        book1.setPrice(new BigDecimal("67.67"));

        BookDao.addBook(book);

        List<Book> bookList = BookDao.getBooksByAuthor(author.getAuthor_id());
        assertEquals(bookList.size(), 2);

        List<Book> bookList2 = BookDao.getBooksByAuthor(author2.getAuthor_id());
        assertEquals(bookList2.size(), 1);

        List<Book> bookList3 = BookDao.getBooksByAuthor(author3.getAuthor_id());
        assertEquals(bookList3.size(), 0);

    }
}