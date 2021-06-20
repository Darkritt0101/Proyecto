package com.ucreativa.storebook.entities;

import java.util.Date;

/*
 *   Esta clase define un objeto tipo Bitacora Documentos, el cual incluira un objeto tipo Document
 *   @author: Adolfo Zapata
 *   @version: 20/06/2021/A
 */

public class BitacoraDocumentos {

    //Atributos de la clase
    private Date     fecha;
    private int      cantidad;
    private String   ubicacion;
    private Document document;

    /*
     *   Constructor de la clase Bitacora Documentos
     *   @param document tipo Document
     *   @param fecha devuelve una fecha, fecha en que se ingreso al sistema
     *   @param cantidad devuelve un entero, cantidad en existencia
     *   @param ubicacion devuelve un tipo texto, ubicacion en donde se encuentra el documento
     */
    public BitacoraDocumentos(Document document, Date fecha, int cantidad, String ubicacion) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.document = document;
    }

    /*
     *   Metodo que devuelte el texto tipo del documento
     *   @return devuelve fecha tipo Date
     */
    public Date getFecha() {
        return fecha;
    }

    /*
     *   Metodo que devuelte el texto tipo del documento
     *   @return devuelve la cantidad tipo entero
     */
    public int getCantidad() {
        return cantidad;
    }

    /*
     *   Metodo que devuelte el texto ubicacion del documento
     *   @return devuelve la ubicacion de del documento
     */
    public String getUbicacion() {
        return ubicacion;
    }

    /*
     *   Metodo que devuelte el documento tipo document
     *   @return devuelve el tipo de document
     */
    public Document getDocument() {
        return document;
    }

}
