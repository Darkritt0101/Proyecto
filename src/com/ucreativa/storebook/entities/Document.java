package com.ucreativa.storebook.entities;

/*
 *   Esta clase define objetos que contienen documentos, y se crean sus atributos al momento de crear el objeto
 *   @author: Adolfo Zapata
 *   @version: 20/06/2021/A
 */

public abstract class Document {

    //Atributos de la clase
    private String tipo;
    private String editorial;
    private String edicion;
    private int    paginas;
    private String anio;
    private String titulo;

    /*
     *   Constructor de la clase document
     *   @param tipo, editorial, edicion, anio, titulo - Atributos de tipo String que tienen en comun cualquier tipo de
     *   documento.
     *   @param paginas parametro tipo entero para el numero de paginas que tiene un documento
     */
    public Document(String tipo, String editorial, String edicion, int paginas, String anio, String titulo) {
        this.tipo = tipo;
        this.editorial = editorial;
        this.edicion = edicion;
        this.paginas = paginas;
        this.anio = anio;
        this.titulo = titulo;
    }

    /*
     *   Metodo que devuelte el texto tipo del documento
     *   @return devuelve el tipo de documento
     */
    public String getTipo() {
        return tipo;
    }

    /*
     *   Metodo que devuelte el texto editorial del documento
     *   @return devuelve el editorial de documento
     */
    public String getEditorial() {
        return editorial;
    }

    /*
     *   Metodo que devuelte el texto edicion del documento
     *   @return devuelve el edicion de documento
     */
    public String getEdicion() {
        return edicion;
    }

    /*
     *   Metodo que devuelte el entero Paginas del documento
     *   @return devuelve las paginas de documento
     */
    public int getPaginas() {
        return paginas;
    }

    /*
     *   Metodo que devuelte el texto Año de publicacion del documento
     *   @return devuelve el año de documento
     */
    public String getAnio() {
        return anio;
    }

    /*
     *   Metodo que devuelte el texto titulo de cualquier tipo de documento
     *   @return devuelve el titulo del documento
     */
    public String getTitulo() {
        return titulo;
    }

}
