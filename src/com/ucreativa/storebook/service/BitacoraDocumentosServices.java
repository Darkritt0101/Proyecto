package com.ucreativa.storebook.service;

import com.ucreativa.storebook.entities.Book;
import com.ucreativa.storebook.entities.Magazine;
import com.ucreativa.storebook.repositories.Repository;

import javax.swing.*;
import java.io.*;
import java.util.Date;
import java.util.List;

public class BitacoraDocumentosServices {

    private Repository repository;
    private final String FILE_PATH_TODO = "db_TodosLosDocumentos.txt";

    public BitacoraDocumentosServices(Repository reporsitory){
        this.repository = reporsitory;
    }

    private String validarDatos(String searchKey){
    //encontrar el valor buscada en el archivo de base de datos
    //en caso de encontrarlo, indicar que se ha encontrado el datos, por tanto
    //no es necesario guardar el datos
        try {

            //evaluar si el archivo existe, en caso contrario , crea el archivo para la esctritura y lectura del mismo
            File file = new File (FILE_PATH_TODO);
            if (!file.exists()){
                file.createNewFile();
            }

            //busca en el archivo de consolidado el searchKey (ISBN o ISSN)
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH_TODO));
            String linea;
            while ((linea = reader.readLine())!=null){
                    if (linea.equalsIgnoreCase(searchKey)){
                        return "Encontrado";
                    }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "No_Encontrado";
    }

    private static boolean  esNumero(String texto){
        //devuelve un error si la conversion es incorrecta
        //entonces se captura el error para conocer si es numerico
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }

    public void guardarDatos (String type, String editorial, String edicion, String paginas, String anio, String titulo,
                              String author,String ISBN, String area,String tematica, String numeroRevista, String responsables, String ISSN,
                              String cantidades, String ubicacion, boolean book, boolean magazine) throws Exception{
        //evalua si hay cambpos en blancos para no proceder
        //bota el sistema.
        if (book) {
            if (type.equals("") | editorial.equals("") | edicion.equals("") | paginas.equals("") | anio.equals("") | titulo.equals("") | author.equals("") | ISBN.equals("") | area.equals("")) {
                throw new Exception("Hay Campos vacios");
            }
        }

        if (magazine) {
            if (type.equals("") | editorial.equals("") | edicion.equals("") | paginas.equals("") | anio.equals("") | titulo.equals("") | tematica.equals("") | numeroRevista.equals("") | ISSN.equals("")) {
                throw new Exception("Hay Campos vacios");
            }
        }


        if (!esNumero(paginas) | !esNumero(cantidades)){
            //evalua si los campos son numericos
            //en cualquiera de los casos que sea falso, se sale del proceso
            throw new Exception("Los campos:Cantidad y Paginas, son tipo numerico entero.");
        }

        Book documentBook;
        Magazine documentMagazine;
        int pagina = Integer.parseInt(paginas);
        String searchKeyISBN="ISBN:"+ ISBN;
        String searchKeyISSN="ISSN:" + ISSN;

        if(book){ //evalua si el registro ya esta ingresado en el sistema
            if (validarDatos(searchKeyISBN).equals("Encontrado")){
                JOptionPane.showMessageDialog(null,
                        "ISBN " + ISBN + " encontrado en los datos, por tanto no se puede guardar la linea.");
            }else{
                documentBook  = new Book(type, editorial, edicion, pagina, anio, titulo, author, ISBN, area);
                this.repository.guardarDatosBook(documentBook, cantidades, ubicacion, new Date());
            }
        }else if (magazine){//evalua si el registro ya esta ingresado en el sistema
            if (validarDatos(searchKeyISSN).equals("Encontrado")){
                JOptionPane.showMessageDialog(null,
                        "ISSN " + ISSN + " encontrado en los datos, por tanto no se puede guardar la linea.");
            }else{
                documentMagazine = new Magazine(type, editorial, edicion, pagina, anio, titulo, tematica, numeroRevista, responsables, ISSN);
                this.repository.guardarDatosMagazine(documentMagazine, cantidades, ubicacion, new Date());
            }
        }

    }

    List<String> getDatosTodo(){
            return this.repository.getDatosTodo();
    }

    List<String> getDatosBook(){
        return this.repository.getDatosBook();
    }

    List<String> getDatosMagazine(){
        return this.repository.getDatosMagazine();
    }


}
