/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.pkg2;

import bd.bd;
import modelos.cliente;
import modelos.producto;
import modelos.vendedor;
import vistas.login;

/**
 *
 * @author Raxzorm
 */
public class Proyecto2 {
    public static bd base_datos;
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // Cargar la base de datos
        base_datos = bd.cargarBD("datos.dat");

        // Mostrar ventana de login
        javax.swing.SwingUtilities.invokeLater(() -> new login(base_datos));
 
    }
    
}
