/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ejercicioteorico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lenovo
 */
public class ManejaBoton implements ActionListener {

    public void actionPerformed(ActionEvent e){
        
        System.out.println(e.getActionCommand());
        System.exit(0);
    }
 
}
