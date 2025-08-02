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
        Scanner scan = new Scanner(System.in);
        /* 
        * Aqui se hace la instancia de Scanner con el nombre 'scan', recordando que primero se pone el tipo de dato:
        * Scanner scan
        * Donde 'Scanner' es el tipo de dato/objeto y 'scan' es el nombre de nuestra variable/objeto
        * Luego se hace la instancia que es darle un valor a nuestro objeto igualando con un nuevo objeto del mismo tipo:
        * = new Scanner(System.in);
        * Dentro de la instancia Scanner se pone el atributo de lo vamos a leer, en este caso leeremos el teclado de la computadora con 'System.in'
        */
        System.out.print("Ingresa tu nombre: "); //Este es un mensaje en consola sin salto de linea que imprime 'Ingresa tu nombre: '
        String nombre = scan.nextLine(); 
        /*
        * Aqui creamos una variable/objeto de tipo 'String' con nombre 'nombre' y le asignamos un valor mediante nuestro objeto 'scan'
        * utilizando su funcion 'nextLine()'
        * Al utilizar 'nextLine()' hacemos que lo que lee el teclado lo convierta en un String
        * Tambien podemos obligar a leer datos y convertirlos en otros tipos de datos pero si ingresamos datos como cadenas o caracteres cuando queremos
        * ingresar numero con scan.nextInt() se generara un error y terminara nuestro programa.
        */
        System.out.println("Tu nombre es: "+ nombre); //Este es un mensaje en consola donde mostramos el texto que ingresamos
        
        
        // Leer un número entero, ejemplo 5
        System.out.print("Ingresa tu edad (ej. 5): ");
        int edad = scan.nextInt();

        // Leer un número decimal, ejemplo 1.75
        System.out.print("Ingresa tu estatura en metros (ej. 1.75): ");
        double estatura = scan.nextDouble();

        // Mostrar los datos ingresados
        System.out.println("\n--- Datos ---");
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " m");
        
        scan.close(); // Sirver para cerrar el scanner de lectura por lo que ya no lo podremos usar despues
        /*
        * Si descomentamos lo siguiente nuestro programa generar un error y terminara puesto que nuestro escanner ya dejo de funcionar.
        * int a = scan.nextInt();
        * System.out.println("a: "+a);
        */
    }
    
}