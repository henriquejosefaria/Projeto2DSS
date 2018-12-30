/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceGrafica;

import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author henriquefaria
 */
public class ImageButton extends DefaultTableCellRenderer {
    
    public ImageButton(String s) {
    this.setIcon(new ImageIcon(s));
  }

    
}
