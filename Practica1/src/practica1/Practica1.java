/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import com.qoppa.pdfWriter.PDFDocument;
import com.qoppa.pdfWriter.PDFPage;
import com.qoppa.pdfWriter.PDFGraphics;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.Graphics2D;

/**
 *
 * @author Raxzorm
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    
    static String[][] Lista = new String[500][5];
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean menuKey = true;
        while(menuKey){
            System.out.println("-> Menu Principal");
            System.out.println("1. Crear Personajes 1");
            System.out.println("2. Generar PDF 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Salir");
            int opcion = obtenerOpcion();
            switch(opcion){
                case 1:
                    System.out.println("Cargar personaje");
                    cargarPersonaje();
                    break;
                case 2:
                    System.out.println("Generar pdf");
                    exportarPDF();
                    break;
                case 3:
                    System.out.println("Ingresando al submenu 2");
                    break;
                case 4:
                    System.out.println("Ingresando al submenu 2");
                    break;
                case 5:
                    System.out.println("Cerrando programa...");
                    menuKey = false;
                    break;
                default:
                    System.err.println("Ingreso una opcion invalida");
            }
        }
    }

    public static int validarNumero(String cadena) {
        int numero;
        try {
            numero = Integer.parseInt(cadena);
            return numero;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static int obtenerOpcion() {
        while (true) {
            System.out.print("Escoja una opcion: ");
            Scanner scanner = new Scanner(System.in);
            int opcion = validarNumero(scanner.nextLine());
            if (opcion == -1) {
                System.err.println("Solo ingresar valores numericos enteros.");
            } else {
                return opcion;
            }
        }
    }
    
    public static void cargarPersonaje(){
        for (int i = 0; i < Lista.length; i++) {
            if(Lista[i][0] == null){
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                Lista[i][0] = nombre;
                System.out.print("Ingrese el nombre de su arma: ");
                String arma = scanner.nextLine();
                Lista[i][1] = arma;
                System.out.print("Ingrese el nombre de su clase: ");
                String clase = scanner.nextLine();
                Lista[i][2] = clase;
                System.out.print("Ingrese el nivel de poder: ");
                String nivel = scanner.nextLine();
                Lista[i][3] = nivel;
                System.out.print("Ingrese el nombre de su raza: ");
                String raza = scanner.nextLine();
                Lista[i][4] = raza;
                break;
            }
        }
    }
    


public static void exportarPDF() {
    try {
        // Crear documento PDF
        PDFDocument pdfDoc = new PDFDocument();

        // Definir tamaño de página A4
        PageFormat pageFormat = new PageFormat();
        Paper paper = new Paper();
        paper.setSize(595, 842); // ancho x alto en puntos
        paper.setImageableArea(50, 50, 495, 742); // margen de 50 en cada lado
        pageFormat.setPaper(paper);

        // Crear página con ese formato
        PDFPage page = pdfDoc.createPage(pageFormat);
        Graphics2D g2d = page.createGraphics();

        // Encabezado
        g2d.setFont(new java.awt.Font("Helvetica", java.awt.Font.BOLD, 18));
        g2d.drawString("Reporte Proyecto 1", 200, 100);

        g2d.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 12));
        g2d.drawString("Estudiante: Max", 50, 120);
        g2d.drawString("Listado de personajes registrados en el sistema", 50, 140);

        // Encabezados de tabla
        int y = 170;
        g2d.setFont(new java.awt.Font("Helvetica", java.awt.Font.BOLD, 12));
        g2d.drawString("Nombre", 50, y);
        g2d.drawString("Arma", 150, y);
        g2d.drawString("Clase", 250, y);
        g2d.drawString("Nivel", 350, y);
        g2d.drawString("Raza", 450, y);

        // Datos de la lista
        g2d.setFont(new java.awt.Font("Helvetica", java.awt.Font.PLAIN, 11));
        y += 20;
        for (int i = 0; i < Lista.length; i++) {
            if (Lista[i][0] != null) {
                g2d.drawString(Lista[i][0], 50, y);
                g2d.drawString(Lista[i][1] != null ? Lista[i][1] : "-", 150, y);
                g2d.drawString(Lista[i][2] != null ? Lista[i][2] : "-", 250, y);
                g2d.drawString(Lista[i][3] != null ? Lista[i][3] : "-", 350, y);
                g2d.drawString(Lista[i][4] != null ? Lista[i][4] : "-", 450, y);
                y += 20;
            }
        }

        // Guardar documento
        pdfDoc.addPage(page);
        FileOutputStream fos = new FileOutputStream("Personajes.pdf");
        pdfDoc.saveDocument(fos);
        fos.close();

        System.out.println("PDF generado exitosamente: Personajes.pdf");
    } catch (IOException e) {
        e.printStackTrace();
    }
}

}
