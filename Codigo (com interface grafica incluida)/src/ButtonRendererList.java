


import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.ListCellRenderer;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;

class ButtonRendererList extends JButton implements ListCellRenderer {

  public ButtonRendererList() {
    setOpaque(true);
  }

  @Override
 public Component getListCellRendererComponent(JList jlist, Object value,
                int cellIndex, boolean isSelected, boolean cellHasFocus) {
    if (isSelected) {
      setForeground(jlist.getSelectionForeground());
      setBackground(jlist.getSelectionBackground());
    } else {
      setForeground(jlist.getForeground());
      setBackground(UIManager.getColor("Button.background"));
    }
    setText((value == null) ? "" : value.toString());
    return this;
  }
}