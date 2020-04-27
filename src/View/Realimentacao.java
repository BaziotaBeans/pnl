/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BaseDeConhecimento.QueryGramatical;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Baziota Beans
 */
public class Realimentacao extends javax.swing.JFrame {

    /**
     * Creates new form Realimentacao
     */
    private String strPalavra ="";
    private List<String> listaDePalavrasNovas;
    private int xMouse, yMouse;
    
    public Realimentacao(List<String> listaDePalavrasNovas, String frase)
    {
        initComponents();
        this.listaDePalavrasNovas = listaDePalavrasNovas;
        termoJLabel.setText( this.listaDePalavrasNovas.get(0));
        textoJLabel.setText(frase);
        
        selecioneJCombo.removeAllItems();
        selecioneJCombo.addItem("--Selecione--");
        btn_novaConsulta.setEnabled(false);
        for(String item: QueryGramatical.getAllGramaticalClass())
        {
            selecioneJCombo.addItem(item);
        }
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    
    public Realimentacao() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        selecioneJCombo.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoJLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        termoJLabel = new javax.swing.JLabel();
        selecioneJCombo = new rojerusan.RSComboMetro();
        btn_novaConsulta = new rojerusan.RSButtonIconD();
        btn_guardar = new rojerusan.RSButtonIconD();
        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        textoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        textoJLabel.setText("Frase...");
        getContentPane().add(textoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 420, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 420, 10));

        termoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        termoJLabel.setForeground(new java.awt.Color(255, 255, 255));
        termoJLabel.setText("Termo");
        getContentPane().add(termoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, -1));

        selecioneJCombo.setBackground(new java.awt.Color(0, 102, 102));
        selecioneJCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Substantivo", "Artigo", "Verbo" }));
        selecioneJCombo.setColorArrow(new java.awt.Color(0, 102, 102));
        selecioneJCombo.setColorBorde(new java.awt.Color(0, 102, 102));
        selecioneJCombo.setColorFondo(new java.awt.Color(0, 102, 102));
        selecioneJCombo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(selecioneJCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        btn_novaConsulta.setBackground(new java.awt.Color(0, 102, 102));
        btn_novaConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/full_stop_50px.png"))); // NOI18N
        btn_novaConsulta.setText("Nova consulta");
        btn_novaConsulta.setColorHover(new java.awt.Color(0, 51, 51));
        btn_novaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_novaConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_novaConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 160, 50));

        btn_guardar.setBackground(new java.awt.Color(0, 102, 102));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/full_stop_50px.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.setColorHover(new java.awt.Color(0, 51, 51));
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 150, 50));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_close.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText(" x");
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 25, 19));

        btn_minimize.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_minimize.setForeground(new java.awt.Color(255, 255, 255));
        btn_minimize.setText("-");
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseExited(evt);
            }
        });
        jPanel1.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 26, 19));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema de Análise Sintático 1.0.2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        setSize(new java.awt.Dimension(484, 461));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        // TODO add your handling code here:
        btn_close.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        // TODO add your handling code here:
        btn_close.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void btn_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseEntered
        // TODO add your handling code here:
        btn_minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_minimizeMouseEntered

    private void btn_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseExited
        // TODO add your handling code here:
        btn_minimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_minimizeMouseExited

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        strPalavra = termoJLabel.getText().replaceAll(" ", "");
        if( strPalavra.equalsIgnoreCase("")) 
            JOptionPane.showMessageDialog(null, "Não existe nenhuma palavra !!!");
        else if( selecioneJCombo.getSelectedIndex() == 0)
            JOptionPane.showMessageDialog(null, "Seleciona a Classe Gramatical Por Favor !!!");
        else
        {
            String classeGramatical = selecioneJCombo.getSelectedItem().toString();
            QueryGramatical.guardarPalavra(classeGramatical, strPalavra);
            
            JOptionPane.showMessageDialog(null, "Palavra guardado com sucesso!!!");
            
            listaDePalavrasNovas.remove(0);
            if(listaDePalavrasNovas.isEmpty())
            {
                termoJLabel.setText("");
                btn_guardar.setEnabled(false);
                btn_novaConsulta.setEnabled(true);
            }
            else
            {
                termoJLabel.setText(listaDePalavrasNovas.get(0));
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_novaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_novaConsultaActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ViewPrincipal().setVisible(true);
    }//GEN-LAST:event_btn_novaConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(Realimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Realimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Realimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Realimentacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Realimentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private rojerusan.RSButtonIconD btn_guardar;
    private javax.swing.JLabel btn_minimize;
    private rojerusan.RSButtonIconD btn_novaConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private rojerusan.RSComboMetro selecioneJCombo;
    private javax.swing.JLabel termoJLabel;
    private javax.swing.JLabel textoJLabel;
    // End of variables declaration//GEN-END:variables
}