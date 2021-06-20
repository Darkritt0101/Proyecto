
package com.ucreativa.storebook.repositories;
import com.ucreativa.storebook.entities.Book;
import com.ucreativa.storebook.entities.Document;
import com.ucreativa.storebook.entities.Magazine;

import javax.swing.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{

    private final String FILE_PATH_TODO = "db_TodosLosDocumentos.txt";
    private final String FILE_PATH_BOOK = "db_Book.txt";
    private final String FILE_PATH_MAGAZINE = "db_Magazine.txt";

    @Override
    public void guardarDatosBook(Book documentBook, String cantidades, String Ubicacion, Date fecha) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Document document;
        document = documentBook;
        String textoConsolidado = "**********\nISBN:" + documentBook.getISBN() + "\nTipo:" + document.getType() + "\nTitulo:" + document.getTitulo() + "\nAño:" + document.getAnio() + "\nEdicion:" +
                        document.getEdicion() + "\nPaginas:" + document.getPaginas() + "\nEditorial:" + document.getEditorial() + "\nAutor:" + documentBook.getAuthor() +
                        "\nArea:" + documentBook.getArea() + "\nCantidad:" + cantidades + "\nUbicacion:" + Ubicacion + "\nF.Registro:" + formatDate.format(fecha)+ "\n";
        String textoBook = "**********\nISBN:" + documentBook.getISBN() + "\nTipo:" + document.getType() + "\nTitulo:" + document.getTitulo() + "\nAño:" + document.getAnio() + "\nEdicion:" +
                document.getEdicion() + "\nPaginas:" + document.getPaginas() + "\nEditorial:" + document.getEditorial() + "\nAutor:" + documentBook.getAuthor() +
                "\nArea:" + documentBook.getArea() + "\nCantidad:" + cantidades + "\nUbicacion:" + Ubicacion + "\nF.Registro:" + formatDate.format(fecha) + "\n";
        try {

            BufferedWriter writer1 = new BufferedWriter(new FileWriter(FILE_PATH_TODO,true));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(FILE_PATH_BOOK,true));
            writer1.append(textoConsolidado);
            writer2.append(textoBook);
            writer1.close();
            writer2.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }


    }

    @Override
    public void guardarDatosMagazine(Magazine documentMagazine, String cantidades, String Ubicacion, Date fecha) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        Document document;
        document = documentMagazine;
        String textoConsolidado = "**********\nISSN:" + documentMagazine.getISSN() + "\nTipo:" + document.getType() + "\nTitulo:" + document.getTitulo() + "\nAño:" + document.getAnio() + "\nEdicion:" +
                document.getEdicion() + "\nPaginas:" + document.getPaginas() + "\nEditorial:" + document.getEditorial() + "\nTematica::" + documentMagazine.getTematica() +
                "\n#Revista:" + documentMagazine.getNumeroRevista() + "\nResponsable:" + documentMagazine.getResponsables() + "\nCantidad:" + cantidades + "\nUbicacion:" +
                Ubicacion + "\nF.Registro:" + formatDate.format(fecha)+ "\n";
        String textoMagazine = "**********\nISSN:" + documentMagazine.getISSN() + "\nTipo:" + document.getType() + "\nTitulo:" + document.getTitulo() + "\nAño:" + document.getAnio() + "\nEdicion:" +
                document.getEdicion() + "\nPaginas:" + document.getPaginas() + "\nEditorial:" + document.getEditorial() + "\nTematica::" + documentMagazine.getTematica() +
                "\n#Revista:" + documentMagazine.getNumeroRevista() + "\nResponsable:" + documentMagazine.getResponsables() + "\nCantidad:" + cantidades + "\nUbicacion:" +
                Ubicacion + "\nF.Registro:" + formatDate.format(fecha)+ "\n";
        try {
            BufferedWriter writer1 = new BufferedWriter(new FileWriter(FILE_PATH_TODO,true));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(FILE_PATH_MAGAZINE,true));
            writer1.append(textoConsolidado);
            writer1.close();
            writer2.append(textoMagazine);
            writer2.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public List<String> getDatosTodo() {
        try {
            BufferedReader reader=  new BufferedReader(new FileReader(FILE_PATH_TODO));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    public List<String> getDatosBook(){
        try {
            BufferedReader reader=  new BufferedReader(new FileReader(FILE_PATH_BOOK));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

    public List<String> getDatosMagazine(){
        try {
            BufferedReader reader=  new BufferedReader(new FileReader(FILE_PATH_MAGAZINE));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return null;
    }

}
