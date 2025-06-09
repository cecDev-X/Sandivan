package com.paneles;

import com.conexion.Conexion;

import com.dao.UsuarioDAO;
import com.modelo.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    int xMouse, yMouse;
    Usuario user;
    public static String usuario;
    private MainApplication app;

    public Login(MainApplication app) {
        initComponents();
        opacarElementos();
        this.app = app;
  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblNotificacion = new javax.swing.JLabel();
        linkPasswordOlvidada = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVerPass = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new java.awt.Panel();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(740, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel7.setText("Contraseña");
        background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, 20));

        lblNotificacion.setBackground(new java.awt.Color(255, 255, 153));
        lblNotificacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNotificacion.setForeground(new java.awt.Color(255, 0, 0));
        lblNotificacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        background.add(lblNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 280, 40));

        linkPasswordOlvidada.setFont(new java.awt.Font("Roboto Light", 2, 14)); // NOI18N
        linkPasswordOlvidada.setText("Contraseña olvidada");
        linkPasswordOlvidada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        linkPasswordOlvidada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkPasswordOlvidadaMouseClicked(evt);
            }
        });
        background.add(linkPasswordOlvidada, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 130, -1));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_icon_137429.png"))); // NOI18N
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEntrarMouseClicked(evt);
            }
        });
        background.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 50, 40));

        txtCorreo.setBackground(new java.awt.Color(250, 216, 206));
        txtCorreo.setBorder(null);
        txtCorreo.setOpaque(true);
        background.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 240, 40));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 240, 10));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 240, 10));

        txtPassword.setBackground(new java.awt.Color(250, 217, 206));
        txtPassword.setBorder(null);
        txtPassword.setOpaque(true);
        background.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 240, 40));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel4.setText("Usuario");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setText("Iniciar Sesion");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 3, 48)); // NOI18N
        jLabel2.setText("Sandivan");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 220, 40));

        btnVerPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ojito4.png"))); // NOI18N
        btnVerPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerPassMouseClicked(evt);
            }
        });
        background.add(btnVerPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c57c3afe-871c-4339-a526-4f86e5327e36.jpg"))); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

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
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnExitLayout.createSequentialGroup()
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 684, Short.MAX_VALUE)))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(headerLayout.createSequentialGroup()
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void linkPasswordOlvidadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkPasswordOlvidadaMouseClicked
        limpiarCampos();
        this.dispose();
        app.showRecuperacion();

    }//GEN-LAST:event_linkPasswordOlvidadaMouseClicked

    private void btnEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseClicked
        usuario="";
        String correo = txtCorreo.getText();
        String password = new String(txtPassword.getPassword());

        if(ut.Validaciones.validarCorreo(correo)){
        try {
            user = UsuarioDAO.autenticar(correo, password);
            if (user != null) {
                String descripcionRol = UsuarioDAO.rolUsuario(user);

                if ("Administrador".equals(descripcionRol)) {
                    app.showAdminPanel();
                    txtPassword.setText("");
                    txtCorreo.setText("");
                } else if ("Cajero".equals(descripcionRol)) {
                  Usuario nombre=  UsuarioDAO.buscarcorreo(txtCorreo.getText());
                 
                    app.showCaja(nombre.getNombres());
                    
                    txtPassword.setText("");
                    txtCorreo.setText("");
                } else {
                    lblNotificacion.setText("Rol no reconocido.");
                }
            } else {
                lblNotificacion.setText("Credenciales no válidas.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            lblNotificacion.setText("Error de base de datos.");
        } catch (Exception ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            lblNotificacion.setText("Error inesperado.");
        }
        }else{
            lblNotificacion.setText("No es un email válido.");
        }

    }//GEN-LAST:event_btnEntrarMouseClicked

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(xMouse, yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

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

    private void btnVerPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerPassMouseClicked
        if (txtPassword.getEchoChar() == '\u0000') {
            txtPassword.setEchoChar('*');
        } else {
            txtPassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_btnVerPassMouseClicked

    private void limpiarCampos() {
        txtCorreo.setText("");
        txtPassword.setText("");
        lblNotificacion.setText("");
    }

    private void opacarElementos() {
        txtCorreo.setOpaque(false);
        txtCorreo.setBackground(new Color(0, 0, 0, 0));
        txtCorreo.setBorder(null);
        txtPassword.setOpaque(false);
        txtPassword.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setBorder(null);
        btnSalir.setOpaque(false);
        btnSalir.setBackground(new Color(0, 0, 0, 0));
        btnSalir.setBorder(null);
        btnSalir.setForeground(Color.WHITE);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel btnEntrar;
    private java.awt.Panel btnExit;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnVerPass;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblNotificacion;
    private javax.swing.JLabel linkPasswordOlvidada;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
