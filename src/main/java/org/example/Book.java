package org.example;

public class Book {
    private String author;
    private String name;
    private long id;

    private double rating;
    private int countRating;

    public Book(String author, String name, Long id) {
        this.author = author;
        this.name = name;
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}