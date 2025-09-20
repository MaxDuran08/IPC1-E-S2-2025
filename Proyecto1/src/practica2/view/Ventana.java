/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica2.view;

import javax.swing.*;
import java.awt.*;
import practica2.model.Jugador;
/**
 *
 * @author Raxzorm
 */
public class Ventana extends JFrame {
    
    public Jugador[] jugadores = new Jugador[10]; // máximo 10 jugadores
    public int cantidadJugadores = 0; // contador de jugadores

    public JTextArea areaLog, areaJugadores;
    public JComboBox<String> comboJugador1, comboJugador2;
    public JTextField txtVelocidad, txtNombre;
    public JButton btnAgregar, btnJugar;

    public Ventana() {
        super("Sistema de Pelea de Jugadores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);

        JTabbedPane pestañas = new JTabbedPane();

        // Panel de gestión de jugadores
        JPanel panelJugadores = new JPanel(new BorderLayout());
        
        // Area donde se crearan a los jugadores
        JPanel form = new JPanel(new GridLayout(3, 2));
        txtNombre = new JTextField();
        txtVelocidad = new JTextField();
        btnAgregar = new JButton("Agregar Jugador");

        form.add(new JLabel("Nombre:"));
        form.add(txtNombre);
        form.add(new JLabel("Velocidad (ms):"));
        form.add(txtVelocidad);
        form.add(new JLabel());
        form.add(btnAgregar);
        
        //Area de texto que simula una consola
        areaJugadores = new JTextArea();
        areaJugadores.setEditable(false);
        JScrollPane scrollJugadores = new JScrollPane(areaJugadores);

        panelJugadores.add(form, BorderLayout.NORTH);
        panelJugadores.add(scrollJugadores, BorderLayout.CENTER);

        // Panel de juego
        JPanel panelJuego = new JPanel(new BorderLayout());
        
        // Area de seleccion de personajes
        JPanel opciones = new JPanel();
        comboJugador1 = new JComboBox<>();
        comboJugador2 = new JComboBox<>();
        btnJugar = new JButton("¡Iniciar Pelea!");

        opciones.add(new JLabel("Jugador 1:"));
        opciones.add(comboJugador1);
        opciones.add(new JLabel("Jugador 2:"));
        opciones.add(comboJugador2);
        opciones.add(btnJugar);

        // Area donde se simulara la pelea
        areaLog = new JTextArea();
        areaLog.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(areaLog);

        panelJuego.add(opciones, BorderLayout.NORTH);
        panelJuego.add(scrollLog, BorderLayout.CENTER);

        // Pestañas para nuestra ventana
        pestañas.addTab("Jugadores", panelJugadores);
        pestañas.addTab("Jugar", panelJuego);
        
        // Se agrega pestañas a la Ventana
        add(pestañas);
    }
}