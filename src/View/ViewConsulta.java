/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import BaseDeConhecimento.QueryGramatical;
import MotorInferencia.Inferencia;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jpl7.Query;

/**
 *
 * @author Baziota Beans
 */
public class ViewConsulta extends javax.swing.JFrame {

    /**
     * Creates new form ViewConsulta
     */
    private String str ="";
    private int xMouse, yMouse;

    public ViewConsulta() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        textoJTX.setBackground(new Color(0, 0, 0, 0));
        respostaJTX.setBackground(new Color(0, 0, 0, 0));
        paraPerguntaJLabel.setVisible(false);
        respostaJTX.setVisible(false);
        responder_btn.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        respostaJLabel = new javax.swing.JLabel();
        paraFrase = new javax.swing.JLabel();
        paraPerguntaJLabel = new javax.swing.JLabel();
        tipoJLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        encontrouJLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        artigoJLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        verboJLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        substantivoJLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        predicadoJLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sujeitoJLabel = new javax.swing.JLabel();
        responder_btn = new rojerusan.RSButtonIconD();
        analisar_btn = new rojerusan.RSButtonIconD();
        respostaJTX = new rojerusan.RSMetroTextPlaceHolder();
        textoJTX = new rojerusan.RSMetroTextPlaceHolder();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(969, 0, 25, 19));

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
        jPanel1.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 0, 26, 19));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 27));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistema de Análise Sintático 1.0.2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Resposta:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 80, 40));

        respostaJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        respostaJLabel.setForeground(new java.awt.Color(0, 102, 102));
        respostaJLabel.setText("respostaJLabel");
        getContentPane().add(respostaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 120, 40));

        paraFrase.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        paraFrase.setForeground(new java.awt.Color(255, 255, 255));
        paraFrase.setText("Entre com uma frase ou uma pergunta");
        getContentPane().add(paraFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, 30));

        paraPerguntaJLabel.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        paraPerguntaJLabel.setForeground(new java.awt.Color(255, 255, 255));
        paraPerguntaJLabel.setText("Entre com a resposta da pergunta por favor");
        getContentPane().add(paraPerguntaJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, 30));

        tipoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tipoJLabel.setForeground(new java.awt.Color(0, 102, 102));
        tipoJLabel.setText("nome");
        getContentPane().add(tipoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 130, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, 40, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Existe:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 60, 40));

        encontrouJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        encontrouJLabel.setForeground(new java.awt.Color(0, 102, 102));
        encontrouJLabel.setText("sim");
        getContentPane().add(encontrouJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 50, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Artigo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 60, 40));

        artigoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        artigoJLabel.setForeground(new java.awt.Color(0, 102, 102));
        artigoJLabel.setText("artigoJLabel");
        getContentPane().add(artigoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 100, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Verbo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, 60, 40));

        verboJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        verboJLabel.setForeground(new java.awt.Color(0, 102, 102));
        verboJLabel.setText("verbo");
        getContentPane().add(verboJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 60, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Substantivo:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 460, 100, 40));

        substantivoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        substantivoJLabel.setForeground(new java.awt.Color(0, 102, 102));
        substantivoJLabel.setText("substantivo");
        getContentPane().add(substantivoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 100, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Predicado:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 90, 40));

        predicadoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        predicadoJLabel.setForeground(new java.awt.Color(0, 102, 102));
        predicadoJLabel.setText("predicado");
        getContentPane().add(predicadoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 220, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Sujeito:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 530, 90, 40));

        sujeitoJLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sujeitoJLabel.setForeground(new java.awt.Color(0, 102, 102));
        sujeitoJLabel.setText("sujeito");
        getContentPane().add(sujeitoJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, 90, 40));

        responder_btn.setBackground(new java.awt.Color(0, 102, 102));
        responder_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/full_stop_50px.png"))); // NOI18N
        responder_btn.setText("Responder ");
        responder_btn.setColorHover(new java.awt.Color(0, 51, 51));
        responder_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        responder_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responder_btnActionPerformed(evt);
            }
        });
        getContentPane().add(responder_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 250, 130, 50));

        analisar_btn.setBackground(new java.awt.Color(0, 102, 102));
        analisar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/full_stop_50px.png"))); // NOI18N
        analisar_btn.setText("Analisar");
        analisar_btn.setColorHover(new java.awt.Color(0, 51, 51));
        analisar_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        analisar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                analisar_btnActionPerformed(evt);
            }
        });
        getContentPane().add(analisar_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 130, 50));

        respostaJTX.setBorder(null);
        respostaJTX.setForeground(new java.awt.Color(255, 255, 255));
        respostaJTX.setBorderColor(new java.awt.Color(0, 102, 102));
        respostaJTX.setBotonColor(new java.awt.Color(0, 102, 102));
        respostaJTX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(respostaJTX, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 280, 50));

        textoJTX.setForeground(new java.awt.Color(255, 255, 255));
        textoJTX.setBorderColor(new java.awt.Color(0, 102, 102));
        textoJTX.setBotonColor(new java.awt.Color(0, 102, 102));
        textoJTX.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(textoJTX, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 700, 50));

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Background.png"))); // NOI18N
        getContentPane().add(fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        // TODO add your handling code here:
        btn_close.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        // TODO add your handling code here:
        btn_close.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseEntered
        // TODO add your handling code here:
        btn_minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_btn_minimizeMouseEntered

    private void btn_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseExited
        // TODO add your handling code here:
        btn_minimize.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_minimizeMouseExited

    private void btn_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeMouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    public boolean validar(String str) {
        if (str.equals(" ") || str.equals("?") || str.equals(".") || str.equals("!")) {
            return true;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (String.valueOf(str.charAt(i)).equals("´") || String.valueOf(str.charAt(i)).equals("`")
                    || String.valueOf(str.charAt(i)).equals("`")
                    || String.valueOf(str.charAt(i)).equals("'\'")
                    || String.valueOf(str.charAt(i)).equals("|")
                    || String.valueOf(str.charAt(i)).equals("'")
                    || String.valueOf(str.charAt(i)).equals("»")
                    || String.valueOf(str.charAt(i)).equals("«")
                    || String.valueOf(str.charAt(i)).equals("^")
                    || String.valueOf(str.charAt(i)).equals("~")
                    || String.valueOf(str.charAt(i)).equals("=")
                    || String.valueOf(str.charAt(i)).equals("}")
                    || String.valueOf(str.charAt(i)).equals("{")
                    || String.valueOf(str.charAt(i)).equals(")")
                    || String.valueOf(str.charAt(i)).equals("(")
                    || String.valueOf(str.charAt(i)).equals("/")
                    || String.valueOf(str.charAt(i)).equals("%")
                    || String.valueOf(str.charAt(i)).equals("$")
                    || String.valueOf(str.charAt(i)).equals("#")
                    || String.valueOf(str.charAt(i)).equals(":")
                    || String.valueOf(str.charAt(i)).equals(";")
                    || String.valueOf(str.charAt(i)).equals("-")
                    || String.valueOf(str.charAt(i)).equals("*")) {
                return true;
            }
        }
        return false;
    }

    //JOptionPane.showMessageDialog(null, "Frase ou pergunta inválida!\nPor favor digite uma frase ou pergunta válida", "", JOptionPane.ERROR_MESSAGE);

    private void analisar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analisar_btnActionPerformed
        // TODO add your handling code here:
        String txt = textoJTX.getText().toLowerCase().toString();
        char primeiroMembro;
        System.out.println(txt);
        if (validar(txt)) 
        {
            JOptionPane.showMessageDialog(null, "Frase ou pergunta inválida!\nPor favor digite uma frase ou pergunta válida", "", JOptionPane.ERROR_MESSAGE);
            textoJTX.setText("");
        } 
        else if (txt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O senhor(a) não prencheu nada Por favor digite uma frase ou uma pergunta!", "", JOptionPane.ERROR_MESSAGE);
            textoJTX.setText("");
        } 
        else if (String.valueOf(txt.charAt(txt.length() - 1)).equalsIgnoreCase(".") || String.valueOf(txt.charAt(txt.length() - 1)).equalsIgnoreCase("!")) 
        {
            tipoJLabel.setText("Afirmação.");
            String consulta = txt.trim().replace(" ", ",").replace(".", "").replace("!", "");
            String resultado = QueryGramatical.consultar_arvore_sintatica(consulta);
            encontrouJLabel.setText("Sim");
            
            //frase(sujeito(artigo(o), substantivo(gato)), predicado(verbo('caçou'), artigo(o), substantivo(rato)))
            predicadoJLabel.setText("" + QueryGramatical.getPredicado(resultado));
            sujeitoJLabel.setText("" + QueryGramatical.getSujeito(resultado));

            String[] vectorPalavras = consulta.split(",");

            for (int i = 0; i < vectorPalavras.length; i++) {
                System.out.println("-->: " + vectorPalavras[i]);
            }
            List<String> listaPalavrasNova = QueryGramatical.palavrasNovas(vectorPalavras);
            if (!listaPalavrasNova.isEmpty()) 
            {
                System.out.println("Formato da String Com toString = " + listaPalavrasNova.toString());
                new Realimentacao(listaPalavrasNova, txt).setVisible(true);
                this.dispose();
            } else 
            {
                verboJLabel.setText(QueryGramatical.getClasseGramatical(resultado, "verbo"));
                substantivoJLabel.setText(QueryGramatical.getClasseGramatical(resultado, "substantivo"));
                artigoJLabel.setText(QueryGramatical.getClasseGramatical(resultado, "substantivo"));
            }
        } else if (String.valueOf(txt.charAt(txt.length() - 1)).equalsIgnoreCase("?")) {
            tipoJLabel.setText("Pergunta");

            String resultado = QueryGramatical.consultarPergunta(txt);
            System.out.println("Resultado: "+resultado);
            if (resultado.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Não tenho resposta para essa pergunta!", "Erro", JOptionPane.ERROR_MESSAGE);
                int flag = JOptionPane.showConfirmDialog(null, "Por favor, Podes ajudar-me, me informando a resposta ", "Resposta", JOptionPane.OK_CANCEL_OPTION, JOptionPane.YES_NO_CANCEL_OPTION);
                if(flag == 0)
                {
                    analisar_btn.setEnabled(false);
                    paraPerguntaJLabel.setVisible(true);
                    respostaJTX.setVisible(true);
                    responder_btn.setVisible(true);
                }
            }else
            {
                respostaJLabel.setText(resultado.toUpperCase());
                analisar_btn.setEnabled(true);
            }

        }
        /*
        ArrayList<String>str = null;
        String str2[] = null;
        String txt;
        StringBuilder buffer = new StringBuilder();
        txt = textoJTX.getText();
        System.out.println(txt);
        int j = 0;
        //buffer.append(" tgfggf ").toString();
        for(int i = 0; i < txt.length(); i++, j++)
        { 
            if(i+1 < txt.length() - 1)
            {
                if (String.valueOf(txt.charAt(i + 1)).equals("*"))
                {
                    for(int u = (i-j); u < i+1; u++ )
                    {
                        buffer.append(String.valueOf(txt.charAt(u)));
                    }
                    System.out.println(buffer.toString());
                    buffer = new StringBuilder();
                    j = i - j;    
                }
            }
        }
        System.out.println(buffer.toString());
        //System.out.println(str2);
         */
    }//GEN-LAST:event_analisar_btnActionPerformed

    private void responder_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responder_btnActionPerformed
        // TODO add your handling code here:
        //MotorInferencia.(str,respostaJTX.getText().toLowerCase());
        Inferencia.inserirNovaregra(textoJTX.getText().toLowerCase(), respostaJTX.getText().toLowerCase());
        JOptionPane.showMessageDialog(null, "Obrigado Pela Ajuda !");
        dispose();
        new ViewPrincipal().setVisible(true);
    }//GEN-LAST:event_responder_btnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconD analisar_btn;
    private javax.swing.JLabel artigoJLabel;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_minimize;
    private javax.swing.JLabel encontrouJLabel;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel paraFrase;
    private javax.swing.JLabel paraPerguntaJLabel;
    private javax.swing.JLabel predicadoJLabel;
    private rojerusan.RSButtonIconD responder_btn;
    private javax.swing.JLabel respostaJLabel;
    private rojerusan.RSMetroTextPlaceHolder respostaJTX;
    private javax.swing.JLabel substantivoJLabel;
    private javax.swing.JLabel sujeitoJLabel;
    private rojerusan.RSMetroTextPlaceHolder textoJTX;
    private javax.swing.JLabel tipoJLabel;
    private javax.swing.JLabel verboJLabel;
    // End of variables declaration//GEN-END:variables
}