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

        System.out.println("Bubble Sort Iterativo");
        System.out.print("¿Cuántos números deseas ordenar? ");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];
        System.out.println("Ingresa los números:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        bubbleSort(arreglo);

        System.out.println("Arreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    // Método de Bubble Sort Iterativo
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}