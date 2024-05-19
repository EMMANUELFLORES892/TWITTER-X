/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectox;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class BasePagina extends javax.swing.JFrame {
     private int userID;

    // Constructor de la clase BasePagina
    public BasePagina() {
        initComponents();
    }

    // Método para establecer el ID de usuario
    public void setUserID(int userID) {
        this.userID = userID;
        System.out.println("ID de usuario en BasePagina: " + userID);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        BotonSiguiendo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TextPublicacion = new javax.swing.JTextPane();
        TextPost = new javax.swing.JTextField();
        BotonParaTi = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BotonCuentaRecom2 = new javax.swing.JButton();
        BotonCuentaRecom3 = new javax.swing.JButton();
        BotonMasCuentasRecom = new javax.swing.JButton();
        LabelQueEstaPasando = new javax.swing.JLabel();
        LabelAQuienSeguir = new javax.swing.JLabel();
        BotonTendencia1 = new javax.swing.JButton();
        BotonTendencia2 = new javax.swing.JButton();
        BotonTendencia3 = new javax.swing.JButton();
        BotonMasTendencias = new javax.swing.JButton();
        BotonCuentaRecom1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextBuscar = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BotonVolverArriba = new javax.swing.JButton();
        BotonNotificacion = new javax.swing.JButton();
        BotonMensajes = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
        BotonListas = new javax.swing.JButton();
        BotonPremium = new javax.swing.JButton();
        BotonPerfil = new javax.swing.JButton();
        BotonExplorar = new javax.swing.JButton();
        BotonMas = new javax.swing.JButton();
        BotonPost = new javax.swing.JButton();
        BotonUsuario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonSiguiendo.setText("Siguiendo");
        BotonSiguiendo.setBorder(null);
        BotonSiguiendo.setBorderPainted(false);
        BotonSiguiendo.setContentAreaFilled(false);
        BotonSiguiendo.setFocusable(false);
        BotonSiguiendo.setOpaque(true);
        BotonSiguiendo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSiguiendoActionPerformed(evt);
            }
        });

        TextPublicacion.setText("Escribe algo...");
        jScrollPane4.setViewportView(TextPublicacion);

        TextPost.setText("Publicacion");

        BotonParaTi.setText("<html><p style = \"font: Berlin Sans FB \">Para ti</p></html> ");
        BotonParaTi.setBorder(null);
        BotonParaTi.setBorderPainted(false);
        BotonParaTi.setContentAreaFilled(false);
        BotonParaTi.setFocusable(false);
        BotonParaTi.setOpaque(true);

        jButton1.setText("ajustes");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);

        BotonCuentaRecom2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonCuentaRecom2.setText("Cuenta recom 2");
        BotonCuentaRecom2.setBorder(null);
        BotonCuentaRecom2.setBorderPainted(false);
        BotonCuentaRecom2.setContentAreaFilled(false);
        BotonCuentaRecom2.setFocusable(false);
        BotonCuentaRecom2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCuentaRecom2.setOpaque(true);

        BotonCuentaRecom3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonCuentaRecom3.setText("Cuenta recom 3");
        BotonCuentaRecom3.setBorder(null);
        BotonCuentaRecom3.setBorderPainted(false);
        BotonCuentaRecom3.setContentAreaFilled(false);
        BotonCuentaRecom3.setFocusable(false);
        BotonCuentaRecom3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCuentaRecom3.setOpaque(true);

        BotonMasCuentasRecom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonMasCuentasRecom.setText("Mostrar mas");
        BotonMasCuentasRecom.setBorder(null);
        BotonMasCuentasRecom.setBorderPainted(false);
        BotonMasCuentasRecom.setContentAreaFilled(false);
        BotonMasCuentasRecom.setFocusable(false);
        BotonMasCuentasRecom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMasCuentasRecom.setOpaque(true);

        LabelQueEstaPasando.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelQueEstaPasando.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelQueEstaPasando.setText("¿Qué esta pasando?");

        LabelAQuienSeguir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelAQuienSeguir.setText("A quien seguir");

        BotonTendencia1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonTendencia1.setText("Tendencia#1");
        BotonTendencia1.setBorder(null);
        BotonTendencia1.setBorderPainted(false);
        BotonTendencia1.setContentAreaFilled(false);
        BotonTendencia1.setFocusable(false);
        BotonTendencia1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonTendencia1.setOpaque(true);

        BotonTendencia2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonTendencia2.setText("Tendencia#2");
        BotonTendencia2.setBorder(null);
        BotonTendencia2.setBorderPainted(false);
        BotonTendencia2.setContentAreaFilled(false);
        BotonTendencia2.setFocusable(false);
        BotonTendencia2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonTendencia2.setOpaque(true);

        BotonTendencia3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonTendencia3.setText("Tendencia#3");
        BotonTendencia3.setBorder(null);
        BotonTendencia3.setBorderPainted(false);
        BotonTendencia3.setContentAreaFilled(false);
        BotonTendencia3.setFocusable(false);
        BotonTendencia3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonTendencia3.setOpaque(true);

        BotonMasTendencias.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonMasTendencias.setText("Mostrar mas");
        BotonMasTendencias.setBorder(null);
        BotonMasTendencias.setBorderPainted(false);
        BotonMasTendencias.setContentAreaFilled(false);
        BotonMasTendencias.setFocusable(false);
        BotonMasTendencias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMasTendencias.setOpaque(true);

        BotonCuentaRecom1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotonCuentaRecom1.setText("Cuenta recom 1");
        BotonCuentaRecom1.setBorder(null);
        BotonCuentaRecom1.setBorderPainted(false);
        BotonCuentaRecom1.setContentAreaFilled(false);
        BotonCuentaRecom1.setFocusable(false);
        BotonCuentaRecom1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCuentaRecom1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BotonTendencia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonTendencia2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonTendencia3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonMasTendencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAQuienSeguir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelQueEstaPasando, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(BotonCuentaRecom1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonCuentaRecom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonCuentaRecom3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonMasCuentasRecom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelQueEstaPasando, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonTendencia1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonTendencia2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonTendencia3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMasTendencias, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelAQuienSeguir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCuentaRecom1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCuentaRecom2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCuentaRecom3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonMasCuentasRecom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        TextBuscar.setBackground(new java.awt.Color(242, 242, 242));
        TextBuscar.setBorder(null);
        TextBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TextBuscar.setForeground(new java.awt.Color(102, 102, 102));
        TextBuscar.setText("Buscar");
        TextBuscar.setFocusable(false);
        jScrollPane3.setViewportView(TextBuscar);

        jLabel7.setText("jLabel2");

        jLabel19.setText("jLabel7");

        jLabel13.setText("jLabel13");

        jLabel16.setText("jLabel14");

        jLabel17.setText("jLabel15");

        BotonVolverArriba.setText("logo");
        BotonVolverArriba.setBorder(null);
        BotonVolverArriba.setBorderPainted(false);
        BotonVolverArriba.setContentAreaFilled(false);
        BotonVolverArriba.setFocusable(false);
        BotonVolverArriba.setOpaque(true);
        BotonVolverArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverArribaActionPerformed(evt);
            }
        });

        BotonNotificacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonNotificacion.setText("Notificaciones");
        BotonNotificacion.setBorder(null);
        BotonNotificacion.setBorderPainted(false);
        BotonNotificacion.setContentAreaFilled(false);
        BotonNotificacion.setFocusable(false);
        BotonNotificacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonNotificacion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNotificacionActionPerformed(evt);
            }
        });

        BotonMensajes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonMensajes.setText("Mensajes");
        BotonMensajes.setBorder(null);
        BotonMensajes.setBorderPainted(false);
        BotonMensajes.setContentAreaFilled(false);
        BotonMensajes.setFocusable(false);
        BotonMensajes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMensajes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonMensajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMensajesActionPerformed(evt);
            }
        });

        BotonInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonInicio.setText("Inicio");
        BotonInicio.setBorder(null);
        BotonInicio.setBorderPainted(false);
        BotonInicio.setContentAreaFilled(false);
        BotonInicio.setFocusable(false);
        BotonInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        BotonListas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonListas.setText("Listas");
        BotonListas.setBorder(null);
        BotonListas.setBorderPainted(false);
        BotonListas.setContentAreaFilled(false);
        BotonListas.setFocusable(false);
        BotonListas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonListas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonListasActionPerformed(evt);
            }
        });

        BotonPremium.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonPremium.setText("X Premium");
        BotonPremium.setBorder(null);
        BotonPremium.setBorderPainted(false);
        BotonPremium.setContentAreaFilled(false);
        BotonPremium.setFocusable(false);
        BotonPremium.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonPremium.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonPremium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPremiumActionPerformed(evt);
            }
        });

        BotonPerfil.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonPerfil.setText("Perfil");
        BotonPerfil.setBorder(null);
        BotonPerfil.setBorderPainted(false);
        BotonPerfil.setContentAreaFilled(false);
        BotonPerfil.setFocusable(false);
        BotonPerfil.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPerfilActionPerformed(evt);
            }
        });

        BotonExplorar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonExplorar.setText("Explorar");
        BotonExplorar.setBorder(null);
        BotonExplorar.setBorderPainted(false);
        BotonExplorar.setContentAreaFilled(false);
        BotonExplorar.setFocusable(false);
        BotonExplorar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonExplorar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonExplorar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExplorarActionPerformed(evt);
            }
        });

        BotonMas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonMas.setText("Mostrar mas");
        BotonMas.setBorder(null);
        BotonMas.setBorderPainted(false);
        BotonMas.setContentAreaFilled(false);
        BotonMas.setFocusable(false);
        BotonMas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonMas.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        BotonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMasActionPerformed(evt);
            }
        });

        BotonPost.setBackground(new java.awt.Color(0, 153, 255));
        BotonPost.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonPost.setForeground(new java.awt.Color(255, 255, 255));
        BotonPost.setText("Postear");
        BotonPost.setBorder(null);
        BotonPost.setBorderPainted(false);
        BotonPost.setContentAreaFilled(false);
        BotonPost.setFocusable(false);
        BotonPost.setOpaque(true);
        BotonPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPostActionPerformed(evt);
            }
        });

        BotonUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BotonUsuario.setText("Usuario");
        BotonUsuario.setBorder(null);
        BotonUsuario.setBorderPainted(false);
        BotonUsuario.setContentAreaFilled(false);
        BotonUsuario.setFocusable(false);
        BotonUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonUsuario.setOpaque(true);
        BotonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel1");

        jLabel4.setText("jLabel4");

        jLabel18.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonVolverArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonInicio)
                            .addComponent(BotonExplorar)
                            .addComponent(BotonNotificacion)
                            .addComponent(BotonMensajes)
                            .addComponent(BotonListas)
                            .addComponent(BotonPerfil)
                            .addComponent(BotonMas)
                            .addComponent(BotonPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BotonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonPost, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonParaTi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonSiguiendo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextPost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(BotonSiguiendo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonParaTi))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextPost, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BotonVolverArriba, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BotonExplorar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonNotificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotonMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonListas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonPremium, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonPerfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BotonMas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addComponent(BotonPost, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(BotonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //IMPORTANTE NO BORRAR ESTA PARTE ---------------------------- AQUI SE ESTA GUARDANDO EL ID DEL USUARIO DESDE LOGIN
    
    //IMPORTANTE NO BORRAR ESTA PARTE ---------------------------- AQUI SE ESTA GUARDANDO EL ID DEL USUARIO DESDE LOGIN
    
    
    private void BotonSiguiendoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSiguiendoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSiguiendoActionPerformed

    private void BotonVolverArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverArribaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonVolverArribaActionPerformed

    private void BotonNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNotificacionActionPerformed
        //Hasta ahora este boton muestra la seccion de notificaciones.-Jerson.
        new SeccionNotificaciones().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonNotificacionActionPerformed

    private void BotonMensajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMensajesActionPerformed
        //Conectado boton de pagina base a seccion mensajes. -Jerson.
        new SeccionMensajes().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonMensajesActionPerformed

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        new BasePagina().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonListasActionPerformed
        //Conectado boton de pagina base a Listas. -Jerson.
        new Listas().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonListasActionPerformed

    private void BotonPremiumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPremiumActionPerformed
        // Tecnicamente no hay seccion premium 
    }//GEN-LAST:event_BotonPremiumActionPerformed

    private void BotonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPerfilActionPerformed
        new SeccionPerfil().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonPerfilActionPerformed

    private void BotonExplorarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExplorarActionPerformed
        //Hasta ahora este boton muestra la seccion de explorar.-Jerson.
        new PaginaExplorar().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonExplorarActionPerformed

    private void BotonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMasActionPerformed
        // Aun no hay seccion de "mostrar mas"
    }//GEN-LAST:event_BotonMasActionPerformed

    private void BotonPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPostActionPerformed
        new SeccionCrearPublicacion().setVisible(true);
    }//GEN-LAST:event_BotonPostActionPerformed

    private void BotonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BasePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasePagina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasePagina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCuentaRecom1;
    private javax.swing.JButton BotonCuentaRecom2;
    private javax.swing.JButton BotonCuentaRecom3;
    private javax.swing.JButton BotonExplorar;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonListas;
    private javax.swing.JButton BotonMas;
    private javax.swing.JButton BotonMasCuentasRecom;
    private javax.swing.JButton BotonMasTendencias;
    private javax.swing.JButton BotonMensajes;
    private javax.swing.JButton BotonNotificacion;
    private javax.swing.JButton BotonParaTi;
    private javax.swing.JButton BotonPerfil;
    private javax.swing.JButton BotonPost;
    private javax.swing.JButton BotonPremium;
    private javax.swing.JButton BotonSiguiendo;
    private javax.swing.JButton BotonTendencia1;
    private javax.swing.JButton BotonTendencia2;
    private javax.swing.JButton BotonTendencia3;
    private javax.swing.JButton BotonUsuario;
    private javax.swing.JButton BotonVolverArriba;
    private javax.swing.JLabel LabelAQuienSeguir;
    private javax.swing.JLabel LabelQueEstaPasando;
    private javax.swing.JTextPane TextBuscar;
    private javax.swing.JTextField TextPost;
    private javax.swing.JTextPane TextPublicacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
