/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author Filipe Universidade
 */
public class Selecao extends javax.swing.JFrame {

    /**
     * Creates new form Selecao
     */
    public Selecao() {
        initComponents();
<<<<<<< HEAD
=======
        SelecaoTable2 table = new SelecaoTable2();
        table.setLocation(750, 100);
        table.setVisible(true);
        this.add(table);
        
            PacotesFrame pacotesf = new PacotesFrame();
            pacotesf.setLocation(50, 100);
            pacotesf.setVisible(true);
            this.add(pacotesf);
            selectedframe = pacotesf;
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
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
<<<<<<< HEAD

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleção");

        jLabel2.setText("Tipo de seleção:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pacotes Predefinidos", "Seleção de Componentes", "Seleção Recomendada" }));
jComboBox1.addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent arg0) {
            actionPerformed(arg0);
        }
    });
=======
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
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(329, Short.MAX_VALUE))
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(203, 203, 203))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
<<<<<<< HEAD
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(523, Short.MAX_VALUE))
=======
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
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    public void actionPerformed(ItemEvent e) {
                if(jComboBox1.getSelectedIndex()== 0 && !(selectedframe instanceof PacotesFrame)){
           if(selectedframe!= null) selectedframe.dispose();
            System.out.println("00000");
            PacotesFrame pacotesf = new PacotesFrame();
            pacotesf.setLocation(95, 100);
=======
  

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
                        if(jComboBox1.getSelectedIndex()== 0 && !(selectedframe instanceof PacotesFrame)){
           if(selectedframe!= null) selectedframe.dispose();
            System.out.println("00000");
            PacotesFrame pacotesf = new PacotesFrame();
            pacotesf.setLocation(50, 100);
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
            pacotesf.setVisible(true);
            this.add(pacotesf);
            selectedframe = pacotesf;
        }
        else if(jComboBox1.getSelectedIndex()== 1 && !(selectedframe instanceof ComponentesFrame)){
            
            if(selectedframe!= null) selectedframe.dispose();
            System.out.println("111111");
            ComponentesFrame compnentesf = new ComponentesFrame();
<<<<<<< HEAD
            compnentesf.setLocation(95, 100);
=======
            compnentesf.setLocation(50, 100);
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
            compnentesf.setVisible(true);
            this.add(compnentesf);
            selectedframe = compnentesf;
    }
<<<<<<< HEAD
    }

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        
        if(jComboBox1.getSelectedIndex()== 0 && !(selectedframe instanceof PacotesFrame)){
           if(selectedframe!= null) selectedframe.dispose();
            System.out.println("00000");
            PacotesFrame pacotesf = new PacotesFrame();
            pacotesf.setLocation(95, 100);
            pacotesf.setVisible(true);
            this.add(pacotesf);
            selectedframe = pacotesf;
        }
        else if(jComboBox1.getSelectedIndex()== 1 && !(selectedframe instanceof ComponentesFrame)){
            
            if(selectedframe!= null) selectedframe.dispose();
            System.out.println("111111");
            ComponentesFrame compnentesf = new ComponentesFrame();
            compnentesf.setLocation(95, 100);
            compnentesf.setVisible(true);
            this.add(compnentesf);
            selectedframe = compnentesf;
        }
    }//GEN-LAST:event_jComboBox1MouseClicked
=======
        else if((selectedframe != null) && jComboBox1.getSelectedIndex()== 2){
            if(selectedframe!= null) selectedframe.dispose();
            ConfgOtimaFrame confg = new ConfgOtimaFrame();
            confg.setLocation(70, 100);
            confg.setVisible(true);
            this.add(confg);
            selectedframe = confg;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton3.setEnabled(true);
        jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Pagamento(this).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2

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
                new Selecao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
=======
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
    // End of variables declaration//GEN-END:variables
    private javax.swing.JInternalFrame selectedframe;
}
