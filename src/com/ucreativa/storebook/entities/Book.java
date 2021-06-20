package com.ucreativa.storebook.entities;

public class Book extends Document{

    private String author;
    private Long ISBN;
    private String area;

    public Book(String type, String editorial, String edicion, int paginas, String anio, String titulo, String author,Long ISBN, String area) {
        super(type, editorial, edicion, paginas, anio, titulo);
        this.author = author;
        this.ISBN = ISBN;
        this.area = area;
    }


}
