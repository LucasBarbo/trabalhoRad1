package PacoteDao;

import PacoteClasses.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {

    Connection con = ConexaoUtil.getConnection();

    public void cadastraCliente(Cliente cliente) throws SQLException {

        String sql = "INSERT INTO CLIENTE(idcliente, nome,telefone,email) values (?,?,?,?)";

        //Construindo o PreparedStatement com o Sql
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, cliente.getId());
            preparador.setString(2, cliente.getNome());
            preparador.setString(3, cliente.getTelefone());
            preparador.setString(4, cliente.getEmail());

        // as linhas abaixo iniciam e fecham o preparedStatament
            preparador.execute();
            preparador.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
