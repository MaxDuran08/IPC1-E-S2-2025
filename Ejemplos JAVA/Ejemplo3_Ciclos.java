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
        /* Ciclo WHILE: este ciclo se repetirá mientras la condición sea verdadera.
        * Primero evalúa la condición, y solo si es true se ejecutan las sentencias dentro del bloque.
        * Sintaxis:
        * while ( condicion ){
        *   sentencias....
        * }
        */
        
        int contador = 1;

        System.out.println("Ciclo while:");
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++; // esto es lo mismo que decir 'contador = contador + 1;'
        }
        /*Ciclo DO-WHILE, este ciclo se ejecuta al menos una vez y luego se repetirá mientras la condición sea true.
        * A diferencia del while, aquí las sentencias se ejecutan antes de evaluar la condición.
        * Sintaxis:
        * while ( condicion ){
        *   sentencias....
        * }
        */
        int numero = 1;

        System.out.println("\nCiclo do-while:");
        do {
            System.out.println("Número: " + numero);
            numero++;
        } while (numero <= 5);
        
        /* Ciclo FOR: este ciclo se repetirá mientras la condición sea verdadera.
        * Primero se inicializa una variable, luego se evalúa la condición, y si es true se ejecutan las sentencias.
        * Al final de cada iteración, se ejecuta el incremento o decremento.
        * Sintaxis:
        * for (inicialización; condición; incremento o decremento) {
        *   sentencias...
        * }
        */
        System.out.println("\nCiclo for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }
    }
}