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
    public ConfgOtimaFrame(Facade facade) {
        initComponents();
        BasicInternalFrameUI ui = (javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI();
        JComponent title = ui.getNorthPane();
        jButton2.setEnabled(false);
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
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Configuração Ótima");

        jLabel2.setText("Escolha o motor do seu carro:");
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacegrafica/Img/Componentes/motor.jpg")));

        jLabel3.setText("Escolha a pintura do seu carro:");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacegrafica/Img/Componentes/tinta.png")));

        jLabel4.setText("Insira o dinheiro que está disposto a pagar pelo carro:");

        jTextField1.setText("18000 €");

        jLabel5.setText("Escolha o modelo do seu carro:");
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfacegrafica/Img/Componentes/modelo.jpg")));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/Img/Modelos/modelo1.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/Img/Componentes/tinta.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Calcular");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/InterfaceGrafica/Img/Componentes/motor.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jButton4)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         ModelosJFrame m = new ModelosJFrame(facade,this);
        m.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        m.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent evt){
               m.closing();
               m.dispose();
           }
        });
        m.setVisible(true);
        this.setEnabled(false);
        custo1 = facade.getPrecoConfig();
        nomeModelo = facade.getNomeModelo();
        if(custo1>0){
            jButton2.setEnabled(true);
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
        max -= custo3;
        if(max > 0){
            try {
                componentes = facade.getComponentesOrdemCrescente();
                facade.selecaoAutomatica(max,componentes);
                Selecao s = new Selecao(facade);
                s.setVisible(true);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(ConfgOtimaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "O valor inserido é muito baixo, minimo : " + facade.getPrecoConfig(), "Não sabes fazer contas", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        MotoresJFrame m = new MotoresJFrame(facade,this);
        m.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        m.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent evt){
               m.closing();
               m.dispose();
           }
        });
        m.setVisible(true);
        this.setEnabled(false);
        custo2 = facade.getPrecoConfig();
        if(custo2>custo1){
            jButton3.setEnabled(true);
            jButton2.setEnabled(false);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TintasJFrame m = new TintasJFrame(facade,this);
        m.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        m.addWindowListener(new WindowAdapter(){
           @Override
           public void windowClosing(WindowEvent evt){
               m.closing();
               m.dispose();
           }
        });
        m.setVisible(true);
        this.setEnabled(false);
        custo3 = facade.getPrecoConfig();
        if(custo3>custo2){
            jButton4.setEnabled(true);
            jButton3.setEnabled(false);
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JInternalFrame selectedframe;
    private Facade facade;
    private double custo1 = 0;
    private double custo2 = 0;
    private double custo3 = 0;
    private String nomeModelo = null;
    private ArrayList<Modelo> modelos = new ArrayList<>();
    private ArrayList<Componente> motores = new ArrayList<>();
    private ArrayList<Componente> pinturas = new ArrayList<>();
    private Configuracao config = new Configuracao();
}
