/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import Funcionalidade.Configuracao;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Funcionalidade.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

class ButtonRetomarSelecao extends DefaultCellEditor {
  protected JButton button;

  private String label;

  private boolean isPushed;

  public ButtonRetomarSelecao(JCheckBox checkBox,SelecaoGuardada selecaog, JTable table,List<Configuracao> configs, Facade facade) {
    super(checkBox);
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
         int configuracaoId = table.getSelectedRow();
         Configuracao c = configs.get(configuracaoId);
         System.out.println(c.getComponentes().size()+"fdasds");
         facade.setSelectedConfig(c);
          try {
              new Selecao(facade).setVisible(true);
          } catch (SQLException ex) {
              Logger.getLogger(ButtonRetomarSelecao.class.getName()).log(Level.SEVERE, null, ex);
          }
         selecaog.dispose();
      }
    });
  }

  public Component getTableCellEditorComponent(JTable table, Object value,
      boolean isSelected, int row, int column) {
    if (isSelected) {
      button.setForeground(table.getSelectionForeground());
      button.setBackground(table.getSelectionBackground());
    } else {
      button.setForeground(table.getForeground());
      button.setBackground(table.getBackground());
    }
    label = (value == null) ? "" : value.toString();
    button.setText(label);
    isPushed = true;
    return button;
  }

  public Object getCellEditorValue() {
    if (isPushed) {
      JOptionPane.showMessageDialog(button, label + ": Ouch!");

    }
    isPushed = false;
    return new String(label);
  }

  public boolean stopCellEditing() {
    isPushed = false;
    return super.stopCellEditing();
  }

  protected void fireEditingStopped() {
    super.fireEditingStopped();
  }
  
  private Integer numeroAluno;
  private ArrayList<Integer> quotasPagas = new ArrayList<Integer>();
  private ArrayList<Integer> quotasAPagar = new ArrayList<Integer>();
}