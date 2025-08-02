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
        // TIPOS PRIMITIVOS
        // Se almacenan directamente como valores
        int numero = 10;             // Entero
        double decimal = 3.14;       // Decimal de doble precisión
        char letra = 'A';            // Carácter
        boolean activo = true;       // Booleano

        // Imprimimos los tipos primitivos
        System.out.println("TIPOS PRIMITIVOS:");
        System.out.println("int: " + numero);
        System.out.println("double: " + decimal);
        System.out.println("char: " + letra);
        System.out.println("boolean: " + activo);

        // TIPOS NO PRIMITIVOS (OBJETOS)
        // Estos se basan en clases y pueden tener métodos, ser null, etc.
        String texto = "Hola Mundo";               // Cadena de texto (objeto)
        Integer numeroObjeto = Integer.valueOf(10); // Objeto Integer (envoltorio de int)
        Double decimalObjeto = 3.14;               // Objeto Double
        Boolean booleanoObjeto = Boolean.TRUE;     // Objeto Boolean

        // También puedes declarar un arreglo como no primitivo
        int[] numeros = {1, 2, 3, 4};               // Arreglo (objeto)

        // Imprimimos los tipos no primitivos
        System.out.println("\nTIPOS NO PRIMITIVOS:");
        System.out.println("String: " + texto);
        System.out.println("Integer: " + numeroObjeto);
        System.out.println("Double: " + decimalObjeto);
        System.out.println("Boolean: " + booleanoObjeto);

        System.out.print("int[]: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }
    }
    
}