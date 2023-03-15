/*
 *   Copyright (c) 2023
 *   All rights reserved.
 */
package paquete2;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Ventana extends JFrame implements ActionListener {

    private JLabel lblTitulo;
    private JButton btnPanel1, btnPanel2;

    //instacias de los panel1 y panel2
    Panel1 miPanel1;
    Panel2 miPanel2;
    JScrollPane scrollPaneles;

    public Ventana(){
        setTitle("PRUEBA");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes(){

        miPanel1 = new Panel1();
        miPanel2 = new Panel2();

        scrollPaneles = new JScrollPane();
        scrollPaneles.setBounds(5, 112, 400, 400);

        lblTitulo = new  JLabel("Jpaneles en clases diferentes");
        lblTitulo.setFont(new Font("arial", Font.PLAIN, 30));
        lblTitulo.setBounds(10, 14, 400, 51);

        btnPanel1 = new JButton("PANEL1");
        btnPanel1.setBounds(10, 76, 89, 23);
        btnPanel1.addActionListener(this);

        btnPanel2 = new JButton("PANEL2");
        btnPanel2.setBounds(109, 76, 89, 23);
        btnPanel2.addActionListener(this);

                        add(btnPanel1);
                        add(btnPanel2);

                        add(lblTitulo);

                        add(scrollPaneles);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnPanel1){
            definirPanel(miPanel1);
        }

        if(e.getSource()==btnPanel2){
            miPanel2.limpiar();
            definirPanel(miPanel2);
        }
    }

    private void definirPanel(Panel1 miPanel){
        scrollPaneles.setViewportView(miPanel);
    }

    private void definirPanel(Panel2 miPanel){
        scrollPaneles.setViewportView(miPanel);
    }


}

