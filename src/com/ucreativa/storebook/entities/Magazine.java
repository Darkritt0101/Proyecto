package com.ucreativa.storebook.entities;

public class Magazine extends Document{

    private String tematica;
    private String numeroRevista;
    private String responsables;
    private String ISSN;

    public Magazine(String type, String editorial, String edicion, int paginas, String anio,
                    String titulo, String tematica, String numeroRevista, String responsables, String ISSN) {
        super(type, editorial, edicion, paginas, anio, titulo);
        this.tematica = tematica;
        this.numeroRevista = numeroRevista;
        this.responsables = responsables;
        this.ISSN= ISSN;
    }
}
