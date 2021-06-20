package com.ucreativa.storebook.repositories;

import com.ucreativa.storebook.entities.Book;
import com.ucreativa.storebook.entities.Document;
import com.ucreativa.storebook.entities.Magazine;

import java.util.Date;
import java.util.List;

public interface Repository {
    void guardarDatosBook(Book documentBook,  String cantidades, String Ubicacion, Date date);
    void guardarDatosMagazine(Magazine documentMaganize, String cantidades, String Ubicacion, Date date);
    List<String> getDatosTodo();
    List<String> getDatosBook();
    List<String> getDatosMagazine();

    String FILE_PATH_TODO = "db_TodosLosDocumentos.txt";
    String FILE_PATH_BOOK = "db_Book.txt";
    String FILE_PATH_MAGAZINE = "db_Magazine.txt";
}
