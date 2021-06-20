package com.ucreativa.storebook.repositories;

import com.ucreativa.storebook.entities.Book;
import com.ucreativa.storebook.entities.Magazine;

import java.util.Date;
import java.util.List;

/*
 *   Esta clase es de tipo interface
 *   Aloja metodos y contantes que son necesarios para aquellas clases que lo implementan o de aquella clase que necesit
 *   e de las constantes glabales de la aplicacion.
 *   @author: Adolfo Zapata
 *   @version: 20/06/2021/A
 */

public interface Repository {

    /*
     * Constantes Globales: inicializan los nombre de los archivos que se van utilizar como Reportes de la aplicacion.
     */
    String FILE_PATH_TODO     = "db_TodosLosDocumentos.txt";
    String FILE_PATH_BOOK     = "db_Book.txt";
    String FILE_PATH_MAGAZINE = "db_Magazine.txt";

    /*
     * Metodos que se utilizan para guardar los datos de los objetos tipo Book y Magazine
     */
    void guardarDatosBook(Book documentBook, String cantidades, String Ubicacion, Date date);

    void guardarDatosMagazine(Magazine documentMaganize, String cantidades, String Ubicacion, Date date);

    /*
     * Listas para obtener los datos de los objetos, tipo: Document, Book, and Magazine
     */
    List<String> getDatosTodo();

    List<String> getDatosBook();

    List<String> getDatosMagazine();
}
