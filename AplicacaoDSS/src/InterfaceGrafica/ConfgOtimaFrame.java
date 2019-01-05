/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import Funcionalidade.Componente;
import Funcionalidade.Configuracao;
import Funcionalidade.Facade;
import Funcionalidade.Modelo;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Filipe Universidade
 */
public class ConfgOtimaFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConfgOtimaFrame
     */
    public ConfgOtimaFrame(Facade facade, Selecao s) {
        this.facade = facade;
        initComponents();
        BasicInternalFrameUI ui = (javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI();
        JComponent title = ui.getNorthPane();
        this.s = s;
        this.facade = facade;
        //jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton4.setVisible(false);
// to remove
ui.setNorthPane(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(574, 454));
        setMinimumSize(new java.awt.Dimension(574, 454));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Configuração Ótima");

        jLabel2.setText("Escolha o motor do seu carro:");
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacegrafica/Img/Componentes/motor.jpg")));

        jLabel3.setText("Escolha a pintura do seu carro:");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacegrafica/Img/Componentes/tinta.png")));

        jLabel4.setText("Insira o dinheiro que está disposto a pagar pelo carro:");

        jButton4.setText("Calcular");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/Img/Componentes/motor.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/Img/Componentes/tinta.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel1)
                                    .addComponent(jButton2)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(99, 99, 99)
                                .addComponent(jButton3)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        String valor = jTextField1.getText();
        Integer max = Integer.parseInt(valor);
        System.out.println(max);
        if(valor==null) {
            JOptionPane.showMessageDialog(null, "Tem de escrever um número!", "InfoBox: " + "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(valor.matches(".*[a-z].*")){
            JOptionPane.showMessageDialog(null, "O valor não pode conter letras!", "InfoBox: " + "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            List<Componente> componentes = new ArrayList<>();
            Configuracao c;
        
            if(max > 10000){
                try {
                    componentes = facade.getComponentesOrdemCrescente();
                    facade.selecaoAutomatica(max,componentes);
                    Selecao s = new Selecao(facade,false);
                    s.setVisible(true);
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(ConfgOtimaFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
            JOptionPane.showMessageDialog(null, "O valor inserido é muito baixo, minimo : 10000", "Aviso!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ComponenteFrame cf = null;
        try{
            List<Componente> l = facade.getTypeComponentes("Motor");
            //System.out.println("Passou 1ª linha");
            //if (l == null) System.out.println("l é null");
            cf = new ComponenteFrame(facade,l,s,tipo);
        } catch (SQLException ex) { 
            Logger.getLogger(ConfgOtimaFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException e){
           //System.out.println("Null pointer Exception");
        }
        //cf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cf.setVisible(true);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ComponenteFrame cf = null;
        try{
            cf = new ComponenteFrame(facade,facade.getTypeComponentes("Tinta"),s,tipo);
        } catch (SQLException ex) { 
            Logger.getLogger(ConfgOtimaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        //cf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cf.setVisible(true);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String valor = jTextField1.getText();
        Integer max = Integer.parseInt(valor);
        System.out.println(max);
        if(valor==null) {
            JOptionPane.showMessageDialog(null, "Tem de escrever um número!", "InfoBox: " + "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(valor.matches(".*[a-z].*")){
            JOptionPane.showMessageDialog(null, "O valor não pode conter letras!", "InfoBox: " + "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        }
        else {
            List<Componente> componentes = new ArrayList<>();
            Configuracao c;
        
            if(max > 10000){
                try {
                    componentes = facade.getComponentesOrdemCrescente();
                    facade.selecaoAutomatica(max,componentes);
                    s.desenhaConfigFrame();
                    //Selecao s = new Selecao(facade,false);
                    //s.setVisible(true);
                    //this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(ConfgOtimaFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
            JOptionPane.showMessageDialog(null, "O valor inserido é muito baixo, minimo : 10000", "Aviso!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JInternalFrame selectedframe;
    private Facade facade;
    private String nomeModelo = null;
    private Configuracao config = new Configuracao();
    private Selecao s;
    private String tipo = "";
}
