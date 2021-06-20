package com.ucreativa.storebook.entities;

public class Book extends Document{

    private String author;
    private String ISBN;
    private String area;

    public Book(String type, String editorial, String edicion, int paginas, String anio, String titulo, String author,String ISBN, String area) {
        super(type, editorial, edicion, paginas, anio, titulo);
        this.author = author;
        this.ISBN = ISBN;
        this.area = area;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getArea() {
        return area;
    }

}
