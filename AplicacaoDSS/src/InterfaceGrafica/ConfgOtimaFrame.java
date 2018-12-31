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
        initComponents();
        BasicInternalFrameUI ui = (javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI();
        JComponent title = ui.getNorthPane();
        this.s = s;
        this.facade = facade;
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(574, 454));
        setMinimumSize(new java.awt.Dimension(574, 454));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Configuração Ótima");

        jLabel2.setText("Escolha o motor do seu carro:");
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacegrafica/Img/Componentes/motor.jpg")));

        jLabel3.setText("Escolha a pintura do seu carro:");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacegrafica/Img/Componentes/tinta.png")));

        jLabel4.setText("Insira o dinheiro que está disposto a pagar pelo carro:");

        jTextField1.setText("18000 €");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/Img/Componentes/tinta.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calcular");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/Img/Componentes/motor.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(93, 93, 93)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(37, 37, 37)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jButton4)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        double max = 0;
        try{
            max = Double.parseDouble(jTextField1.getText());
        } catch(NumberFormatException e){
            System.out.println("Algo que não um número foi inserido.");
        }
        List<Componente> componentes = new ArrayList<>();
        Configuracao c;
        // escrever mensagem de erro (try catch)
        max -= custo2;
        if(max > 0){
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
            JOptionPane.showMessageDialog(null, "O valor inserido é muito baixo, minimo : " + facade.getPrecoConfig(), "Não sabes fazer contas", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ComponenteFrame cf = null;
        try{
            cf = new ComponenteFrame(facade,facade.getTypeComponentes("pintura"),s);
        } catch (SQLException ex) { 
            Logger.getLogger(ConfgOtimaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
     /*   cf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cf.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent evt){
               cf.closing();
               cf.dispose();
           }
        });*/
        cf.setVisible(true);
        //this.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ComponenteFrame cf = null;
        try{
            List<Componente> l = facade.getTypeComponentes("motor");
            System.out.println("Passou 1ª linha");
            if (l == null) System.out.println("l é null");
            cf = new ComponenteFrame(facade,l,s);
        } catch (SQLException ex) { 
            Logger.getLogger(ConfgOtimaFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException e){
           System.out.println("Null pointer Exception");
        }
     /*   cf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        cf.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent evt){
               cf.closing();
               cf.dispose();
           }
        });*/
        cf.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private double custo1 = 0;
    private double custo2 = 0;
    private String nomeModelo = null;
    private Configuracao config = new Configuracao();
    private Selecao s;
}
