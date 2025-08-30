/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplos;

import java.util.Scanner; // Importacion de Scanner para porder leer
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Raxzorm
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        // Ciclo principal del menú
        while (continuar) {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Crear archivo de texto");
            System.out.println("2. Leer archivo de texto");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    // Llamada del método 'crearArchivo()'
                    crearArchivo();
                    break;
                case 2:
                    // Llamada del método 'leerArchivo()'
                    leerArchivo();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    /* Método sin parámetros y sin retorno
    * Crea un archivo de texto y escribe contenido en él.
    *
    * Sintaxis:
    * public static void nombreMetodo() {
    *     sentencias...
    * }
     */
    public static void crearArchivo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo (ejemplo: archivo.txt): ");
        String nombreArchivo = scanner.nextLine();

        System.out.print("Escriba el contenido para guardar en el archivo: ");
        String contenido = scanner.nextLine();

        try {
            FileWriter escritor = new FileWriter(nombreArchivo);
            escritor.write(contenido);
            escritor.close();
            System.out.println("Archivo creado y guardado exitosamente: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrió un error al crear el archivo.");
            e.printStackTrace();
        }
    }

    /* Método sin parámetros y sin retorno
    * Lee y muestra el contenido de un archivo de texto.
     */
    public static void leerArchivo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del archivo a leer (ejemplo: archivo.txt): ");
        String nombreArchivo = scanner.nextLine();

        try {
            FileReader lector = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(lector);

            String linea;
            System.out.println("\nContenido del archivo:");
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea);
            }

            bufferedReader.close();
            lector.close();
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo.");
            e.printStackTrace();
        }
    }
}
