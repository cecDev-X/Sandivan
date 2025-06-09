package com.paneles;

import com.conexion.Conexion;
import com.dao.AnimalDAO;
import static com.dao.AnimalDAO.obtenerAnimalesPrecioYNombre;
import com.dao.CajaDAO;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.modelo.Animal;
import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class caja extends javax.swing.JFrame {

    int xMouse, yMouse;
    DefaultTableModel modeloTabla = new DefaultTableModel();

    private static final String NombreEmpresa = "Tienda de Animales";
    private static final String CorreoRemitente = "ivanpazcruz6@gmail.com"; // Cambiar por tu correo
    private static final String ContraseñaRemitente = "thyzdastnnsogoyh"; // Cambiar por tu contraseña
    private String rutaPDF;
 
    private MainApplication app;
   
    public caja(MainApplication app,String nombre) {
        initComponents();
        this.app = app;
        getContentPane().setBackground(new Color(230, 240, 255));
        inicializarTabla();
        TablaBuscar("");
        totalPago.setEditable(false);
       txtUser.setText(nombre);
    }
    
   
   
    private void inicializarTabla() {
        modeloTabla = new DefaultTableModel(); // asegúrate de declarar modeloTabla arriba como atributo

        modeloTabla.addColumn("cantidad");
        modeloTabla.addColumn("producto");
        modeloTabla.addColumn("precio");

        tabla.setModel(modeloTabla);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(15);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(110);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(15);
        tabla.doLayout();
        
    }

    public void mostrarTabla(String c, String a, String p) {
        if (modeloTabla.getColumnCount() == 0) {
            modeloTabla.addColumn("cantidad");
            modeloTabla.addColumn("producto");
            modeloTabla.addColumn("precio");

            tabla.setModel(modeloTabla);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(15);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(110);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(15);
            tabla.doLayout();
        }

        if (c == null || c.trim().isEmpty() || p == null || p.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cantidad o precio inválidos.");
            return;
        }

        try {
            double cpar = Double.parseDouble(c);
            double par = Double.parseDouble(p);
            double sub = cpar * par;
            String subT = String.format("%.2f", sub); // con 2 decimales
            Object[] fila = {c, a, subT};
            modeloTabla.addRow(fila);
            actualizarTotal();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir cantidad o precio. Asegúrate de que sean números.");
        }
    }

    public void TablaBuscar(String textoBusqueda) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Animal");
        modelo.addColumn("Precio");

        List<Animal> precioyanimal = obtenerAnimalesPrecioYNombre(textoBusqueda);

        for (Animal a : precioyanimal) {
            Object[] fila = {a.getNombreComun(), a.getPrecio()};
            modelo.addRow(fila);
        }

        buscar.setModel(modelo);

        buscar.getColumnModel().getColumn(0).setPreferredWidth(40);
        buscar.getColumnModel().getColumn(1).setPreferredWidth(10);

        buscar.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                if (value instanceof Number) {
                    value = String.format("$%,.2f", ((Number) value).doubleValue());
                    setHorizontalAlignment(SwingConstants.RIGHT);
                }
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        });

        buscar.doLayout();
    }

    private void actualizarTotal() {
        double total = 0.0;

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String valor = modeloTabla.getValueAt(i, 2).toString().replace("$", "").replace(",", "");
            try {
                total += Double.parseDouble(valor);
            } catch (NumberFormatException e) {

            }
        }

        totalPago.setText(String.format("%.2f", total));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        buscar = new javax.swing.JTable();
        txtBusqueda = new javax.swing.JTextField();
        totalPago = new javax.swing.JTextField();
        Pagar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JLabel();
        mijpanelmodificado1 = new componentemodificadooo.mijpanelmodificado();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar28.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
                tablaAncestorRemoved(evt);
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jLabel1.setText("Producto");

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.40png.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
        });

        buscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(buscar);

        totalPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPagoActionPerformed(evt);
            }
        });

        Pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pago-con-tarjeta-de-credito (1).png"))); // NOI18N
        Pagar.setText("Pagar");
        Pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PagarMouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar28.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuario50.png"))); // NOI18N
        jLabel4.setText("IconoU");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addGap(233, 233, 233)
                                .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(mijpanelmodificado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(Salir))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mijpanelmodificado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Pagar)
                        .addComponent(totalPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        int salir = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "SALIR", JOptionPane.YES_NO_OPTION);
        if (salir == 0) {
            app.showLogin();
        }

    }//GEN-LAST:event_SalirMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        TablaBuscar(txtBusqueda.getText());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked

        int fila = buscar.getSelectedRow();

        if (fila < 0) {
            return; // No se seleccionó ninguna fila
        }

        try {
            String producto = (String) buscar.getValueAt(fila, 0);
            int idAnimal = CajaDAO.obtenerIdAnimal(producto);

            if (idAnimal == -1) {
                JOptionPane.showMessageDialog(null, "Producto no encontrado en la base de datos");
                return;
            }

            String input = JOptionPane.showInputDialog("Cuantos productos desea agregar");
            if (input == null) {
                return; // Usuario canceló
            }
            int cantidad = Integer.parseInt(input);
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número mayor a cero");
                return;
            }

            int stockActual = CajaDAO.obtenerStockActual(idAnimal);

            if (stockActual < cantidad) {
                JOptionPane.showMessageDialog(null,
                        "Stock insuficiente para: " + producto
                        + "\nStock disponible: " + stockActual);
                return;
            }

            // Actualizar stock y mostrar en tabla
            CajaDAO.actualizarStock(idAnimal, cantidad);
            String precio = buscar.getValueAt(fila, 1).toString();
            mostrarTabla(String.valueOf(cantidad), producto, precio);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de base de datos: " + ex.getMessage());
            Logger.getLogger(caja.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_buscarMouseClicked


    private void tablaAncestorRemoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaAncestorRemoved

    }//GEN-LAST:event_tablaAncestorRemoved

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int borrar = tabla.getSelectedRow();
        if (borrar < 0) {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila a eliminar");
        } else {
            int opc = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar el producto", "Eliminar productos", JOptionPane.YES_NO_OPTION);
            if (String.valueOf(opc).equals("0")) {
                modeloTabla.removeRow(borrar);
                actualizarTotal();
            }

        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void PagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagarMouseClicked

        int totalFilas = tabla.getRowCount();

        if (totalFilas > 0) {
            try {
                // Preparar lista de productos a pagar
                List<Map<String, Object>> productos = new ArrayList<>();

                for (int fila = 0; fila < totalFilas; fila++) {
                    Map<String, Object> producto = new HashMap<>();
                    producto.put("cantidad", Integer.parseInt(tabla.getValueAt(fila, 0).toString()));
                    producto.put("nombre", tabla.getValueAt(fila, 1).toString());
                    productos.add(producto);
                }

                // Procesar pago a través del DAO (llamada estática)
                boolean pagoExitoso = CajaDAO.procesarPago(productos);

                if (pagoExitoso) {
                    JOptionPane.showMessageDialog(null, "Pago realizado correctamente para todos los productos.");
                    
                    enviarTicketConfirm();
                    modeloTabla.setNumRows(0);
                    totalPago.setText("00.00");
                } else {
                    JOptionPane.showMessageDialog(null, "Error: producto no encontrado o stock insuficiente.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos para pagar.");
        }

    }//GEN-LAST:event_PagarMouseClicked

    public void crearPDFTicketCompra(String nombreCliente, String correoCliente) {
        try {

            // Generar nombre único para el archivo PDF
            String timestamp;
            timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
            rutaPDF = "ticket_compra_" + timestamp + ".pdf";

            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(rutaPDF));
            documento.open();

            // Fuentes
            Font fuenteTitulo = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD, BaseColor.DARK_GRAY);
            Font fuenteSubtitulo = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
            Font fuenteTexto = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.BLACK);
            Font fuenteTotal = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.RED);

            // Encabezado
            Paragraph titulo = new Paragraph(NombreEmpresa, fuenteTitulo);
            titulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(titulo);

            Paragraph subtitulo = new Paragraph("Ticket de Compra", fuenteSubtitulo);
            subtitulo.setAlignment(Element.ALIGN_CENTER);
            documento.add(subtitulo);

            documento.add(Chunk.NEWLINE);

            // Información del cliente
            PdfPTable tablaCliente = new PdfPTable(2);
            tablaCliente.setWidthPercentage(100);

            agregarCelda(tablaCliente, "Cliente:", fuenteTexto, Element.ALIGN_LEFT);
            agregarCelda(tablaCliente, nombreCliente, fuenteTexto, Element.ALIGN_LEFT);
            agregarCelda(tablaCliente, "Correo:", fuenteTexto, Element.ALIGN_LEFT);
            agregarCelda(tablaCliente, correoCliente, fuenteTexto, Element.ALIGN_LEFT);
            agregarCelda(tablaCliente, "Fecha:", fuenteTexto, Element.ALIGN_LEFT);
            agregarCelda(tablaCliente, new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()), fuenteTexto, Element.ALIGN_LEFT);
            documento.add(tablaCliente);
            documento.add(Chunk.NEWLINE);

            // Tabla de productos
            PdfPTable tablaProductos = new PdfPTable(4);
            tablaProductos.setWidthPercentage(100);
            tablaProductos.setWidths(new float[]{2, 4, 2, 2});

            // Encabezados
            agregarCelda(tablaProductos, "Cantidad", fuenteSubtitulo, Element.ALIGN_CENTER);
            agregarCelda(tablaProductos, "Producto", fuenteSubtitulo, Element.ALIGN_CENTER);
            agregarCelda(tablaProductos, "Precio", fuenteSubtitulo, Element.ALIGN_CENTER);
            agregarCelda(tablaProductos, "Subtotal", fuenteSubtitulo, Element.ALIGN_CENTER);

            // Agregar productos
            double total = 0.0;
            for (int i = 0; i < tabla.getRowCount(); i++) {
                String cantidad = tabla.getValueAt(i, 0).toString();
                String producto = tabla.getValueAt(i, 1).toString();
                String subtotal = tabla.getValueAt(i, 2).toString();

                agregarCelda(tablaProductos, cantidad, fuenteTexto, Element.ALIGN_CENTER);
                agregarCelda(tablaProductos, producto, fuenteTexto, Element.ALIGN_LEFT);
                agregarCelda(tablaProductos, "$" + String.format("%.2f", Double.parseDouble(subtotal) / Integer.parseInt(cantidad)), fuenteTexto, Element.ALIGN_RIGHT);
                agregarCelda(tablaProductos, "$" + subtotal, fuenteTexto, Element.ALIGN_RIGHT);

                total += Double.parseDouble(subtotal);
            }

            documento.add(tablaProductos);
            documento.add(Chunk.NEWLINE);

            // Total
            Paragraph totalCompra = new Paragraph("Total: $" + String.format("%.2f", total), fuenteTotal);
            totalCompra.setAlignment(Element.ALIGN_RIGHT);
            documento.add(totalCompra);

            // Mensaje final
            Paragraph agradecimiento = new Paragraph("¡Gracias por su compra!", fuenteTexto);
            agradecimiento.setAlignment(Element.ALIGN_CENTER);
            documento.add(agradecimiento);

            documento.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al generar el ticket: " + e.getMessage());
        }
    }

    private void agregarCelda(PdfPTable tabla, String texto, Font fuente, int alineacion) {
        PdfPCell celda = new PdfPCell(new Phrase(texto, fuente));
        celda.setHorizontalAlignment(alineacion);
        celda.setPadding(5);
        tabla.addCell(celda);

    }

    public void enviarCorreoTicket(String correoDestinatario, String nombreCliente) throws MessagingException {
        // Primero creamos el PDF
        crearPDFTicketCompra(nombreCliente, correoDestinatario);

        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.port", "587");
        propiedades.put("mail.smtp.auth", "true");
        propiedades.put("mail.smtp.starttls.enable", "true");
        propiedades.put("mail.smtp.ssl.protocols", "TLSv1.2");

        Session sesion = Session.getInstance(propiedades, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(CorreoRemitente, ContraseñaRemitente);
            }
        });

        try {
            Message mensaje = new MimeMessage(sesion);
            mensaje.setFrom(new InternetAddress(CorreoRemitente));
            mensaje.setRecipient(Message.RecipientType.TO, new InternetAddress(correoDestinatario));
            mensaje.setSubject("Ticket de compra - " + NombreEmpresa);

            // Cuerpo del mensaje
            MimeBodyPart cuerpoTexto = new MimeBodyPart();
            String textoCorreo = "Estimado " + nombreCliente + ",\n\n"
                    + "Adjunto encontrará el ticket de su compra reciente en " + NombreEmpresa + ".\n\n"
                    + "Gracias por su preferencia.\n\n"
                    + "Atentamente,\n"
                    + "El equipo de " + NombreEmpresa;
            cuerpoTexto.setText(textoCorreo);

            // Adjuntar PDF
            MimeBodyPart adjunto = new MimeBodyPart();
            adjunto.attachFile(new File(rutaPDF));

            // Combinar partes
            Multipart contenido = new MimeMultipart();
            contenido.addBodyPart(cuerpoTexto);
            contenido.addBodyPart(adjunto);

            mensaje.setContent(contenido);
            Transport.send(mensaje);

            JOptionPane.showMessageDialog(null, "Ticket enviado por correo exitosamente a: " + correoDestinatario);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + e.getMessage());
        }
    }

    private void enviarTicketConfirm() {
        int totalFilas = tabla.getRowCount();

        if (totalFilas > 0) {
            // Preguntar si desea recibir el ticket por correo
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea recibir el ticket por correo electrónico?", "Envío de ticket", JOptionPane.YES_NO_OPTION);

            String correoCliente = "";
            String nombreCliente = "";

            if (opcion == JOptionPane.YES_OPTION) {
                nombreCliente = JOptionPane.showInputDialog("Ingrese su nombre:");
                correoCliente = JOptionPane.showInputDialog("Ingrese su correo electrónico:");
            }

            try (Connection cn = Conexion.getConexion()) {
                cn.setAutoCommit(false);
                boolean huboError = false;

                // ... (código existente para procesar el pago) ...
                if (!huboError) {
                    cn.commit();
                    JOptionPane.showMessageDialog(null, "Pago realizado correctamente.");

                    // Generar y enviar ticket si se solicitó
                    if (opcion == JOptionPane.YES_OPTION && !correoCliente.isEmpty()) {
                        try {
                            enviarCorreoTicket(correoCliente, nombreCliente);
                        } catch (MessagingException ex) {
                            JOptionPane.showMessageDialog(null, "El pago se completó pero hubo un error al enviar el correo: " + ex.getMessage());
                        }
                    }

                    modeloTabla.setNumRows(0);
                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay productos para pagar.");
        }
    }

    private void totalPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalPagoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pagar;
    private javax.swing.JLabel Salir;
    private javax.swing.JTable buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private componentemodificadooo.mijpanelmodificado mijpanelmodificado1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField totalPago;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JLabel txtUser;
    // End of variables declaration//GEN-END:variables
}
