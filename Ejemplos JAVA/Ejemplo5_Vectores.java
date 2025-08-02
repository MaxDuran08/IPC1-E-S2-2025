/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

import java.util.Scanner; // Importacion de Scanner para porder leer
import java.util.Vector; // Importacion para vectores

/**
 *
 * @author Raxzorm
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* Vectores en Java
        * Un Vector es una estructura dinámica que permite almacenar datos como un arreglo,
        * pero a diferencia de los arrays, su tamaño puede crecer o disminuir automáticamente.
        * Es parte de la clase java.util y puede almacenar objetos.
        * 
        * Sintaxis:
        * Vector<tipo> nombre = new Vector<tipo>();
        * 
        * Para agregar valores:
        * nombre.add(valor);
        * 
        * Para recorrerlo:
        * for (int i = 0; i < nombre.size(); i++) {
        *   sentencias...
        * }
        */
        
        Scanner scanner = new Scanner(System.in);
        Vector<String> nombres = new Vector<>();

        System.out.println("Ingresa 3 nombres:");

        // Guardar datos en el Vector
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre [" + i + "]: ");
            String nombre = scanner.nextLine();
            nombres.add(nombre); // Agregar al vector
        }

        // Mostrar los datos del Vector
        System.out.println("\nContenido del Vector:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombre en posición " + i + ": " + nombres.get(i));
        }

        scanner.close();
    }
}
