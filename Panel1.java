/*
 *   Copyright (c) 2023
 *   All rights reserved.
 */
package paquete2;

/**
 *   Copyright (c) 2023
 *   All rights reserved.
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Panel1 extends JPanel {

    JTextArea textArea;

    public Panel1() {
        setLayout(null);
        setBackground(Color.GREEN);
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        textArea = new JTextArea();
        textArea.setBounds(10, 10, 350, 181);
        String texto=   "este es un ejemplo sobre como interactua una ventana con"
                        +"\nvarios jpanel\n"
                        +"\nla logica se basa en tener cada panel con sus propios"
                        +"\nconponentes\n"
                        +"\n y ocultar u hacer visible uno de ellos\n"
                        +"\n dependiendo de la necesidad\n";
                        textArea.setText(texto);
                        add(textArea);
    }
}
