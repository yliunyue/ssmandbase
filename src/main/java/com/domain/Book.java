package com.domain;

import java.util.Objects;

public class Book {
    private int bookId;
    private String bookName;
    private double price;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        if (Objects.equals(bookId, "")) {
            bookId = "0";
        }
        this.bookId = Integer.parseInt(bookId);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if (Objects.equals(bookName, "")) {
            bookName = null;
        }
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
