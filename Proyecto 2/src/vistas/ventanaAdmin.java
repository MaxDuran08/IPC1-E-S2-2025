/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import bd.bd;
import modelos.vendedor;
import javax.swing.*;
import java.awt.*;
import java.io.*;
/**
 *
 * @author Raxzorm
 */
public class ventanaAdmin extends JFrame {
    private bd base_datos;

    public ventanaAdmin(bd base_datos, JFrame padre) {
        this.base_datos = base_datos;
        setTitle("Ventana Administrador");
        setSize(400, 200);
        setLayout(new FlowLayout());

        JButton btnCargar = new JButton("Cargar CSV de Vendedores");
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
                vendedor v = new vendedor(p[0].trim(), p[1].trim(), p[2].trim(), p[3].trim(), p[4].trim());
                base_datos.agregarVendedor(v);
            }
            base_datos.guardarBD("datos.dat");
            JOptionPane.showMessageDialog(this, "Vendedores cargados correctamente");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}