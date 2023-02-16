/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

//import conexion.conexion;
import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author laura.giraldot
 */
public class EstudianteAntiguo extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionarTipoEstudiante
     */
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    
    public EstudianteAntiguo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        diagnostico = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        estrato = new javax.swing.JTextField();
        grado = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        documento = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        anno = new javax.swing.JTextField();
        genero = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        registro = new javax.swing.JLabel();
        cert = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonretroceso.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 105, 167));
        jLabel3.setText("Digite el documento del estudiante registrado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Documento de Identidad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Apellido:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Diagnóstico:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Estrato Socioeconómico:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Grado Escolar:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        diagnostico.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        diagnostico.setForeground(new java.awt.Color(102, 102, 102));
        diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosticoActionPerformed(evt);
            }
        });
        getContentPane().add(diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 350, 80));

        apellido.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        apellido.setForeground(new java.awt.Color(102, 102, 102));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 350, -1));

        estrato.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        estrato.setForeground(new java.awt.Color(102, 102, 102));
        estrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estratoActionPerformed(evt);
            }
        });
        getContentPane().add(estrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 80, -1));

        grado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        grado.setForeground(new java.awt.Color(102, 102, 102));
        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });
        getContentPane().add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 80, -1));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 10, 490));

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Género:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Certificado de Discapacidad:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, -1, -1));

        documento.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        documento.setForeground(new java.awt.Color(102, 102, 102));
        documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                documentoActionPerformed(evt);
            }
        });
        getContentPane().add(documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 170, -1));

        buscar.setBackground(new java.awt.Color(0, 105, 167));
        buscar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        buscar.setForeground(new java.awt.Color(255, 255, 255));
        buscar.setText("Buscar");
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 170, 40));

        jButton4.setBackground(new java.awt.Color(0, 105, 167));
        jButton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Realizar Batería");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 230, 40));

        jButton6.setBackground(new java.awt.Color(0, 105, 167));
        jButton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Historial");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 230, 40));

        anno.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        anno.setForeground(new java.awt.Color(102, 102, 102));
        anno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annoActionPerformed(evt);
            }
        });
        getContentPane().add(anno, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 80, -1));

        genero.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(102, 102, 102));
        genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoActionPerformed(evt);
            }
        });
        getContentPane().add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 350, -1));

        mes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        mes.setForeground(new java.awt.Color(102, 102, 102));
        mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesActionPerformed(evt);
            }
        });
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 80, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonavanzar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 660, -1, -1));

        registro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        getContentPane().add(registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 660, 470, 30));

        cert.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        cert.setForeground(new java.awt.Color(102, 102, 102));
        cert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                certActionPerformed(evt);
            }
        });
        getContentPane().add(cert, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 300, 80, -1));

        nombre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(102, 102, 102));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 350, -1));

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Nombre:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        dia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        dia.setForeground(new java.awt.Color(102, 102, 102));
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 80, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        SeleccionarTipoEstudiante est;
        est = new SeleccionarTipoEstudiante();
        est.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void diagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosticoActionPerformed

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void estratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estratoActionPerformed

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradoActionPerformed

    private void documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_documentoActionPerformed

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarMouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        // TODO add your handling code here:
        String documento_t = documento.getText();
        String queryConsulta = "SELECT * FROM `datos` WHERE Documento = '"+ documento_t +"' ";
        String nom;
        String ape;
        String di;
        String me;
        String an;
        String gen;
        String est;
        String gra;
        String cer;
        String diag;
        
        try{
                cn = con.getCConnection();
                st = cn.createStatement();
//                st.executeUpdate(queryConsulta);
                rs = st.executeQuery(queryConsulta);
                while(rs.next()){
                    nom = rs.getString("Nombre");
                    nombre.setText(nom);
                    ape = rs.getString("Apellidos");
                    apellido.setText(ape);
                    di = rs.getString("Dia");
                    dia.setText(di);
                    me = rs.getString("Mes");
                    mes.setText(me);
                    an = rs.getString("Anno");
                    anno.setText(an);
                    gen = rs.getString("Genero");
                    genero.setText(gen);
                    est = rs.getString("Estrato");
                    estrato.setText(est);
                    gra = rs.getString("Grado");
                    grado.setText(gra);
                    cer = rs.getString("CertifDiscapacidad");
                    cert.setText(cer);
                    diag = rs.getString("Diagnostico");
                    diagnostico.setText(diag);
                }
        }catch(SQLException e){
            System.out.println("Error");
        }
    }

    private static class documento {

        private static String getText() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public documento() {
        }
    

    }//GEN-LAST:event_buscarActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_generoActionPerformed

    private void mesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesActionPerformed

    private void annoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SeleccionBateria est;
        est = new SeleccionBateria();
        est.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void certActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_certActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_certActionPerformed

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
            java.util.logging.Logger.getLogger(EstudianteAntiguo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstudianteAntiguo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstudianteAntiguo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstudianteAntiguo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstudianteAntiguo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anno;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JTextField cert;
    private javax.swing.JTextField dia;
    private javax.swing.JTextField diagnostico;
    private javax.swing.JTextField documento;
    private javax.swing.JTextField estrato;
    private javax.swing.JTextField genero;
    private javax.swing.JTextField grado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel registro;
    // End of variables declaration//GEN-END:variables
}
