/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

import java.util.Scanner; // Importacion de Scanner para porder leer

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
        /* Arreglos en Java (Arrays)
        * Un arreglo es una estructura de datos que almacena múltiples valores del mismo tipo en una sola variable.
        * El tamaño de un arreglo se define al momento de crearlo y no puede cambiar.
        *
        * Sintaxis:
        * tipo[] nombre = new tipo[tamaño];
        * 
        * Para asignar valores:
        * nombre[posición] = valor;
        * 
        * Para recorrerlo:
        * for (int i = 0; i < nombre.length; i++) {
        *   sentencias...
        * }
        */
        
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5]; // Creamos un arreglo de 5 enteros

        System.out.println("Ingresa 5 números enteros:");

        // Guardar datos en el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número [" + i + "]: ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los datos del arreglo
        System.out.println("\nContenido del arreglo:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
