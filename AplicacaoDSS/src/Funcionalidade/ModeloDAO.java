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
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author henriquefaria
 */
public class ModeloDAO {
    
    public List<Modelo> getModelos() throws SQLException{
        List <Modelo> list = new ArrayList<>();
        Connection con = AConnection.createConnection();
        if(con!=null){
            System.out.println("entrei na bd");
        PreparedStatement pst = con.prepareStatement("SELECT * FROM modelo");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
            System.out.println("Em iteração");
            Modelo modelo = new Modelo(rs.getString(1),rs.getDouble(2),rs.getString(3));
            list.add(modelo);
        }
        System.out.println("Acabei iteração");
        AConnection.closeConection(con);
        }
        return list;
    }
    
}
