/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;

/**
 *
 * @author Raxzorm
 */
public class cliente implements Serializable {

    private String codigo;
    private String nombre;
    private String genero;
    private String cumpleanos;
    private String contrasena;

    public cliente(String codigo, String nombre, String genero, String cumpleanos, String contrasena) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.cumpleanos = cumpleanos;
        this.contrasena = contrasena;
    }

    @Override   
    public String toString() {
        return codigo + " - " + nombre + " (" + genero + ")";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }
}
