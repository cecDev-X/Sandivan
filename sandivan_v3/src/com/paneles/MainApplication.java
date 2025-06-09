package com.paneles;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainApplication {

   
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;

    private Login loginPanel;
    private Home homePanel;
    private Recuperacion recuperacionPanel;
    private caja cajaPanel;
    private AdminPanel adminPanel;
    public MainApplication() throws SQLException {
        initialize();
    }

    private void initialize() throws SQLException {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(736, 500);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setLocationByPlatform(true);

        // Configurar CardLayout
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Crear los paneles
        loginPanel = new Login(this);
        homePanel = new Home(this);
        recuperacionPanel = new Recuperacion(this);
        cajaPanel = new caja(this,"");
        adminPanel = new AdminPanel(this);
       
        
        // Agregar paneles al cardPanel con nombres identificativos
        cardPanel.add(loginPanel.getContentPane(), "LOGIN");
        cardPanel.add(homePanel.getContentPane(), "HOME");
        cardPanel.add(recuperacionPanel.getContentPane(), "RECUPERACION");
        cardPanel.add(cajaPanel.getContentPane(), "CAJA");
        cardPanel.add(adminPanel.getContentPane(),"ADMINPANEL");

        frame.add(cardPanel);
        frame.setLocationRelativeTo(null); // Centrar en pantalla

        // Mostrar primero el panel de login
        showLogin();
    }

    // Métodos para cambiar entre vistas
    public void showLogin() {
        cardLayout.show(cardPanel, "LOGIN");
        // Ajustar tamaño para el login
    }
    public void showRegistro() {
        cardLayout.show(cardPanel, "REGISTRO");

    }

    public void showHome() {
        cardLayout.show(cardPanel, "HOME");

    }

    public void showRecuperacion() {
        cardLayout.show(cardPanel, "RECUPERACION");

    }

    public void showCaja(String nombre) {
        cajaPanel = new caja(this, nombre);
    cardPanel.add(cajaPanel.getContentPane(), "CAJA");
        cardLayout.show(cardPanel, "CAJA");
    }
    public void showAdminPanel(){
        cardLayout.show(cardPanel,"ADMINPANEL");
    }
 
    public void run() {
        frame.setVisible(true);
    }

    public static void main(String[] args) throws SQLException {
  
        SwingUtilities.invokeLater(() -> {
            try {
                new MainApplication().run();
            } catch (SQLException ex) {
                Logger.getLogger(MainApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
        }); 
    }
}
