/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;
import Funcionalidade.Componente;
import Funcionalidade.Configuracao;
import Funcionalidade.Facade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Filipe Universidade
 */
public class Selecao extends javax.swing.JFrame {
    
    /**
     * Creates new form Selecao
     */
    public Selecao(Facade facade,boolean fabrica) throws SQLException {
        initComponents();
        this.facade = facade;
        this.fabrica = fabrica;
        if(fabrica)
            jButton3.setText("Criar Pacote");
            
            desenhaConfigFrame();
            if(fabrica){
            ComponentesFrame compnentesf = new ComponentesFrame(facade,this);
            compnentesf.setLocation(50, 100);
            compnentesf.setVisible(true);
            this.add(compnentesf);
            selectedframe = compnentesf;
            jComboBox1.setEnabled(false);
            jComboBox1.setVisible(false);
            jButton2.setEnabled(false);
            jButton2.setVisible(false);
            }
            else{   
            PacotesFrame2 pacotesf = new PacotesFrame2(this.facade,this);
            pacotesf.setLocation(50, 100);
            pacotesf.setVisible(true);
            this.add(pacotesf);
            selectedframe = pacotesf;
            }
    }
    
    public void desenhaConfigFrame() throws SQLException{
        if(tableComp != null){ tableComp.dispose();}
        tableComp = new SelecaoTable2(facade,this);
        tableComp.setLocation(750, 100);
        tableComp.setVisible(true);
        this.add(tableComp);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Realize a sua Seleção");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de seleção:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pacotes Predefinidos", "Seleção de Componentes", "Seleção Recomendada" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Componentes Selecionados");

        jButton2.setText("Confirmar Stock");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Finalizar Encomenda");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Gravar Seleção");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(203, 203, 203))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(616, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(477, 477, 477))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(60, 60, 60)
                        .addComponent(jButton2)
                        .addGap(56, 56, 56)
                        .addComponent(jButton3)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 467, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setEncomendaButton(boolean a){
        jButton3.setEnabled(a);
    }

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex()== 0 && !(selectedframe instanceof PacotesFrame2)){
           if(selectedframe!= null) selectedframe.dispose();
            System.out.println("00000");
            PacotesFrame2 pacotesf;
            try {
                pacotesf = new PacotesFrame2(facade,this);
                pacotesf.setLocation(50, 100);
                pacotesf.setVisible(true);
                this.add(pacotesf);
                selectedframe = pacotesf;
            } catch (SQLException ex) {
                Logger.getLogger(Selecao.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else if(jComboBox1.getSelectedIndex()== 1 && !(selectedframe instanceof ComponentesFrame)){
            
            if(selectedframe!= null) selectedframe.dispose();
            System.out.println("111111");
            ComponentesFrame compnentesf = new ComponentesFrame(facade,this);
            compnentesf.setLocation(50, 100);
            compnentesf.setVisible(true);
            this.add(compnentesf);
            selectedframe = compnentesf;
    }
        else if((selectedframe != null) && jComboBox1.getSelectedIndex()== 2){
            if(selectedframe!= null) selectedframe.dispose();
            ConfgOtimaFrame confg = new ConfgOtimaFrame(facade);
            confg.setLocation(70, 100);
            confg.setVisible(true);
            this.add(confg);
            selectedframe = confg;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s =facade.checkStock();
        if( s == null){
            JOptionPane.showMessageDialog(null, "Pode agora finalizar a sua configuração!", "InfoBox: " + "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            if(facade.isStock() && facade.isConfigSaved()){
            setEncomendaButton(true);
            }
        }            
        else{
            JOptionPane.showMessageDialog(null, "O seguinte componente não tem stock: "+s, "InfoBox: " + "Aviso!", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Pagamento(this).setVisible(true);
        if(fabrica)
        {
            new SavePacote(facade,this).setVisible(true);
        }
        else{
        try {
            facade.saveEncomenda();
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Selecao.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    new SaveFrame(facade,this).setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selecao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Selecao(new Facade(),false).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Selecao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
    private javax.swing.JInternalFrame selectedframe;
    private Facade facade;
    private SelecaoTable2 tableComp;
    private LobbyFuncionario l;
    private boolean fabrica;
}
