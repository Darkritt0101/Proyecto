package com.ucreativa.storebook.entities;

/*
 *   Esta clase define un objeto tipo Book y sus atributos, hereda de la clase Document.
 *   @author: Adolfo Zapata
 *   @version: 20/06/2021/A
 */

public class Book extends Document {

    //Atributos de la clase
    private String author;
    private String ISBN;
    private String area;

    /*
     *   Constructor de la clase book
     *   @param type, editorial, edicion, paginas, anio, titulo, author, ISBN, area - atributos tipo texto que son atributos del objeto tipo Book
     *   @param int paginas - atributos tipo entero que es un atributo del objeto tipo book
     */
    public Book(String type, String editorial, String edicion, int paginas, String anio, String titulo, String author, String ISBN, String area) {
        super(type, editorial, edicion, paginas, anio, titulo);
        this.author = author;
        this.ISBN = ISBN;
        this.area = area;
    }

    /*
     *   Metodo que devuelte el texto author del Book
     *   @return devuelve un Author tipo texto
     */
    public String getAuthor() {
        return author;
    }

    /*
     *   Metodo que devuelte el texto ISBN del Book
     *   @return devuelve un ISBN tipo texto
     */
    public String getISBN() {
        return ISBN;
    }

    /*
     *   Metodo que devuelte el texto Area del Book
     *   @return devuelve un Area tipo texto
     */
    public String getArea() {
        return area;
    }

}
