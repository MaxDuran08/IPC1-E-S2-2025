/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopractica;

import java.util.Scanner;

/**
 *
 * @author Raxzorm
 */
public class EjemploPractica {

    /**
     * @param args the command line arguments
     */
    static String[][][] Personajes = new String[10][3][5];
    static int contadorID =0;

    public static void main(String[] args) {
        // TODO code application logic here
       /* boolean keyMenu = true;
        while (keyMenu) {
            System.out.println("-> Menu principal");
            System.out.println("1. Agregar personaje");
            System.out.println("2. Mostrar personajes");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Salir");

            int opcion = obtenerOpcion();
            switch (opcion) {
                case 1:
                    System.out.println("Selecciono la opcion 1");
                    agregarPersonaje();
                    break;
                case 2:
                    System.out.println("Selecciono la opcion 2");
                    mostrarPersonajes();
                    break;
                case 3:
                    System.out.println("Selecciono la opcion 3");
                    break;
                case 4:
                    System.out.println("Selecciono la opcion 4");
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    keyMenu = false;
                    break;
                default:
                    System.err.println("Opcion invalida.");

            }
        }*/
       int numero =4;
       numero = numero^numero;
        System.out.println("resultado " + numero);
    }

    public static int validarNumero(String cadena) {
        try {
            int numero = Integer.parseInt(cadena);
            return numero;
        } catch (Exception e) {
            return -1;
        } finally {
            System.out.println("Cerrando funcion 'ValidarNumero()'");
        }
    }

    public static int obtenerOpcion() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su opcion: ");
            int opcion = validarNumero(scanner.nextLine());
            if (opcion == -1) {
                System.err.println("Solo se aceptan numeros enteros.");
            } else {
                return opcion;
            }
        }
    }

    public static void agregarPersonaje() {
        for (int i = 0; i < Personajes.length; i++) {
            if (Personajes[i][0] == null) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Ingrese el nombre:");
                String nombre = scanner.nextLine();
                System.out.println("Ingese el nombre de su arma:");
                String arma = scanner.nextLine();
                contadorID+=1;
                Personajes[i][0] = String.valueOf(contadorID);
                Personajes[i][1] = nombre;
                Personajes[i][2] = arma;
                break;
            }
        }

    }

    public static void mostrarPersonajes() {
        for (int i = 0; i < Personajes.length; i++) {
            if (Personajes[i][0] == null) {
                break;
            } else {
                System.out.println("ID: " + Personajes[i][0]);
                System.out.println("Nombre: " + Personajes[i][1]);
                System.out.println("Arma: " + Personajes[i][2]);
            }

        }
    }

}
