package com.ucreativa.storebook.entities;

import java.util.Date;

public class BitacoraDocumentos {

    private Date fecha;
    private int cantidad;
    private String ubicacion;
    private Document document;

    public BitacoraDocumentos(Document document, Date fecha, int cantidad, String ubicacion) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.ubicacion = ubicacion;
        this.document = document;
    }

    public Date getFecha() {
        return fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Document getDocument() {
        return document;
    }

}
