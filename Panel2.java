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

public class Panel2  extends JPanel implements ActionListener {

    private JTextField campo;
    JButton btnPanelInterno;

    public Panel2(){
        setLayout(null);
        setBackground(Color.RED);
        iniciarComponentes();
    }

    private void iniciarComponentes(){
        btnPanelInterno = new JButton();
        btnPanelInterno.setText("enviar");
        btnPanelInterno.setBounds(200, 10, 90, 25);
        btnPanelInterno.addActionListener(this);

        campo = new JTextField();
        campo.setBounds(10, 10, 160, 25);

        add(btnPanelInterno);
        add(campo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnPanelInterno){
            JOptionPane.showMessageDialog(null, "lo que el usuario ingreso es: " + campo.getText());
        }
    }

    public void limpiar(){
        campo.setText("");
    }


}

