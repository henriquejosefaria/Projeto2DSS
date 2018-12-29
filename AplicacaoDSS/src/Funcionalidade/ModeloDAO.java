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
    
    public ArrayList<Modelo> getModelos() throws SQLException{
        ArrayList <Modelo> list = new ArrayList<>();
        Connection con = AConnection.createConnection();
        if(con!=null){
        PreparedStatement pst = con.prepareStatement("SELECT * FROM modelo");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            Modelo modelo = new Modelo(rs.getString(1),rs.getInt(2),rs.getString(3));
            list.add(modelo);
        }
        AConnection.closeConection(con);
        }
        return list;
    }
    
}
