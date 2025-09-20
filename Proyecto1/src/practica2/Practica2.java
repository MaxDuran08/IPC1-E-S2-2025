/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2;

import javax.swing.SwingUtilities;
import practica2.controller.Controlador;
import practica2.view.Ventana;

/**
 *
 * @author Raxzorm
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(() -> {
            Ventana vista = new Ventana();
            new Controlador(vista);
            vista.setVisible(true);
        });
    }
    
}
