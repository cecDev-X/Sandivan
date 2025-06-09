package com.paneles;

import com.conexion.Conexion;
import com.dao.AnimalDAO;

import com.dao.UsuarioDAO;
import com.modelo.Animal;
import com.modelo.Envio;
import com.modelo.Usuario;
import com.paneles.MainApplication;
import java.awt.Color;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class AdminPanel extends javax.swing.JFrame {

    private MainApplication app;
    int xMouse, yMouse;
    boolean swtAnimalisSelected = false, swtClientesisSelected = false, swtEnviosisSelected = false;

    private Animal animalActual = null;
    private DefaultTableModel tablaModeloAnimal;

    private Usuario usuarioActual = null;
    private DefaultTableModel tablaModeloClientes;

    private Envio envioActual = null;
    private DefaultTableModel tablaModeloEnvios;

    public AdminPanel(MainApplication app) throws SQLException {
        initComponents();
        this.app = app;
        tableAnimales.setVisible(true);
        tableClientes.setVisible(false);
        tableEnvios.setVisible(false);

        initTableModelAnimales();
        cargarDatosAnimales();
        agregarListenerSeleccion();

        initTableModelClientes();
        cargarDatosUsuario();
        agregarListenerSeleccionUsuario();

        initTableModelEnvios();
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        barraOpciones = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        btnExit = new java.awt.Panel();
        btnSalir = new javax.swing.JLabel();
        opcAnimales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        opcClientes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        tableAnimales = new javax.swing.JPanel();
        tablaAnimales = new javax.swing.JPanel();
        crudtbAnimales = new javax.swing.JScrollPane();
        tblanimal = new javax.swing.JTable();
        formularioAnimales = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_animalNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_animalEdad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_animalSexo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_animalPrecio = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_animalStock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_animalProveedor = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_animalHabitat = new javax.swing.JTextField();
        botonesAnimales = new javax.swing.JPanel();
        btnLimpiarAnimal = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        btnEliminarAnimal = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        btnConfirmarAnimal = new javax.swing.JPanel();
        lblConfirmarAnimal = new javax.swing.JLabel();
        tableClientes = new javax.swing.JPanel();
        formularioClientes = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_rfcCliente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_nombresCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_apellidosCliente = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_telefonoCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_direccionCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_correoCliente = new javax.swing.JTextField();
        txt_rolCliente = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        crudtbClientes = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        btnConfirmarCliente = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btnEliminarCliente = new javax.swing.JPanel();
        btnLimpiarCliente = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        tablaClientes = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        botonesAnimales1 = new javax.swing.JPanel();
        tableEnvios = new javax.swing.JPanel();
        tablaEnvios = new javax.swing.JPanel();
        crudtbEnvios = new javax.swing.JScrollPane();
        tblenvios = new javax.swing.JTable();
        formularioEnvios = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txt_envioIDpedido = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_envioNumSeguimiento = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_envioPaqueteria = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_envioFechaEntrega = new javax.swing.JTextField();
        botonesEnvios = new javax.swing.JPanel();
        btnConfirmarEnvio = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btnLimpiarEnvio = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        btnEliminarEnvio = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(165, 92, 91));

        barraOpciones.setBackground(new java.awt.Color(250, 216, 206));

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(118, 90, 91));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));

        btnSalir.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitLayout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 76, Short.MAX_VALUE)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        opcAnimales.setBackground(new java.awt.Color(250, 216, 206));
        opcAnimales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcAnimalesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcAnimalesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcAnimalesMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto SemiBold", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Animales");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout opcAnimalesLayout = new javax.swing.GroupLayout(opcAnimales);
        opcAnimales.setLayout(opcAnimalesLayout);
        opcAnimalesLayout.setHorizontalGroup(
            opcAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        opcAnimalesLayout.setVerticalGroup(
            opcAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        opcClientes.setBackground(new java.awt.Color(250, 216, 206));
        opcClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                opcClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                opcClientesMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto SemiBold", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Usuario");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout opcClientesLayout = new javax.swing.GroupLayout(opcClientes);
        opcClientes.setLayout(opcClientesLayout);
        opcClientesLayout.setHorizontalGroup(
            opcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, opcClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        opcClientesLayout.setVerticalGroup(
            opcClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.40png.png"))); // NOI18N
        Salir.setText("jLabel23");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout barraOpcionesLayout = new javax.swing.GroupLayout(barraOpciones);
        barraOpciones.setLayout(barraOpcionesLayout);
        barraOpcionesLayout.setHorizontalGroup(
            barraOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcAnimales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barraOpcionesLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(opcClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(barraOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        barraOpcionesLayout.setVerticalGroup(
            barraOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraOpcionesLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(opcAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(Salir)
                .addGap(50, 50, 50))
        );

        tableAnimales.setPreferredSize(new java.awt.Dimension(500, 500));
        tableAnimales.setVerifyInputWhenFocusTarget(false);

        tblanimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "edad", "sexo", "precio", "stock", "foto", "proveedor"
            }
        ));
        crudtbAnimales.setViewportView(tblanimal);

        javax.swing.GroupLayout tablaAnimalesLayout = new javax.swing.GroupLayout(tablaAnimales);
        tablaAnimales.setLayout(tablaAnimalesLayout);
        tablaAnimalesLayout.setHorizontalGroup(
            tablaAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crudtbAnimales, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        tablaAnimalesLayout.setVerticalGroup(
            tablaAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaAnimalesLayout.createSequentialGroup()
                .addComponent(crudtbAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setText("Nombre Cientifico");

        jLabel5.setText("Edad");

        jLabel6.setText("Sexo");

        jLabel7.setText("Precio");

        txt_animalPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_animalPrecioActionPerformed(evt);
            }
        });

        jLabel8.setText("Stock");

        jLabel10.setText("Proveedor");

        txt_animalProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_animalProveedorActionPerformed(evt);
            }
        });

        jLabel17.setText("Habitat");

        txt_animalHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_animalHabitatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formularioAnimalesLayout = new javax.swing.GroupLayout(formularioAnimales);
        formularioAnimales.setLayout(formularioAnimalesLayout);
        formularioAnimalesLayout.setHorizontalGroup(
            formularioAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioAnimalesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(formularioAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_animalHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_animalProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_animalStock, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_animalPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_animalSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_animalEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_animalNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        formularioAnimalesLayout.setVerticalGroup(
            formularioAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioAnimalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_animalNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_animalEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_animalSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_animalPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_animalStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_animalProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_animalHabitat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        btnLimpiarAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarAnimalMouseClicked(evt);
            }
        });

        jLabel26.setText("Limpiar");

        javax.swing.GroupLayout btnLimpiarAnimalLayout = new javax.swing.GroupLayout(btnLimpiarAnimal);
        btnLimpiarAnimal.setLayout(btnLimpiarAnimalLayout);
        btnLimpiarAnimalLayout.setHorizontalGroup(
            btnLimpiarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(btnLimpiarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLimpiarAnimalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLimpiarAnimalLayout.setVerticalGroup(
            btnLimpiarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(btnLimpiarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLimpiarAnimalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnEliminarAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarAnimalMouseClicked(evt);
            }
        });

        jLabel27.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarAnimalLayout = new javax.swing.GroupLayout(btnEliminarAnimal);
        btnEliminarAnimal.setLayout(btnEliminarAnimalLayout);
        btnEliminarAnimalLayout.setHorizontalGroup(
            btnEliminarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
            .addGroup(btnEliminarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEliminarAnimalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnEliminarAnimalLayout.setVerticalGroup(
            btnEliminarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(btnEliminarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEliminarAnimalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel27)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnConfirmarAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarAnimalMouseClicked(evt);
            }
        });

        lblConfirmarAnimal.setText("Confirmar");
        lblConfirmarAnimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmarAnimalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnConfirmarAnimalLayout = new javax.swing.GroupLayout(btnConfirmarAnimal);
        btnConfirmarAnimal.setLayout(btnConfirmarAnimalLayout);
        btnConfirmarAnimalLayout.setHorizontalGroup(
            btnConfirmarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConfirmarAnimalLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lblConfirmarAnimal)
                .addContainerGap())
        );
        btnConfirmarAnimalLayout.setVerticalGroup(
            btnConfirmarAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmarAnimalLayout.createSequentialGroup()
                .addComponent(lblConfirmarAnimal)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout botonesAnimalesLayout = new javax.swing.GroupLayout(botonesAnimales);
        botonesAnimales.setLayout(botonesAnimalesLayout);
        botonesAnimalesLayout.setHorizontalGroup(
            botonesAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesAnimalesLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnConfirmarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLimpiarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnEliminarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );
        botonesAnimalesLayout.setVerticalGroup(
            botonesAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesAnimalesLayout.createSequentialGroup()
                .addGroup(botonesAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tableAnimalesLayout = new javax.swing.GroupLayout(tableAnimales);
        tableAnimales.setLayout(tableAnimalesLayout);
        tableAnimalesLayout.setHorizontalGroup(
            tableAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableAnimalesLayout.createSequentialGroup()
                .addComponent(formularioAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableAnimalesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonesAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(tableAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableAnimalesLayout.createSequentialGroup()
                    .addGap(0, 147, Short.MAX_VALUE)
                    .addComponent(tablaAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        tableAnimalesLayout.setVerticalGroup(
            tableAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableAnimalesLayout.createSequentialGroup()
                .addComponent(formularioAnimales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonesAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(tableAnimalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tableAnimalesLayout.createSequentialGroup()
                    .addComponent(tablaAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 73, Short.MAX_VALUE)))
        );

        tableClientes.setPreferredSize(new java.awt.Dimension(500, 500));
        tableClientes.setVerifyInputWhenFocusTarget(false);

        jLabel11.setText("RFC");

        jLabel12.setText("Nombres");

        jLabel13.setText("Apellidos");

        jLabel14.setText("Telefono");

        jLabel15.setText("Direccion");

        jLabel16.setText("Correo");

        jLabel22.setText("Rol");

        jLabel2.setText("Contrasena");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RFC", "nombres", "apellidos", "telefono", "direccion", "correo"
            }
        ));
        crudtbClientes.setViewportView(tblClientes);

        btnConfirmarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarClienteMouseClicked(evt);
            }
        });

        jLabel28.setText("Confirmar");

        javax.swing.GroupLayout btnConfirmarClienteLayout = new javax.swing.GroupLayout(btnConfirmarCliente);
        btnConfirmarCliente.setLayout(btnConfirmarClienteLayout);
        btnConfirmarClienteLayout.setHorizontalGroup(
            btnConfirmarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnConfirmarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        btnConfirmarClienteLayout.setVerticalGroup(
            btnConfirmarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConfirmarClienteLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel28)
                .addGap(13, 13, 13))
        );

        btnEliminarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnEliminarClienteLayout = new javax.swing.GroupLayout(btnEliminarCliente);
        btnEliminarCliente.setLayout(btnEliminarClienteLayout);
        btnEliminarClienteLayout.setHorizontalGroup(
            btnEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
        );
        btnEliminarClienteLayout.setVerticalGroup(
            btnEliminarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
        );

        btnLimpiarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarClienteMouseClicked(evt);
            }
        });

        jLabel29.setText("Limpiar");

        javax.swing.GroupLayout btnLimpiarClienteLayout = new javax.swing.GroupLayout(btnLimpiarCliente);
        btnLimpiarCliente.setLayout(btnLimpiarClienteLayout);
        btnLimpiarClienteLayout.setHorizontalGroup(
            btnLimpiarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarClienteLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addGap(20, 20, 20))
        );
        btnLimpiarClienteLayout.setVerticalGroup(
            btnLimpiarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLimpiarClienteLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        javax.swing.GroupLayout tablaClientesLayout = new javax.swing.GroupLayout(tablaClientes);
        tablaClientes.setLayout(tablaClientesLayout);
        tablaClientesLayout.setHorizontalGroup(
            tablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        tablaClientesLayout.setVerticalGroup(
            tablaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        jLabel30.setText("Eliminar");

        javax.swing.GroupLayout formularioClientesLayout = new javax.swing.GroupLayout(formularioClientes);
        formularioClientes.setLayout(formularioClientesLayout);
        formularioClientesLayout.setHorizontalGroup(
            formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioClientesLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_rolCliente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_correoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txt_direccionCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txt_apellidosCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txt_nombresCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txt_rfcCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(txtclave, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formularioClientesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)))
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crudtbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(tablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(473, Short.MAX_VALUE))
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnConfirmarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        formularioClientesLayout.setVerticalGroup(
            formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_rfcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombresCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_apellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_telefonoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_direccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_correoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_rolCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addComponent(tablaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formularioClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(crudtbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnConfirmarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formularioClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formularioClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(btnLimpiarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout botonesAnimales1Layout = new javax.swing.GroupLayout(botonesAnimales1);
        botonesAnimales1.setLayout(botonesAnimales1Layout);
        botonesAnimales1Layout.setHorizontalGroup(
            botonesAnimales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        botonesAnimales1Layout.setVerticalGroup(
            botonesAnimales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tableClientesLayout = new javax.swing.GroupLayout(tableClientes);
        tableClientes.setLayout(tableClientesLayout);
        tableClientesLayout.setHorizontalGroup(
            tableClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableClientesLayout.createSequentialGroup()
                .addComponent(formularioClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonesAnimales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        tableClientesLayout.setVerticalGroup(
            tableClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableClientesLayout.createSequentialGroup()
                .addComponent(formularioClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(botonesAnimales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tableEnvios.setPreferredSize(new java.awt.Dimension(500, 500));
        tableEnvios.setVerifyInputWhenFocusTarget(false);

        tblenvios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nombre", "edad", "sexo", "precio", "stock", "foto", "proveedor"
            }
        ));
        crudtbEnvios.setViewportView(tblenvios);
        if (tblenvios.getColumnModel().getColumnCount() > 0) {
            tblenvios.getColumnModel().getColumn(5).setHeaderValue("stock");
            tblenvios.getColumnModel().getColumn(6).setHeaderValue("foto");
            tblenvios.getColumnModel().getColumn(7).setHeaderValue("proveedor");
        }

        javax.swing.GroupLayout tablaEnviosLayout = new javax.swing.GroupLayout(tablaEnvios);
        tablaEnvios.setLayout(tablaEnviosLayout);
        tablaEnviosLayout.setHorizontalGroup(
            tablaEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crudtbEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );
        tablaEnviosLayout.setVerticalGroup(
            tablaEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablaEnviosLayout.createSequentialGroup()
                .addComponent(crudtbEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel18.setText("ID Pedido");

        jLabel19.setText("Num. Seguimiento");

        jLabel20.setText("Paqueteria");

        jLabel21.setText("Fecha de entrega");

        javax.swing.GroupLayout formularioEnviosLayout = new javax.swing.GroupLayout(formularioEnvios);
        formularioEnvios.setLayout(formularioEnviosLayout);
        formularioEnviosLayout.setHorizontalGroup(
            formularioEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioEnviosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(formularioEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_envioFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txt_envioPaqueteria, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txt_envioNumSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txt_envioIDpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        formularioEnviosLayout.setVerticalGroup(
            formularioEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formularioEnviosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_envioIDpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_envioNumSeguimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_envioPaqueteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_envioFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        btnConfirmarEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfirmarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarEnvioMouseClicked(evt);
            }
        });

        jLabel31.setText("Confirmar");

        javax.swing.GroupLayout btnConfirmarEnvioLayout = new javax.swing.GroupLayout(btnConfirmarEnvio);
        btnConfirmarEnvio.setLayout(btnConfirmarEnvioLayout);
        btnConfirmarEnvioLayout.setHorizontalGroup(
            btnConfirmarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(btnConfirmarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnConfirmarEnvioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel31)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnConfirmarEnvioLayout.setVerticalGroup(
            btnConfirmarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(btnConfirmarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnConfirmarEnvioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel31)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnLimpiarEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarEnvioMouseClicked(evt);
            }
        });

        jLabel32.setText("Limpiar");

        javax.swing.GroupLayout btnLimpiarEnvioLayout = new javax.swing.GroupLayout(btnLimpiarEnvio);
        btnLimpiarEnvio.setLayout(btnLimpiarEnvioLayout);
        btnLimpiarEnvioLayout.setHorizontalGroup(
            btnLimpiarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(btnLimpiarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLimpiarEnvioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnLimpiarEnvioLayout.setVerticalGroup(
            btnLimpiarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(btnLimpiarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnLimpiarEnvioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel32)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        btnEliminarEnvio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarEnvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarEnvioMouseClicked(evt);
            }
        });

        jLabel33.setText("Eliminar");

        javax.swing.GroupLayout btnEliminarEnvioLayout = new javax.swing.GroupLayout(btnEliminarEnvio);
        btnEliminarEnvio.setLayout(btnEliminarEnvioLayout);
        btnEliminarEnvioLayout.setHorizontalGroup(
            btnEliminarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 95, Short.MAX_VALUE)
            .addGroup(btnEliminarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEliminarEnvioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnEliminarEnvioLayout.setVerticalGroup(
            btnEliminarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
            .addGroup(btnEliminarEnvioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEliminarEnvioLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel33)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout botonesEnviosLayout = new javax.swing.GroupLayout(botonesEnvios);
        botonesEnvios.setLayout(botonesEnviosLayout);
        botonesEnviosLayout.setHorizontalGroup(
            botonesEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesEnviosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnConfirmarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(btnLimpiarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnEliminarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        botonesEnviosLayout.setVerticalGroup(
            botonesEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesEnviosLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(botonesEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tableEnviosLayout = new javax.swing.GroupLayout(tableEnvios);
        tableEnvios.setLayout(tableEnviosLayout);
        tableEnviosLayout.setHorizontalGroup(
            tableEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableEnviosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonesEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(tableEnviosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formularioEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tableEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableEnviosLayout.createSequentialGroup()
                    .addGap(0, 145, Short.MAX_VALUE)
                    .addComponent(tablaEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        tableEnviosLayout.setVerticalGroup(
            tableEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableEnviosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(formularioEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonesEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(tableEnviosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tableEnviosLayout.createSequentialGroup()
                    .addComponent(tablaEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 77, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 631, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(128, Short.MAX_VALUE)
                    .addComponent(tableAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(tableClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(128, Short.MAX_VALUE)
                    .addComponent(tableEnvios, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tableAnimales, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tableClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 506, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(tableEnvios, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(Color.red);
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(118, 91, 92));
        btnSalir.setOpaque(true);
        btnSalir.setBorder(null);
        btnExit.setBackground(new Color(118, 91, 92));
    }//GEN-LAST:event_btnSalirMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(xMouse, yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void opcAnimalesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcAnimalesMouseEntered
        if (!swtAnimalisSelected)
            opcAnimales.setBackground(Color.GRAY);
    }//GEN-LAST:event_opcAnimalesMouseEntered

    private void opcClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcClientesMouseEntered
        if (!swtClientesisSelected)
            opcClientes.setBackground(Color.GRAY);
    }//GEN-LAST:event_opcClientesMouseEntered

    private void opcAnimalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcAnimalesMouseClicked
        opcAnimales.setBackground(new Color(118, 92, 91));
        swtAnimalisSelected = true;
        swtEnviosisSelected = false;
        swtClientesisSelected = false;
//        opcEnvios.setBackground(new Color(250, 216, 206));
        opcClientes.setBackground(new Color(250, 216, 206));

        tableAnimales.setVisible(true);
        tableClientes.setVisible(false);
        tableEnvios.setVisible(false);

    }//GEN-LAST:event_opcAnimalesMouseClicked

    private void opcClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcClientesMouseClicked
        opcClientes.setBackground(new Color(118, 92, 91));
        swtClientesisSelected = true;
        swtAnimalisSelected = false;
        swtEnviosisSelected = false;
       // opcEnvios.setBackground(new Color(250, 216, 206));
        opcAnimales.setBackground(new Color(250, 216, 206));

        tableAnimales.setVisible(false);
        tableClientes.setVisible(true);
        tableEnvios.setVisible(false);
    }//GEN-LAST:event_opcClientesMouseClicked

    private void opcAnimalesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcAnimalesMouseExited
        if (!swtAnimalisSelected) {
            opcAnimales.setBackground(new Color(250, 216, 206));
        }

    }//GEN-LAST:event_opcAnimalesMouseExited

    private void opcClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcClientesMouseExited
        if (!swtClientesisSelected)
            opcClientes.setBackground(new Color(250, 216, 206));
    }//GEN-LAST:event_opcClientesMouseExited

// EMPIEZA CODIGO DEL CRUD DE Animal
    private void btnConfirmarAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarAnimalMouseClicked
        if (!validarCamposAnimal()) {
            return;
        }

        
        boolean exito;
        String mensajeExito;

        try {
            if (animalActual == null) {
                // NUEVO REGISTRO (no establecemos ID)
                Animal nuevoAnimal = new Animal();
                // Establecer todos los campos excepto ID
                nuevoAnimal.setNombreComun(txt_animalNombre.getText().trim());
                nuevoAnimal.setEdad(Integer.parseInt(txt_animalEdad.getText().trim()));
                nuevoAnimal.setSexo(txt_animalSexo.getText().trim().charAt(0));
                nuevoAnimal.setPrecio(Double.parseDouble(txt_animalPrecio.getText().trim()));
                nuevoAnimal.setStockDisponible(Integer.parseInt(txt_animalStock.getText().trim()));

                nuevoAnimal.setCodigoProveedor(Integer.parseInt(txt_animalProveedor.getText().trim()));
                nuevoAnimal.setCodigoHabitat(txt_animalHabitat.getText().trim());

                exito = AnimalDAO.insertar(nuevoAnimal);
                mensajeExito = "Registro creado correctamente con ID: " + nuevoAnimal.getIdAnimal();
            } else {
                // ACTUALIZACIÓN (usamos el ID existente)
                animalActual.setNombreComun(txt_animalNombre.getText().trim());
                animalActual.setEdad(Integer.parseInt(txt_animalEdad.getText().trim()));
                animalActual.setSexo(txt_animalSexo.getText().trim().charAt(0));
                animalActual.setPrecio(Double.parseDouble(txt_animalPrecio.getText().trim()));
                animalActual.setStockDisponible(Integer.parseInt(txt_animalStock.getText().trim()));

                animalActual.setCodigoProveedor(Integer.parseInt(txt_animalProveedor.getText().trim()));
                animalActual.setCodigoHabitat(txt_animalHabitat.getText().trim());

                exito = AnimalDAO.actualizar(animalActual);
                mensajeExito = "Registro actualizado correctamente";
            }

            if (exito) {
                JOptionPane.showMessageDialog(this,
                        mensajeExito,
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarDatosAnimales();
                limpiarFormularioAnimal();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error al guardar el registro",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Error en los formatos numéricos: " + e.getMessage(),
                    "Error de formato", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error inesperado: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarAnimalMouseClicked

    private void btnLimpiarAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarAnimalMouseClicked
        limpiarFormularioAnimal();
    }//GEN-LAST:event_btnLimpiarAnimalMouseClicked

    private void btnEliminarAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarAnimalMouseClicked

        if (animalActual == null || animalActual.getIdAnimal() == 0) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un registro existente para eliminar",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Está seguro de eliminar el animal: " + animalActual.getNombreComun() + "?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
           
            if (AnimalDAO.eliminar(animalActual.getIdAnimal())) {
                JOptionPane.showMessageDialog(this,
                        "Registro eliminado correctamente",
                        "Éxito", JOptionPane.INFORMATION_MESSAGE);
                cargarDatosAnimales();
                limpiarFormularioAnimal();
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error al eliminar el registro",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEliminarAnimalMouseClicked

    private void initTableModelAnimales() {
        // Columnas deben coincidir con los atributos de Animal
        String[] columnNames = {
            "ID", "Nombre", "Edad", "Sexo",
            "Precio", "Stock", "Proveedor", "Hábitat"
        };

        tablaModeloAnimal = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer tabla no editable
            }
        };

        tblanimal.setModel(tablaModeloAnimal);
    }

    private void cargarDatosAnimales() {
        // Limpiar tabla existente
        tablaModeloAnimal.setRowCount(0);

        // Obtener datos del DAO
        List<Animal> animales = AnimalDAO.obtenerTodosAnimales();

        // Llenar la tabla con los objetos Animal
        for (Animal animal : animales) {
            Object[] rowData = {
                animal.getIdAnimal(),
                animal.getNombreComun(),
                animal.getEdad(),
                animal.getSexo(),
                animal.getPrecio(),
                animal.getStockDisponible(),
                animal.getCodigoProveedor(),
                animal.getCodigoHabitat()
            };
            tablaModeloAnimal.addRow(rowData);
        }

        ajustarAnchoColumnasAnimales();
    }

    private void ajustarAnchoColumnasAnimales() {
        tblanimal.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        int[] anchos = {50, 150, 40, 40, 60, 40, 200, 80};
        for (int i = 0; i < anchos.length; i++) {
            tblanimal.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private boolean validarCamposAnimal() {
        if (txt_animalNombre.getText().trim().isEmpty()
                || txt_animalEdad.getText().trim().isEmpty()
                || txt_animalSexo.getText().trim().isEmpty()
                || txt_animalPrecio.getText().trim().isEmpty()
                || txt_animalStock.getText().trim().isEmpty()
                || txt_animalProveedor.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor complete todos los campos obligatorios",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // Validaciones específicas
        try {
            Integer.parseInt(txt_animalEdad.getText().trim());
            Double.parseDouble(txt_animalPrecio.getText().trim());
            Integer.parseInt(txt_animalStock.getText().trim());
            Integer.parseInt(txt_animalProveedor.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Edad, Precio, Stock y Proveedor deben ser valores numéricos",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (txt_animalSexo.getText().trim().length() != 1
                || !"MF".contains(txt_animalSexo.getText().trim().toUpperCase())) {
            JOptionPane.showMessageDialog(this,
                    "El sexo debe ser 'M' o 'F'",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void llenarFormularioAnimal(Animal animal) {
        animalActual = animal;

        txt_animalNombre.setText(animal.getNombreComun());
        txt_animalEdad.setText(String.valueOf(animal.getEdad()));
        txt_animalSexo.setText(String.valueOf(animal.getSexo()));
        txt_animalPrecio.setText(String.valueOf(animal.getPrecio()));
        txt_animalStock.setText(String.valueOf(animal.getStockDisponible()));

        txt_animalProveedor.setText(String.valueOf(animal.getCodigoProveedor()));
        txt_animalHabitat.setText(animal.getCodigoHabitat());

        lblConfirmarAnimal.setText("Actualizar");
    }

    private void limpiarFormularioAnimal() {
        animalActual = null;

        txt_animalNombre.setText("");
        txt_animalEdad.setText("");
        txt_animalSexo.setText("");
        txt_animalPrecio.setText("");
        txt_animalStock.setText("");
   
        txt_animalProveedor.setText("");
        txt_animalHabitat.setText("");
        lblConfirmarAnimal.setText("Guardar");
        tblanimal.clearSelection();
        animalActual = null;
        txt_animalNombre.requestFocus();
    }

    private void agregarListenerSeleccion() {
        tblanimal.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int filaSeleccionada = tblanimal.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    int idAnimal = (int) tblanimal.getValueAt(filaSeleccionada, 0);
                    Animal animalSeleccionado = AnimalDAO.obtenerPorId(idAnimal);
                    if (animalSeleccionado != null) {
                        llenarFormularioAnimal(animalSeleccionado);
                    }
                }
            }
        });
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //EMPIEZA CODIGO DEL CRUD DE Usuario
    

    private void initTableModelClientes() {
        String[] columnNames = {
            "RFC", "Nombres", "Apellidos", "Teléfono",
            "Dirección", "Correo", "id Rol"
        };

        tablaModeloClientes = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer tabla no editable
            }
        };

        tblClientes.setModel(tablaModeloClientes);
    }

    private void cargarDatosUsuario() throws SQLException {
        tablaModeloClientes.setRowCount(0);

        List<Usuario> usuarios = UsuarioDAO.listarTodos();

        for (Usuario usuario : usuarios) {
            Object[] rowData = {
                usuario.getRfc(),
                usuario.getNombres(),
                usuario.getApellidos(),
                usuario.getTelefono(),
                usuario.getDireccion(),
                usuario.getCorreo(),
                usuario.getIdRol()
            };
            tablaModeloClientes.addRow(rowData);
        }

        ajustarAnchoColumnasClientes();
    }

    private void ajustarAnchoColumnasClientes() {
        tblClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        int[] anchos = {120, 150, 150, 100, 200, 150};
        for (int i = 0; i < anchos.length; i++) {
            tblClientes.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private boolean validarCamposCliente() {
        if (txt_rfcCliente.getText().trim().isEmpty()
                || txt_nombresCliente.getText().trim().isEmpty()
                || txt_apellidosCliente.getText().trim().isEmpty()
                || txt_telefonoCliente.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor complete todos los campos obligatorios (RFC, Nombres, Apellidos, Teléfono)",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // Validar formato de RFC (ejemplo básico)
        String rfc = txt_rfcCliente.getText().trim().toUpperCase();
        if (!rfc.matches("^[A-Z]{4}[0-9]{6}[A-Z0-9]{3}$")) {
            JOptionPane.showMessageDialog(this,
                    "El RFC debe tener formato: AAAA999999AAA (13 caracteres)",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // Validar formato de correo si está presente
        if (!txt_correoCliente.getText().trim().isEmpty()
                && !txt_correoCliente.getText().trim().matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
            JOptionPane.showMessageDialog(this,
                    "El correo electrónico no tiene un formato válido",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void llenarFormularioUsuario(Usuario usuario) {
        usuarioActual = usuario;

        txt_rfcCliente.setText(usuario.getRfc());
        txt_nombresCliente.setText(usuario.getNombres());
        txt_apellidosCliente.setText(usuario.getApellidos());
        txt_telefonoCliente.setText(usuario.getTelefono());
        txt_direccionCliente.setText(usuario.getDireccion());
        txt_correoCliente.setText(usuario.getCorreo());
        txt_rolCliente.setText(String.valueOf(usuario.getIdRol()));

        // Deshabilitar RFC para edición (es la clave primaria)
        txt_rfcCliente.setEnabled(false);
    }

    private void limpiarFormularioUsuario() {
        usuarioActual = null;

        txt_rfcCliente.setText("");
        txt_nombresCliente.setText("");
        txt_apellidosCliente.setText("");
        txt_telefonoCliente.setText("");
        txt_direccionCliente.setText("");
        txt_correoCliente.setText("");
        txt_rolCliente.setText("");

        // Habilitar RFC para nuevo registro
        txt_rfcCliente.setEnabled(true);
        txt_rfcCliente.requestFocus();
    }

    private void agregarListenerSeleccionUsuario() {
        tblClientes.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int filaSeleccionada = tblClientes.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    String rfcUsuario = (String) tblClientes.getValueAt(filaSeleccionada, 0);
                    Usuario usuarioSeleccionado = null;
                    try {
                        usuarioSeleccionado = UsuarioDAO.obtenerPorRfc(rfcUsuario);
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (usuarioSeleccionado != null) {
                        llenarFormularioUsuario(usuarioSeleccionado);
                    }
                }
            }
        });
    }

    private void btnConfirmarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarClienteMouseClicked
        try {
            if(UsuarioDAO.correoUnico(txt_correoCliente.getText())){
                
                if (!validarCamposCliente()) {
                    return;
                }
                boolean exito;
                String mensajeExito;
                
                try {
                    if (usuarioActual == null) {
                        // NUEVO REGISTRO
                        Usuario nuevoUsuario = new Usuario();
                        nuevoUsuario.setRfc(txt_rfcCliente.getText().trim().toUpperCase());
                        nuevoUsuario.setNombres(txt_nombresCliente.getText().trim());
                        nuevoUsuario.setApellidos(txt_apellidosCliente.getText().trim());
                        nuevoUsuario.setTelefono(txt_telefonoCliente.getText().trim());
                        nuevoUsuario.setDireccion(txt_direccionCliente.getText().trim());
                        nuevoUsuario.setCorreo(txt_correoCliente.getText().trim());
                        nuevoUsuario.setClavesita(txtclave.getText().trim());
                        nuevoUsuario.setIdRol(Integer.parseInt(txt_rolCliente.getText()));
                        
                        exito = UsuarioDAO.crearUsuario(nuevoUsuario);
                        mensajeExito = "Cliente registrado correctamente";
                    } else {
                        // ACTUALIZACIÓN
                        usuarioActual.setNombres(txt_nombresCliente.getText().trim());
                        usuarioActual.setApellidos(txt_apellidosCliente.getText().trim());
                        usuarioActual.setTelefono(txt_telefonoCliente.getText().trim());
                        usuarioActual.setDireccion(txt_direccionCliente.getText().trim());
                        usuarioActual.setCorreo(txt_correoCliente.getText().trim());
                        
                        exito = UsuarioDAO.actualizarUsuario(usuarioActual);
                        mensajeExito = "Cliente actualizado correctamente";
                    }
                    
                    if (exito) {
                        JOptionPane.showMessageDialog(this,
                                mensajeExito,
                                "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        cargarDatosUsuario();
                        limpiarFormularioUsuario();
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Error al guardar el cliente",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,
                            "Error inesperado: " + e.getMessage(),
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                limpiarFormularioUsuario();}else{JOptionPane.showMessageDialog(null, "correo ya existente");}
        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConfirmarClienteMouseClicked

    private void btnLimpiarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarClienteMouseClicked

        limpiarFormularioUsuario();
    }//GEN-LAST:event_btnLimpiarClienteMouseClicked

    private void btnEliminarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarClienteMouseClicked
        if (usuarioActual == null || usuarioActual.getRfc() == null) {
            JOptionPane.showMessageDialog(this,
                    "Seleccione un cliente existente para eliminar",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this,
                "¿Está seguro de eliminar al cliente: " + usuarioActual.getNombres() + " " + usuarioActual.getApellidos() + "?",
                "Confirmar Eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                if (UsuarioDAO.eliminarUsuario(usuarioActual.getRfc())) {
                    JOptionPane.showMessageDialog(this,
                            "Cliente eliminado correctamente",
                            "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    cargarDatosUsuario();
                    limpiarFormularioUsuario();
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Error al eliminar el cliente",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEliminarClienteMouseClicked
    /////////////////////////////////////////////////////////////////////////////////
    //Empieza codigo Envio
                                                                                                                          
    private void initTableModelEnvios() {
        // Deshabilitar campo de dirección y hacerlo no editable
        String[] columnNames = {
            "ID Envío", "ID Pedido", "Núm. Seguimiento",
            "Paquetería", "Fecha Entrega", "Dirección"
        };

        tablaModeloEnvios = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Hacer tabla no editable
            }
        };

        tblenvios.setModel(tablaModeloEnvios);
    }



    private void ajustarAnchoColumnasEnvios() {
        tblenvios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        int[] anchos = {80, 80, 150, 100, 100, 200};
        for (int i = 0; i < anchos.length; i++) {
            tblenvios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
    }

    private boolean validarCamposEnvio() {
        // Eliminamos la validación para el campo de dirección
        if (txt_envioIDpedido.getText().trim().isEmpty()
                || txt_envioNumSeguimiento.getText().trim().isEmpty()
                || txt_envioPaqueteria.getText().trim().isEmpty()
                || txt_envioFechaEntrega.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this,
                    "Por favor complete todos los campos obligatorios",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            // Validar que el ID de pedido sea numérico
            Integer.parseInt(txt_envioIDpedido.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "ID de pedido debe ser un número válido",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            // Validar formato de fecha
            Date.valueOf(txt_envioFechaEntrega.getText().trim());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this,
                    "Fecha debe tener formato YYYY-MM-DD",
                    "Validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void llenarFormularioEnvio(Envio envio) {
        envioActual = envio;

        txt_envioIDpedido.setText(String.valueOf(envio.getIdPedido()));
        txt_envioNumSeguimiento.setText(envio.getNumSeguimiento());
        txt_envioPaqueteria.setText(envio.getPaqueteria());
        txt_envioFechaEntrega.setText(envio.getFechaEntrega().toString());

        // Deshabilitar edición del ID de pedido en actualización
        txt_envioIDpedido.setEnabled(false);
        jLabel31.setText("Actualizar");
    }

    private void limpiarFormularioEnvio() {
        envioActual = null;

        txt_envioIDpedido.setText("");
        txt_envioNumSeguimiento.setText("");
        txt_envioPaqueteria.setText("");
        txt_envioFechaEntrega.setText("");

        jLabel31.setText("Guardar");
        tblenvios.clearSelection();
        txt_envioIDpedido.requestFocus();
        txt_envioIDpedido.setEnabled(true);
    }

    private void btnConfirmarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarEnvioMouseClicked

    }//GEN-LAST:event_btnConfirmarEnvioMouseClicked


    private void btnLimpiarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarEnvioMouseClicked
        limpiarFormularioEnvio();
    }//GEN-LAST:event_btnLimpiarEnvioMouseClicked

    private void btnEliminarEnvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarEnvioMouseClicked

    }//GEN-LAST:event_btnEliminarEnvioMouseClicked

    private void txt_animalHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_animalHabitatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_animalHabitatActionPerformed

    //////////////////////////////////////////////////////////////////////////////////77
    private void txt_animalProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_animalProveedorActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_txt_animalProveedorActionPerformed

    private void txt_animalPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_animalPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_animalPrecioActionPerformed

    private void lblConfirmarAnimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmarAnimalMouseClicked

    }//GEN-LAST:event_lblConfirmarAnimalMouseClicked

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
    int op=  JOptionPane.showConfirmDialog(rootPane, "¿seguro que quiere salir?", "salir?", JOptionPane.YES_NO_OPTION);
       if(op==0){
       app.showLogin();}
       else if(op==1){}
    }//GEN-LAST:event_SalirMouseClicked

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Salir;
    private javax.swing.JPanel barraOpciones;
    private javax.swing.JPanel botonesAnimales;
    private javax.swing.JPanel botonesAnimales1;
    private javax.swing.JPanel botonesEnvios;
    private javax.swing.JPanel btnConfirmarAnimal;
    private javax.swing.JPanel btnConfirmarCliente;
    private javax.swing.JPanel btnConfirmarEnvio;
    private javax.swing.JPanel btnEliminarAnimal;
    private javax.swing.JPanel btnEliminarCliente;
    private javax.swing.JPanel btnEliminarEnvio;
    private java.awt.Panel btnExit;
    private javax.swing.JPanel btnLimpiarAnimal;
    private javax.swing.JPanel btnLimpiarCliente;
    private javax.swing.JPanel btnLimpiarEnvio;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JScrollPane crudtbAnimales;
    private javax.swing.JScrollPane crudtbClientes;
    private javax.swing.JScrollPane crudtbEnvios;
    private javax.swing.JPanel formularioAnimales;
    private javax.swing.JPanel formularioClientes;
    private javax.swing.JPanel formularioEnvios;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmarAnimal;
    private javax.swing.JPanel opcAnimales;
    private javax.swing.JPanel opcClientes;
    private javax.swing.JPanel tablaAnimales;
    private javax.swing.JPanel tablaClientes;
    private javax.swing.JPanel tablaEnvios;
    private javax.swing.JPanel tableAnimales;
    private javax.swing.JPanel tableClientes;
    private javax.swing.JPanel tableEnvios;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblanimal;
    private javax.swing.JTable tblenvios;
    private javax.swing.JTextField txt_animalEdad;
    private javax.swing.JTextField txt_animalHabitat;
    private javax.swing.JTextField txt_animalNombre;
    private javax.swing.JTextField txt_animalPrecio;
    private javax.swing.JTextField txt_animalProveedor;
    private javax.swing.JTextField txt_animalSexo;
    private javax.swing.JTextField txt_animalStock;
    private javax.swing.JTextField txt_apellidosCliente;
    private javax.swing.JTextField txt_correoCliente;
    private javax.swing.JTextField txt_direccionCliente;
    private javax.swing.JTextField txt_envioFechaEntrega;
    private javax.swing.JTextField txt_envioIDpedido;
    private javax.swing.JTextField txt_envioNumSeguimiento;
    private javax.swing.JTextField txt_envioPaqueteria;
    private javax.swing.JTextField txt_nombresCliente;
    private javax.swing.JTextField txt_rfcCliente;
    private javax.swing.JTextField txt_rolCliente;
    private javax.swing.JTextField txt_telefonoCliente;
    private javax.swing.JTextField txtclave;
    // End of variables declaration//GEN-END:variables

}
