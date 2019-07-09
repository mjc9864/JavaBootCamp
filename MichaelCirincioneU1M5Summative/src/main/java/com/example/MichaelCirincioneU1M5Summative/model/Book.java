package com.example.MichaelCirincioneU1M5Summative.model;

import java.math.BigDecimal;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private int bookId;
    private String isbn;
    private LocalDate publish_date;
    private int authorId;
    private String title;
    private int publisherId;
    private BigDecimal price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(LocalDate publish_date) {
        this.publish_date = publish_date;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || getClass() != o.getClass()) return false;
        Book b = (Book) o;
        return getBookId() == b.getBookId() &&
                getAuthorId() == b.getAuthorId() &&
                getPublisherId() == b.getPublisherId() &&
                Objects.equals(getIsbn(), b.getIsbn()) &&
                Objects.equals(getPublish_date(), b.getPublish_date()) &&
                Objects.equals(getTitle(), b.getTitle()) &&
                Objects.equals(getPrice(), b.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), getIsbn(), getPublish_date(), getAuthorId(), getTitle(), getPublisherId(), getPrice());

    }
}
