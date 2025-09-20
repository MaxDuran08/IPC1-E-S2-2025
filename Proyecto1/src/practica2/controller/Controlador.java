/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.controller;

import practica2.view.Ventana;
import practica2.model.Jugador;

import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Raxzorm
 */
public class Controlador {
    private Jugador[] jugadores = new Jugador[10];
    private int cantidadJugadores = 0;

    private Ventana vista;
    private DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Controlador(Ventana vista) {
        this.vista = vista;
        inicializarEventos();
    }

    private void inicializarEventos() {
        vista.btnAgregar.addActionListener(e -> agregarJugador());
        vista.btnJugar.addActionListener(e -> iniciarPelea());
    }

    private void agregarJugador() {
        try {
            String nombre = vista.txtNombre.getText().trim();
            int velocidad = Integer.parseInt(vista.txtVelocidad.getText().trim());
            if (!nombre.isEmpty() && velocidad > 0) {
                if (cantidadJugadores < jugadores.length) {
                    jugadores[cantidadJugadores] = new Jugador(nombre, velocidad);
                    vista.areaJugadores.append("Jugador agregado: " + nombre + " (Velocidad: " + velocidad + "ms)\n");
                    cantidadJugadores++;
                    vista.txtNombre.setText("");
                    vista.txtVelocidad.setText("");
                    actualizarCombos();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pueden agregar más jugadores (máx " + jugadores.length + ").");
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Datos inválidos.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error en los datos.");
        }
    }

    private void actualizarCombos() {
        vista.comboJugador1.removeAllItems();
        vista.comboJugador2.removeAllItems();
        for (int i = 0; i < cantidadJugadores; i++) {
            vista.comboJugador1.addItem(jugadores[i].nombre);
            vista.comboJugador2.addItem(jugadores[i].nombre);
        }
    }

    private void iniciarPelea() {
        if (vista.comboJugador1.getSelectedItem() == null || vista.comboJugador2.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(vista, "Seleccione dos jugadores.");
            return;
        }
        if (vista.comboJugador1.getSelectedItem().equals(vista.comboJugador2.getSelectedItem())) {
            JOptionPane.showMessageDialog(vista, "Seleccione jugadores distintos.");
            return;
        }

        Jugador j1 = null, j2 = null;
        for (int i = 0; i < cantidadJugadores; i++) {
            if (jugadores[i].nombre.equals(vista.comboJugador1.getSelectedItem().toString())) j1 = jugadores[i];
            if (jugadores[i].nombre.equals(vista.comboJugador2.getSelectedItem().toString())) j2 = jugadores[i];
        }

        if (j1 == null || j2 == null) return;

        j1.ataques = 0;
        j2.ataques = 0;
        String horaInicio = LocalTime.now().format(formatoHora);
        vista.areaLog.setText("[" + horaInicio + "] ¡Comienza la pelea entre " + j1.nombre + " y " + j2.nombre + "!\n");

        Jugador finalJ1 = j1;
        Jugador finalJ2 = j2;

        Thread hilo1 = new Thread(() -> pelear(finalJ1, finalJ2));
        Thread hilo2 = new Thread(() -> pelear(finalJ2, finalJ1));

        hilo1.start();
        hilo2.start();
    }

    private void pelear(Jugador atacante, Jugador oponente) {
        try {
            while (atacante.ataques < 3 && oponente.ataques < 3) {
                Thread.sleep(atacante.velocidad);
                if (atacante.ataques < 3 && oponente.ataques < 3) {
                    atacante.ataques++;
                    String horaAtaque = LocalTime.now().format(formatoHora);
                    SwingUtilities.invokeLater(() -> {
                        vista.areaLog.append("[" + horaAtaque + "] " + atacante.nombre + " realiza ataque " + atacante.ataques + "\n");
                    });
                }
            }

            if (atacante.ataques == 3 && oponente.ataques < 3) {
                String horaFin = LocalTime.now().format(formatoHora);
                SwingUtilities.invokeLater(() -> {
                    vista.areaLog.append("\n[" + horaFin + "] ¡¡¡" + atacante.nombre + " GANA la pelea!!!\n");
                });
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}