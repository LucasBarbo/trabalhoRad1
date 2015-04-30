 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rf3020
 */
public class ConexaoUtil {

    public static Connection getConnection() {
        String url = "jdbc:postgresql://localhost:5432/clientesdb";
        String usuario = "postgres";
        String senha = "postgres";
        Connection con = null;
        
        try {
             con = DriverManager.getConnection(url,usuario, senha);
              System.out.println("Conectado com sucesso !");
        } catch (SQLException ex) {
            ex.printStackTrace();
            
            System.out.println(" A conexão não pode ser efetuada, lá vem a exception "+ ex.getLocalizedMessage());
        }
        
        return con;

    }

}
