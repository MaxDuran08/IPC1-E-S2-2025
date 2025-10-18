/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import bd.bd;
import modelos.cliente;
import javax.swing.*;
import java.awt.*;
import java.io.*;
/**
 *
 * @author Raxzorm
 */
public class ventanaVendedor extends JFrame {
    private bd base_datos;

    public ventanaVendedor(bd base_datos, JFrame padre) {
        this.base_datos = base_datos;
        setTitle("Ventana Vendedor");
        setSize(400, 200);
        setLayout(new FlowLayout());

        JButton btnCargar = new JButton("Cargar CSV de Clientes");
        add(btnCargar);

        btnCargar.addActionListener(e -> cargarCSV());

        setLocationRelativeTo(padre);
        setVisible(true);
    }

    private void cargarCSV() {
        JFileChooser chooser = new JFileChooser();
        if (chooser.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) return;

        File archivo = chooser.getSelectedFile();
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            br.readLine(); // Encabezado
            while ((linea = br.readLine()) != null) {
                String[] p = linea.split(",");
                cliente c = new cliente(p[0].trim(), p[1].trim(), p[2].trim(), p[3].trim(), p[4].trim());
                base_datos.agregarCliente(c);
            }
            base_datos.guardarBD("datos.dat");
            JOptionPane.showMessageDialog(this, "Clientes cargados correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}