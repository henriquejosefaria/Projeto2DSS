/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacegrafica;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

class ButtonRetomarSelecao extends DefaultCellEditor {
  protected JButton button;

  private String label;

  private boolean isPushed;

<<<<<<< HEAD
  public ButtonRetomarSelecao(JCheckBox checkBox,JTable table) {
=======
  public ButtonRetomarSelecao(JCheckBox checkBox,SelecaoGuardada selecao) {
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
    super(checkBox);
    button = new JButton();
    button.setOpaque(true);
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
<<<<<<< HEAD
    //new SelecaoComponentes().setVisible(true);
=======
      new Selecao().setVisible(true);
      selecao.dispose();
>>>>>>> ad2ef65607b9b2d9b3f46a3c8f2f143364d3bcc2
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