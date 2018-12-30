/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionalidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author henriquefaria
 */
public class ModeloDAO {
    
    public ModeloDAO(){
    
    }
    public ArrayList<Modelo> getModelos() throws SQLException{
        ArrayList <Modelo> list = new ArrayList<>();
        System.out.println("1");
        Connection con = AConnection.createConnection();
        System.out.println("2");
        if(con!=null){
            System.out.println("3");
            PreparedStatement pst = con.prepareStatement("SELECT * FROM modelo");
            System.out.println("4");
            ResultSet rs = pst.executeQuery();
            System.out.println("5");
            while(rs.next()){
                Modelo modelo = new Modelo(rs.getString(1),rs.getDouble(2),rs.getString(3));
                list.add(modelo);
            }
            System.out.println("6");
            AConnection.closeConection(con);
        }
        return list;
    }
    
}
