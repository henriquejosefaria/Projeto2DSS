package InterfaceGrafica;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//from  ww  w  . j  ava  2 s. co  m
public class NewClass extends JFrame {
  public NewClass() {
    ImageIcon aboutIcon = new ImageIcon("C:\\Users\\Ryzon\\Documents\\NetBeansProjects\\Projeto2DSS\\InterfaceGrafica\\src\\interfacegrafica\\ola.png");
    ImageIcon addIcon = new ImageIcon("C:\\Users\\Ryzon\\Documents\\NetBeansProjects\\Projeto2DSS\\InterfaceGrafica\\src\\interfacegrafica\\ola.png");
    ImageIcon copyIcon = new ImageIcon("C:\\Users\\Ryzon\\Documents\\NetBeansProjects\\Projeto2DSS\\InterfaceGrafica\\src\\interfacegrafica\\ola.png");

    String[] columnNames = { "Picture", "Description" };
    Object[][] data = { { aboutIcon, "About" }, { addIcon, "Add" },
        { copyIcon, "Copy" }, };

    DefaultTableModel model = new DefaultTableModel(data, columnNames);
    JTable table = new JTable(model) {
      public Class getColumnClass(int column) {
        return (column == 0) ? Icon.class : Object.class;
      }
    };
    table.setPreferredScrollableViewportSize(table.getPreferredSize());

    JScrollPane scrollPane = new JScrollPane(table);
    getContentPane().add(scrollPane);
  }

  public static void main(String[] args) {
    NewClass frame = new NewClass();
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
  }

}