/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.model;

/**
 *
 * @author Raxzorm
 */
public class Jugador {
    public String nombre;
    public int velocidad;
    public int ataques;

    public Jugador(String nombre, int velocidad) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.ataques = 0;
    }
}
