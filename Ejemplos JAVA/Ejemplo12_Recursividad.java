/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;
import java.util.Scanner;
/**
 *
 * @author Raxzorm
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ejemplo de Recursividad");
        System.out.print("Ingresa un número para calcular su factorial: ");
        long numero = scanner.nextInt();

        long resultado = factorial(numero);

        System.out.println("El factorial de " + numero + " es: " + resultado);

        scanner.close();
    }

    // Método recursivo para calcular factorial
    public static long factorial(long n) {
        if (n == 0 || n == 1) {
            return 1; // Caso base
        } else {
            return n * factorial(n - 1); // Llamada recursiva
        }
    }
}