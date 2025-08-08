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
        /* Estructura switch en Java
        * Permite evaluar una variable contra múltiples casos posibles.
        *
        * Sintaxis:
        * switch (variable) {
        *     case valor1:
        *         sentencias...
        *         break;
        *     case valor2:
        *         sentencias...
        *         break;
        *     default:
        *         sentencias si ninguno coincide...
        * }
        *
        * Nota: El break evita que se ejecuten los demás casos.
         */

        int dia = 5;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
        }

    }
}
