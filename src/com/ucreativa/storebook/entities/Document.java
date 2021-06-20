package com.ucreativa.storebook.entities;

public abstract class Document {

    private String type;
    private String editorial;
    private String edicion;
    private int paginas;
    private String anio;
    private String titulo;

    public Document(String type, String editorial, String edicion, int paginas, String anio, String titulo) {
        this.type = type;
        this.editorial = editorial;
        this.edicion = edicion;
        this.paginas = paginas;
        this.anio = anio;
        this.titulo = titulo;
    }

    public String getType() {
        return type;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getAnio() {
        return anio;
    }

    public String getTitulo() {
        return titulo;
    }

}
