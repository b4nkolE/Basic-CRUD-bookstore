package com.bankole;

import jakarta.persistence.*;

import java.util.Objects;


@Entity
public class BookStore {

    @Id
    @SequenceGenerator(
            name =  "book_id_sequence",
            sequenceName = "book_id_sequence",
            allocationSize = 1

    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "book_id_sequence"
    )

    private Integer id;
    private String title;
    private String author;
    private Integer price;
    private String genre;

    public BookStore(Integer id, String title, String author, Integer price, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
    }

    public BookStore() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookStore bookStore = (BookStore) o;
        return Objects.equals(id, bookStore.id) && Objects.equals(title, bookStore.title) && Objects.equals(author, bookStore.author) && Objects.equals(price, bookStore.price) && Objects.equals(genre, bookStore.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, price, genre);
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                '}';
    }
}
