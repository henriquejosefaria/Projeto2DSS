/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;
import Funcionalidade.Componente;
import Funcionalidade.Encomenda;
import Funcionalidade.Facade;
import Funcionalidade.Pacote;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Filipe Universidade
 */
public class TablePacotes extends javax.swing.JInternalFrame {

    public TablePacotes(Facade facade,List<Pacote> pacotes, GerirPacotes t) throws SQLException {
    initComponents();
BasicInternalFrameUI ui = (javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI();
        JComponent title = ui.getNorthPane();

// to remove
ui.setNorthPane(null);
    this.facade = facade;
        String[] colunas = { "Pacote", "Nome","Id da Configuração","Eliminar Pacote"};
        Object[][] data = null;
        data = new Object[pacotes.size()][4];
            for (int r=0; r<pacotes.size(); r++) {
                data[r][0] = new ImageIcon(getClass().getResource(pacotes.get(r).getImage()));
                data[r][1] = pacotes.get(r).getNome();
                data[r][2] = pacotes.get(r).getConfigId();
                data[r][3] = "Eliminar Pacote";
            }
        DefaultTableModel model = new DefaultTableModel(data, colunas){
        @Override
        public Class getColumnClass(int column) {
            return (column == 0) ? Icon.class : Object.class;
        }};
        jTable1.setModel(model);
        jTable1.getColumn("Eliminar Pacote").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Eliminar Pacote").setCellEditor(
            new ButtonEliminarPacote(new JCheckBox(),facade,jTable1,pacotes,t));
        jTable1.setRowHeight(100);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    private Facade facade;
    private List<Componente> list;
}