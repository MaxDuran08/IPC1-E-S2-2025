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
public class producto implements Serializable {

    private String codigo;
    private String nombre;
    private String categoria;
    private String atributoUnico;
    private int stock;

    public producto(String codigo, String nombre, String categoria, String atributoUnico) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.atributoUnico = atributoUnico;
    }

    @Override
    public String toString() {
        return codigo + " - " + nombre + " (" + categoria + ") - " + stock + " unidades";
    }
}
