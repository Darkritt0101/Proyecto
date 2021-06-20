package com.ucreativa.storebook.ui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrontEnd extends JFrame {

    private JPanel     mainPanel;
    private JLabel     lblTituloApp;
    private JTextField txtTitulo;
    private JTextField txtEditorial;
    private JTextField txtEdicion;
    private JTextField txtAutor;
    private JTextField txtAnio;
    private JTextField txtPaginas;
    private JTextField txtTipo;
    private JTextField txtArea;
    private JLabel     lblTitulo;
    private JTextField txtISBN;
    private JTextField txtNumeroRevista;
    private JTextField txtResponsable;
    private JTextField txtTematica;
    private JButton    btnGuardar;
    private JCheckBox  chkBook;
    private JCheckBox  chkMagazine;
    private JLabel     lblEdicion;
    private JLabel     lblAnio;
    private JLabel     lblTipo;
    private JLabel     lblISBN;
    private JLabel     lblResponsable;
    private JLabel     lblEditorial;
    private JLabel     lblAutor;
    private JLabel     lblPaginas;
    private JLabel     lblArea;
    private JLabel     lblNumeroRevista;
    private JLabel     lblTematica;
    private JButton    btnReporte;
    private JTextField txtISSN;
    private JLabel     lblISSN;

    public FrontEnd(String titulo) {
        super(titulo);
    }

    public void buildForm() {
        this.buildScreen();
        this.components();
        this.setVisible(true);
    }

    private void components() {

        //evento agregado al check de book
        chkBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarTodoTxtField();
                chkMagazine.setSelected(false);

                //enable - txtfield Book
                txtAutor.setEnabled(true);
                txtAutor.setBackground(new Color(255, 255, 255));
                txtArea.setEnabled(true);
                txtArea.setBackground(new Color(255, 255, 255));
                txtISBN.setEnabled(true);
                txtISBN.setBackground(new Color(255, 255, 255));

                //not enable - txtfield Magazine
                txtNumeroRevista.setEnabled(false);
                txtNumeroRevista.setBackground(new Color(192, 192, 192));
                txtResponsable.setEnabled(false);
                txtResponsable.setBackground(new Color(192, 192, 192));
                txtTematica.setEnabled(false);
                txtTematica.setBackground(new Color(192, 192, 192));
                txtISSN.setEnabled(false);
                txtISSN.setBackground(new Color(192, 192, 192));

            }
        });

        //evento agregado al check de magazine
        chkMagazine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarTodoTxtField();
                chkBook.setSelected(false);

                //enable - txtfield Magazine
                txtNumeroRevista.setEnabled(true);
                txtNumeroRevista.setBackground(new Color(255, 255, 255));
                txtResponsable.setEnabled(true);
                txtResponsable.setBackground(new Color(255, 255, 255));
                txtTematica.setEnabled(true);
                txtTematica.setBackground(new Color(255, 255, 255));
                txtISSN.setEnabled(true);
                txtISSN.setBackground(new Color(255, 255, 255));

                //not enable - txtfield Book
                txtAutor.setEnabled(false);
                txtAutor.setBackground(new Color(192, 192, 192));
                txtArea.setEnabled(false);
                txtArea.setBackground(new Color(192, 192, 192));
                txtISBN.setEnabled(false);
                txtISBN.setBackground(new Color(192, 192, 192));
            }
        });

    }

    private void limpiarTodoTxtField() {
        //txtfield documents
        txtTitulo.setText("");
        txtEditorial.setText("");
        txtEdicion.setText("");
        txtAnio.setText("");
        txtPaginas.setText("");
        txtTipo.setText("");

        //txtfield book
        txtAutor.setText("");
        txtArea.setText("");
        txtISBN.setText("");

        //txtfield magazine
        txtNumeroRevista.setText("");
        txtResponsable.setText("");
        txtTematica.setText("");
        txtISSN.setText("");
    }

    private void buildScreen() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(500, 299);
        this.setLocationRelativeTo(null); //centrar el formulario al centro de la pantalla
    }


}
