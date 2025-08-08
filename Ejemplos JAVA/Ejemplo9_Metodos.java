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
        // Llamada del metodo 'saludar()'
        saludar();

        // Llamada del metodo 'mostrarNombre()'
        mostrarNombre("Max");
        
        // Llamada del metodo 'obtenerNumeroSecreto()'
        int numeroSecreto = obtenerNumeroSecreto();
        System.out.println("El numero secreto es: " + numeroSecreto);
        
        // Otra forma de utilizar un metodo que devuelve algo
        System.out.println("El numero secreto es: " + obtenerNumeroSecreto());
        
        // Llamada del metodo 'sumar()'
        int resultado = sumar(36,36);
        System.out.println("El resultado es: " + resultado);
        
        //Otra forma de usar un metodo que devuelve algo y se le envian parametros
        int A = 10;
        int B = 20;
        System.out.println("El resultado es: " + sumar( sumar(A, B), 30));
    }
    
    /* Método sin parámetros y sin retorno
    * Un método que no recibe valores y no devuelve nada (void).
    *
    * Sintaxis:
    * public void nombreMetodo() {
    *     sentencias...
    * }
    */
    
    public static void saludar() {
        System.out.println("¡Hola! Este es un saludo sin parámetros ni retorno.");
    }
    
    /* Método con parámetros y sin retorno
    * Recibe datos como entrada pero no devuelve nada.
    *
    * Sintaxis:
    * public void nombreMetodo(tipo parametro) {
    *     sentencias...
    * }
    */
    
    public static void mostrarNombre(String nombre) {
        System.out.println("Tu nombre es: " + nombre);
    }
    
    /* Método sin parámetros y con retorno
    * No recibe datos pero devuelve un valor usando return.
    *
    * Sintaxis:
    * public tipo nombreMetodo() {
    *     return valor;
    * }
    */
    
    public static int obtenerNumeroSecreto() {
        return 42; // Valor que será devuelto
    }
    
    /* Método con parámetros y con retorno
    * Recibe valores y devuelve un resultado.
    *
    * Sintaxis:
    * public tipo nombreMetodo(tipo parametro) {
    *     return valor;
    * }
    */
    
    public static int sumar(int a, int b) {
        return a + b; // Devuelve la suma de los parámetros
    }
}
