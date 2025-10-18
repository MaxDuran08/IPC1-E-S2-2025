/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.io.*;
import modelos.cliente;
import modelos.producto;
import modelos.vendedor;

/**
 *
 * @author Raxzorm
 */
public class bd implements Serializable {

    private static final int MAX = 1000;

    private vendedor[] vendedores = new vendedor[MAX];
    private cliente[] clientes = new cliente[MAX];
    private producto[] productos = new producto[MAX];

    private int totalVendedores = 0;
    private int totalClientes = 0;
    private int totalProductos = 0;

    // Métodos para agregar
    public void agregarVendedor(vendedor v) {
        if (totalVendedores < MAX) {
            vendedores[totalVendedores++] = v;
        } else {
            System.out.println("No se puede agregar más vendedores (límite alcanzado)");
        }
    }

    public void agregarCliente(cliente c) {
        if (totalClientes < MAX) {
            clientes[totalClientes++] = c;
        } else {
            System.out.println("No se puede agregar más clientes (límite alcanzado)");
        }
    }

    public void agregarProducto(producto p) {
        if (totalProductos < MAX) {
            productos[totalProductos++] = p;
        } else {
            System.out.println("No se puede agregar más productos (límite alcanzado)");
        }
    }

    // Métodos para acceder
    public vendedor[] getVendedores() {
        return vendedores;
    }

    public cliente[] getClientes() {
        return clientes;
    }

    public producto[] getProductos() {
        return productos;
    }

    public int getTotalVendedores() {
        return totalVendedores;
    }

    public int getTotalClientes() {
        return totalClientes;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    // Guardar BD serializada
    public void guardarBD(String nombreArchivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            oos.writeObject(this);
            System.out.println("BD guardada correctamente en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Cargar BD serializada
    public static bd cargarBD(String nombreArchivo) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (bd) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar la BD, creando nueva...");
            return new bd();
        }
    }
}
