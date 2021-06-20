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

    public String getTematica() {
        return tematica;
    }

    public String getNumeroRevista() {
        return numeroRevista;
    }

    public String getResponsables() {
        return responsables;
    }

    public String getISSN() {
        return ISSN;
    }

}
