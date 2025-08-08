/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

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
        /* Estructura if simple en Java
        * La estructura if permite ejecutar un bloque de código solo si la condición es verdadera.
        *
        * Sintaxis:
        * if (condición) {
        *     sentencias...
        * }
        *
        * Si la condición se cumple (true), el bloque se ejecuta.
         */

        int numero = 10;

        if (numero > 5) {
            System.out.println("El número es mayor que 5");
        }

        /* Estructura if-else en Java
        * Esta estructura ejecuta un bloque de código si la condición es verdadera
        * y otro bloque si la condición es falsa.
        *
        * Sintaxis:
        * if (condición) {
        *     sentencias si es verdadera
        * } else {
        *     sentencias si es falsa
        * }
         */
        int edad = 17;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        /* If-Else anidado en Java
        * Se utiliza para evaluar múltiples condiciones una dentro de otra.
        *
        * Sintaxis:
        * if (condición1) {
        *     sentencias...
        * } else if (condición2) {
        *     sentencias...
        * } else {
        *     sentencias...
        * }
         */
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Excelente");
        } else if (nota >= 75) {
            System.out.println("Muy bien");
        } else if (nota >= 60) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

    }
}