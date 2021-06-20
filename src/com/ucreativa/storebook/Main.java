package com.ucreativa.storebook;

import com.ucreativa.storebook.ui.FrontEnd;

/*
 *   Esta clase es el cuerpo principal de la aplicacion, desde aqui se ejecuta el codigo
 *   @author: Adolfo Zapata
 *   @version: 20/06/2021/A
 */

public class Main {

    public static void main(String[] args) {
        FrontEnd fe = new FrontEnd("Registros de Libros");
        fe.buildForm(); //contruir formulario
    }
}
