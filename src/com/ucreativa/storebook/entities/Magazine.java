package com.ucreativa.storebook.entities;

/*
 *   Esta clase define un objeto tipo Magazine y sus atributos, hereda de la clase Document.
 *   @author: Adolfo Zapata
 *   @version: 20/06/2021/A
 */

public class Magazine extends Document {

    //Atributos de la clase
    private String tematica;
    private String numeroRevista;
    private String responsables;
    private String ISSN;

    /*
     *   Constructor de la clase book
     *   @param type, editorial, edicion String anio, titulo, tematica, numeroRevista, responsables, ISSN - atributos de un documento tipo Magazine, todos tipo texto
     *   @param paginas - atributos de un documento tipo Magazine, todos tipo texto
     */
    public Magazine(String type, String editorial, String edicion, int paginas, String anio,
                    String titulo, String tematica, String numeroRevista, String responsables, String ISSN) {
        super(type, editorial, edicion, paginas, anio, titulo);
        this.tematica = tematica;
        this.numeroRevista = numeroRevista;
        this.responsables = responsables;
        this.ISSN = ISSN;
    }

    /*
     *   Metodo que devuelte el texto Tematica del Magazine
     *   @return devuelve un Tematica tipo texto
     */
    public String getTematica() {
        return tematica;
    }

    /*
     *   Metodo que devuelte el texto Numero Revista del Magazine
     *   @return devuelve un Numero Revista tipo texto
     */
    public String getNumeroRevista() {
        return numeroRevista;
    }

    /*
     *   Metodo que devuelte el texto Responsables del Magazine
     *   @return devuelve un Responsables tipo texto
     */
    public String getResponsables() {
        return responsables;
    }

    /*
     *   Metodo que devuelte el texto ISSN del Magazine
     *   @return devuelve un ISSN tipo texto
     */
    public String getISSN() {
        return ISSN;
    }

}
