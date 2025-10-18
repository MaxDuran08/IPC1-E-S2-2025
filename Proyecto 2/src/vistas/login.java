/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vistas;

import bd.bd;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import modelos.cliente;
import modelos.vendedor;
/**
 *
 * @author Raxzorm
 */
public class login extends JFrame {
    private static int adminActivos = 0;
    private static int vendedorActivos = 0;
    private static int clienteActivos = 0;
    private bd base_datos;

    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JComboBox<String> cmbTipo;

    public login(bd base_datos) {
        this.base_datos = base_datos;
        setTitle("Login del Sistema");
        setSize(400, 300);
        setLayout(new GridLayout(5, 1, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblTipo = new JLabel("Tipo de usuario:", SwingConstants.CENTER);
        cmbTipo = new JComboBox<>(new String[]{"Administrador", "Vendedor", "Cliente"});

        JLabel lblUsuario = new JLabel("Usuario:", SwingConstants.CENTER);
        txtUsuario = new JTextField();

        JLabel lblContrasena = new JLabel("Contraseña:", SwingConstants.CENTER);
        txtContrasena = new JPasswordField();

        JButton btnLogin = new JButton("Iniciar Sesión");
        btnLogin.addActionListener(e -> validarCredenciales());

        add(lblTipo);
        add(cmbTipo);
        add(lblUsuario);
        add(txtUsuario);
        add(lblContrasena);
        add(txtContrasena);
        add(btnLogin);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void validarCredenciales() {
        String tipo = cmbTipo.getSelectedItem().toString();
        String usuario = txtUsuario.getText().trim();
        String contrasena = new String(txtContrasena.getPassword()).trim();

        switch (tipo) {
            case "Administrador" -> validarAdmin(usuario, contrasena);
            case "Vendedor" -> validarVendedor(usuario, contrasena);
            case "Cliente" -> validarCliente(usuario, contrasena);
        }
    }

    private void validarAdmin(String usuario, String contrasena) {
        if (usuario.equals("admin") && contrasena.equals("IPC1E")) {
            abrirVentana("admin");
            JOptionPane.showMessageDialog(this, "Bienvenido Administrador");
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
        }
    }

    private void validarVendedor(String codigo, String contrasena) {
        boolean encontrado = false;
        for (int i = 0; i < base_datos.getTotalVendedores(); i++) {
            vendedor v = base_datos.getVendedores()[i];
            if (v.getCodigo().equals(codigo) && v.getContrasena().equals(contrasena)) {
                encontrado = true;
                abrirVentana("vendedor");
                JOptionPane.showMessageDialog(this, "Bienvenido " + v.getNombre());
                break;
            }
        }
        if (!encontrado)
            JOptionPane.showMessageDialog(this, "Código o contraseña incorrectos");
    }

    private void validarCliente(String codigo, String contrasena) {
        boolean encontrado = false;
        for (int i = 0; i < base_datos.getTotalClientes(); i++) {
            cliente c = base_datos.getClientes()[i];
            if (c.getCodigo().equals(codigo) && c.getContrasena().equals(contrasena)) {
                encontrado = true;
                abrirVentana("cliente");
                JOptionPane.showMessageDialog(this, "Bienvenido " + c.getNombre());
                break;
            }
        }
        if (!encontrado)
            JOptionPane.showMessageDialog(this, "Código o contraseña incorrectos");
    }

    private void abrirVentana(String tipo) {
        JFrame ventana = switch (tipo) {
            case "admin" -> new ventanaAdmin(base_datos, this);
            case "vendedor" -> new ventanaVendedor(base_datos, this);
            case "cliente" -> new ventanaCliente(base_datos, this);
            default -> null;
        };

        // Incrementar contador de sesiones activas
        switch (tipo) {
            case "admin" -> adminActivos++;
            case "vendedor" -> vendedorActivos++;
            case "cliente" -> clienteActivos++;
        }
        mostrarConteo();

        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                switch (tipo) {
                    case "admin" -> adminActivos--;
                    case "vendedor" -> vendedorActivos--;
                    case "cliente" -> clienteActivos--;
                }
                mostrarConteo();
            }
        });
    }

    public static void mostrarConteo() {
        System.out.println("\nUsuarios activos:");
        System.out.println("  Administradores: " + adminActivos);
        System.out.println("  Vendedores: " + vendedorActivos);
        System.out.println("  Clientes: " + clienteActivos);
    }
}