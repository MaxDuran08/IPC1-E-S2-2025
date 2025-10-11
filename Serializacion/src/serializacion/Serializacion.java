/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializacion;

import java.io.*;

/**
 *
 * @author Raxzorm
 */

class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}

public class Serializacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Lista
        Persona[] personas = {
            new Persona("Juan", 30),
            new Persona("Ana", 25),
            new Persona("Luis", 40)
        };
        
         // Serialización
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.lista"))) {
            oos.writeObject(personas);
            System.out.println("Lista de personas serializada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización de lista
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.lista"))) {
            Persona[] personasLeidas = (Persona[]) ois.readObject();
            System.out.println("\nPersonas leídas del archivo:");
            for (Persona p : personasLeidas) {
                System.out.println(p);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        // Serialización
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.objeto"))) {
            Persona persona = new Persona("Max", 25);
            oos.writeObject(persona);
            System.out.println("\nPersona serializada correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.objeto"))) {
            Persona persona = (Persona) ois.readObject();
            System.out.println("Persona leída del archivo:");
            System.out.println("Nombre: " + persona.nombre + ", Edad: " + persona.edad);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
