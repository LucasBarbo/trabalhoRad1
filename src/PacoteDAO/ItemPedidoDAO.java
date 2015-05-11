package PacoteDAO;

import PacoteClasses.ItemPedido;
import PacoteClasses.Pedido;
import PacoteClasses.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author williamdrummer
 */
public class ItemPedidoDAO {

    Connection con;

    public ItemPedidoDAO() {

        con = ConexaoUtil.getConnection();
    }

//    salva os dados da compra
    public void salvar(ItemPedido itempedido) {

        String sql = "INSERT INTO ITEMPEDIDO(produto,quantidade,valor,pedido)VALUES(?,?,?,?) ";
        try {
            PreparedStatement preparador = con.prepareStatement(sql);
            preparador.setObject(1, itempedido.getProduto());
            preparador.setInt(2, itempedido.getQuantidade());
            preparador.setDouble(3, itempedido.getValor());
            preparador.setObject(4, itempedido.getPedido());
            preparador.execute();
            preparador.close();

        } catch (SQLException e) {
            //Logger.getLogger(ItemPedidoDAO.class.getName()).log(Level.SEVERE, null, ex);

            e.printStackTrace();
        }
    }

//    exclui um item atraves do id informado pelo usuario
    public void excluir(ItemPedido itempedido) {

        String sql = "DELETE FROM ITEMPEDIDO WHERE IDITEMPEDIDO=?";

        try {
            PreparedStatement preparadorSQL = con.prepareStatement(sql);
            preparadorSQL.setInt(1, itempedido.getId());

            preparadorSQL.execute();
            preparadorSQL.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ItemPedido buscarPorId(Integer id) {

        String sql = "SELECT * FROM ITEMPEDIDO WHERE iditempedido=?";
        try {

            //prepara e executa o sql
            PreparedStatement preparadorSQL = con.prepareStatement(sql);
            preparadorSQL.setInt(1, id);

            //Armazenando Resultado da consulta
            ResultSet resultado = preparadorSQL.executeQuery();

            //faz a busca por dados cadastrados no banco, quando não estiver mais ele retorna null
            if (resultado.next()) {

                ItemPedido itemP = new ItemPedido();

                //Atribuindo dados do resultado no objeto itempedido
                itemP.setId(id);
                itemP.setProduto((Produto) resultado.getObject("idproduto"));
                itemP.setQuantidade(resultado.getInt("quantidade"));
                itemP.setValor(resultado.getDouble("valor"));

                preparadorSQL.close();
                return itemP;
            } else {
                return null;
            }
        } catch (SQLException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<ItemPedido> buscarTodos() {

        String sql = "SELECT * FROM ITEMPEDIDO ORDER BY id";
        List<ItemPedido> lista = new ArrayList<>();
        try {
            PreparedStatement preparadorSQL = con.prepareStatement(sql);

            //Armazenando Resultado da consulta
            ResultSet resultado = preparadorSQL.executeQuery();

            while (resultado.next()) {
                //Instancia de ItemPedido
                ItemPedido itemP = new ItemPedido();

                //Atribuindo dados do resultado no objeto itempedido
                itemP.setId(resultado.getInt("iditempedido"));
                itemP.setId(resultado.getInt("idproduto"));
                itemP.setQuantidade(resultado.getInt("quantidade"));
                itemP.setValor(resultado.getDouble("valor"));
                itemP.setPedido((Pedido) resultado.getObject("id"));

                //Adicionando itempedido na lista
                lista.add(itemP);
            }

            preparadorSQL.close();
            return lista;
        } catch (SQLException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

//    metodo que retorna o valor total da quantidade de produtos escolhido 
    public ItemPedido valorTotalProdutos(Produto produto) {
        String sql = "SELECT valor FROM PRODUTO WHERE idproduto = ? ";

        try {

            //prepara e executa o sql
            PreparedStatement preparadorSQL = con.prepareStatement(sql);
            preparadorSQL.setInt(1, produto.getId());

            //Armazenando Resultado da consulta
            ResultSet resultado = preparadorSQL.executeQuery();
            if (resultado.next()) {

                ItemPedido itemP = new ItemPedido();

                //Atribuindo dados do resultado no objeto itempedido
                itemP.setId(resultado.getInt("iditempedido"));
                itemP.setProduto((Produto) resultado.getObject("idproduto"));
                itemP.setQuantidade(resultado.getInt("quantidade"));
//                itemP.setValor(resultado.getDouble("valor"));
                itemP.setValor((resultado.getDouble("valor") * resultado.getInt("quantidade")));
                itemP.setPedido((Pedido) resultado.getObject("id"));
//                

                preparadorSQL.close();
                return itemP;
            } else {
                return null;
            }
        } catch (SQLException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
