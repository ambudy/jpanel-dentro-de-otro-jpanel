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
    private JButton btnPanel1, btnPanel2, btnPanelInterno;
    private JTextArea textArea;
    private JPanel panel1, panel2;
    private JTextField campo;

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
        panel1 = new JPanel();
        panel1.setBackground(Color.CYAN);
        panel1.setBounds(5, 112, 370, 200);
        panel1.setLayout(null);
        panel1.setVisible(true);


        panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setBounds(5, 112, 370, 200);
        panel2.setLayout(null);
        panel2.setVisible(false);

        lblTitulo = new  JLabel("EJEMPLO jPANEL");
        lblTitulo.setFont(new Font("arial", Font.PLAIN, 30));
        lblTitulo.setBounds(10, 14, 221, 51);

        btnPanel1 = new JButton("PANEL1");
        btnPanel1.setBounds(10, 76, 89, 23);
        btnPanel1.addActionListener(this);

        btnPanel2 = new JButton("PANEL2");
        btnPanel2.setBounds(109, 76, 89, 23);
        btnPanel2.addActionListener(this);

        cargarComponentesPanel1();
        cargarComponentesPanel2();

                        add(btnPanel2);
                        add(btnPanel1);
                        add(lblTitulo);

                        add(panel1);
                        add(panel2);
    }

    private void cargarComponentesPanel1(){
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 350, 181);
        String texto=   "este es un ejemplo sobre como interactua una ventana con"
                        +"\nvarios jpanel\n"
                        +"\nla logica se basa en tener cada panel con sus propios"
                        +"\nconponentes\n"
                        +"\n y ocultar u hacer visible uno de ellos\n"
                        +"\n dependiendo de la necesidad\n";
                        textArea.setText(texto);
                        panel1.add(textArea);
    }

    private void cargarComponentesPanel2(){
        btnPanelInterno = new JButton();
        btnPanelInterno.setText("enviar");
        btnPanelInterno.setBounds(200, 10, 90, 25);
        btnPanelInterno.addActionListener(this);

        campo = new JTextField();
        campo.setBounds(10, 10, 160, 25);

        panel2.add(btnPanelInterno);
        panel2.add(campo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnPanel1){
            panel1.setVisible(true);
            panel2.setVisible(false);
        }

        if(e.getSource()==btnPanel2){
            panel1.setVisible(false);
            panel2.setVisible(true);
        }

        if(e.getSource()==btnPanelInterno){
            JOptionPane.showMessageDialog(null, "as ingresado " + campo.getText());
        }
    }
}
