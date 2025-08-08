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
        /* Estructura try-catch en Java
        * Permite manejar excepciones (errores en tiempo de ejecución) evitando que el programa se detenga.
        *
        * Sintaxis:
        * try {
        *     código que puede lanzar una excepción
        * } catch (TipoDeExcepción e) {
        *     código para manejar el error
        * } finally {
        *     código opcional que siempre se ejecuta
        * }
        */

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            int numero = Integer.parseInt(scanner.nextLine()); // Puede lanzar NumberFormatException
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No ingresaste un número válido.");
        } finally {
            System.out.println("Ejecución finalizada (bloque finally).");
            scanner.close();
        }

    }
}