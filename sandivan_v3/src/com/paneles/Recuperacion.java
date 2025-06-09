package com.paneles;

import com.conexion.Conexion;
import com.dao.UsuarioDAO;
import com.modelo.Usuario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;

public class Recuperacion extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    private static final String EMAIL_EMPRESA = "sandivaninfo@gmail.com ";//TU CORREO
    private static final String PASSWORD_EMPRESA = "pydnviselkrelyga"; //CONTRASEÑA
    private Usuario userEncontrado = null;
   
    private MainApplication app;
    
    public Recuperacion(MainApplication app) {
        initComponents();
        opacarElementos();
        this.app = app;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etiNotificacion = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnRecuperar = new javax.swing.JPanel();
        lblrecup = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new java.awt.Panel();
        btnSalir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login_icon_137429.png"))); // NOI18N
        jLabel2.setText("Home");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 37, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel3.setText("Recuperación");
        background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setText("Ingrese su email registrado");
        background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        etiNotificacion.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        background.add(etiNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 130, 40));

        txtCorreo.setBackground(new java.awt.Color(250, 216, 206));
        txtCorreo.setBorder(null);
        background.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 240, 40));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 240, 10));

        btnRecuperar.setBackground(new java.awt.Color(250, 204, 51));
        btnRecuperar.setForeground(new java.awt.Color(255, 204, 51));
        btnRecuperar.setName(""); // NOI18N
        btnRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecuperarMouseClicked(evt);
            }
        });

        lblrecup.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lblrecup.setText("Recuperar");

        javax.swing.GroupLayout btnRecuperarLayout = new javax.swing.GroupLayout(btnRecuperar);
        btnRecuperar.setLayout(btnRecuperarLayout);
        btnRecuperarLayout.setHorizontalGroup(
            btnRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(btnRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRecuperarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblrecup)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnRecuperarLayout.setVerticalGroup(
            btnRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(btnRecuperarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRecuperarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblrecup)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(btnRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/c57c3afe-871c-4339-a526-4f86e5327e36.jpg"))); // NOI18N
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));

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
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void btnRecuperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecuperarMouseClicked
        
        etiNotificacion.setText("Espere...");
        try {
            // 1. Verificar si el usuario existe
            userEncontrado = UsuarioDAO.usuarioEncontrado(txtCorreo.getText());

            // 2. Si el usuario existe (no es nulo)
            if (userEncontrado != null) {
                try {
                    // 3. Enviar email con las credenciales
                    ut.EmailConnect.sendEmail(
                            EMAIL_EMPRESA,
                            PASSWORD_EMPRESA,
                            userEncontrado.getNombres(),
                            userEncontrado.getClavesita(),
                            userEncontrado.getCorreo()
                    );

                    // 4. Mostrar mensaje de éxito
                    etiNotificacion.setText("Revisa tu correo electrónico.");
                    
                } catch (MessagingException ex) {
                    Logger.getLogger(Recuperacion.class.getName()).log(Level.SEVERE, "Error al enviar el email", ex);
                    etiNotificacion.setText("Error al enviar el correo. Intente nuevamente.");
                }
            } else {
                // 5. Si el usuario no existe
                etiNotificacion.setText("Correo no registrado.");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Recuperacion.class.getName()).log(Level.SEVERE, "Error al buscar el usuario", ex);
            etiNotificacion.setText("Error al verificar el correo.");
        }

    }//GEN-LAST:event_btnRecuperarMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        app.showLogin();
    }//GEN-LAST:event_jLabel2MouseClicked
    
    private void opacarElementos() {
        txtCorreo.setOpaque(false);
        txtCorreo.setBackground(new Color(0, 0, 0, 0));
        txtCorreo.setBorder(null);
        
        btnSalir.setOpaque(false);
        btnSalir.setBackground(new Color(0, 0, 0, 0));
        btnSalir.setBorder(null);
        btnSalir.setForeground(Color.WHITE);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private java.awt.Panel btnExit;
    private javax.swing.JPanel btnRecuperar;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel etiNotificacion;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblrecup;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
