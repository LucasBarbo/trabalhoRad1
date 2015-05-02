package PacoteDAO;

import PacoteClasses.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ClienteDAO {

    /**
     *
     * @param
     */
    Connection con = ConexaoUtil.getConnection();

    public void salvar(Cliente cliente) {

        String sql = "INSERT INTO USUARIO(idcliente,nome,telefone,email) values(?,?,?,?) ";

        // constroi preparedstatement com o sql
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setInt(1, cliente.getId());
            preparador.setString(2, cliente.getNome());
            preparador.setString(3, cliente.getTelefone());
            preparador.setString(4, cliente.getEmail());
            
            preparador.execute();
            preparador.close();

    //        System.out.println("Cadastrado com sucesso ! ");

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public Cliente buscarPorId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void excluir(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Cliente> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
