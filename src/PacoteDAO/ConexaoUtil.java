/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PacoteDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoUtil {

    public static Connection getConnection() {
        Connection con = null;

        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bemcasadosrad1", "postgres", "admim");
            System.out.println("Conectado com sucesso");
        } catch (SQLException e) {


            System.out.println("Conexão não pode ser efetuada :" + e.getMessage());
        }
        return con;
    }
}
