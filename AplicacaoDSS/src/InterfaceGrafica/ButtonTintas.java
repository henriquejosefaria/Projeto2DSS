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
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.CellEditor;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author henriquefaria
 */
public class ButtonTintas extends DefaultCellEditor {

    private Facade facade;
    protected JButton button;
    private String label;
    private boolean isPushed;
    
    public ButtonTintas(JCheckBox checkBox,TintasJFrame mod, JTable table,List<Componente> tintas, Facade facade, JButton x) {
    super(checkBox);
        button = new JButton();
        this.facade = facade;
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              int i = table.getSelectedRow();
              Componente t = tintas.get(i);
              facade.addComponente(t);
              x.setEnabled(true);
              mod.dispose();
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
  
    
}
