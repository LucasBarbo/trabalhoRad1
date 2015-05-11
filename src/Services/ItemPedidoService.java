package Services;

import PacoteClasses.ItemPedido;
import PacoteClasses.Produto;
import PacoteDAO.ItemPedidoDAO;
import java.util.List;

/**
 *
 * @author williamdrummer
 */
public class ItemPedidoService {

    private ItemPedidoDAO itempedidoDAO;

    //construtor
    public ItemPedidoService() {
        itempedidoDAO = new ItemPedidoDAO();
    }

   

    public void salvar(ItemPedido itempedido) throws ServiceException {

        if (itempedido.getProduto() == null) {
            throw new ServiceException(" Campo produto é obrigatorio,informe o id do produdo ou nome do produto ");
        }
        if (itempedido.getQuantidade() == null) {
            throw new ServiceException(" Campo quantidade é obrigatorio ");
        }

        itempedidoDAO.salvar(itempedido);

    }

    public void excluir(ItemPedido itempedido) {

        itempedidoDAO.excluir(itempedido);
    }

    public ItemPedido buscarPorId(Integer id) {

        return itempedidoDAO.buscarPorId(id);

    }

    public List<ItemPedido> buscarTodos() {
        return itempedidoDAO.buscarTodos();
    }

    //retorna o valor total para a tela
    public ItemPedido valorTotalProdutos(Produto produto) {

        return itempedidoDAO.valorTotalProdutos(produto);
    }

}
