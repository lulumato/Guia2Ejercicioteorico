/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicioteorico;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Lenovo
 */
public class PrimerVentana {
    private JFrame ventana;
    private  JButton bt1;

public PrimerVentana(){
ventana=new JFrame("Ejemplo BoxLayout");
bt1=new JButton("Salir 1 ");
}

public void mostrarVentana(){
    bt1.addActionListener(new ManejaBoton());
    ventana.add(bt1);
    ventana.setSize(400,300);
    ventana.setVisible(true);
}
}