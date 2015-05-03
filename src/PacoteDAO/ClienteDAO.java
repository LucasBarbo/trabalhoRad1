package PacoteDAO;

import PacoteClasses.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteDAO {
    Connection con;

    
    public ClienteDAO() {
        Connection con = ConexaoUtil.getConnection();
    }

    public void salvar(Cliente cliente) {

        String sql = "INSERT INTO CLIENTE(idcliente,nome,telefone,email) values(?,?,?,?) ";

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

            e.printStackTrace();
        }

    }

    public Cliente buscarPorId(Integer id) {

        String sql = "SELECT * FROM cliente WHERE id=?";
        try {

            //prepara e executa o sql
            PreparedStatement preparadorSQL = con.prepareStatement(sql);
            preparadorSQL.setInt(1, id);

            //Armazenando Resultado da consulta
            ResultSet resultado = preparadorSQL.executeQuery();
            if (resultado.next()) {

                
                Cliente cli = new Cliente();

                //Atribuindo dados do resultado no objeto cliente
                cli.setId(id);
                cli.setNome(resultado.getString("nome"));
                cli.setTelefone(resultado.getString("telefone"));
                cli.setEmail("email");
                preparadorSQL.close();
                return cli;
            } else {
                return null;
            }
        } catch (SQLException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

    public void excluir(Integer id) {

        String sql = "DELETE FROM cliente WHERE id=?";

        try {
            PreparedStatement preparadorSQL = con.prepareStatement(sql);
            preparadorSQL.setInt(1, id);

            preparadorSQL.execute();
            preparadorSQL.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Cliente> buscarTodos() {
        String sql = "SELECT * FROM cliente ORDER BY id";
        try {
            PreparedStatement preparadorSQL = con.prepareStatement(sql);

            //Armazenando Resultado da consulta
            ResultSet resultado = preparadorSQL.executeQuery();
            List<Cliente> lista = new ArrayList<>();
            while (resultado.next()) {
                //Instancia de cliente
                Cliente cli = new Cliente();

                //Atribuindo dados do resultado no objeto cliente
                cli.setId(resultado.getInt("id"));
                cli.setNome(resultado.getString("nome"));
                cli.setTelefone(resultado.getString("telefone"));
                cli.setEmail("email");
                //Adicionando cliente na lista
                lista.add(cli);
            }

            preparadorSQL.close();
            return lista;
        } catch (SQLException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

    }

}
