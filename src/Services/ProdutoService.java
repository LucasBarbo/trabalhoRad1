package Services;

import PacoteClasses.Pedido;
import PacoteClasses.Produto;
import PacoteDAO.ProdutoDAO;
import java.util.List;

/**
 *
 * @author Wil
 */
public class ProdutoService {

    

        private ProdutoDAO produtoDAO;

        //Contrutor
        public ProdutoService() {
            produtoDAO = new ProdutoDAO();
        }

        public void salvar(Produto produto) throws ServiceException {

            // verifica se usuario passou vazio, apos confirmado que está vazio é lançado uma exceção com uma mensagem
            if (produto.getId() == null) {
                throw new ServiceException(" Campo ID do produto é obrigatorio ");
            }
            if (produto.getDescricao().isEmpty()) {
                throw new ServiceException(" Campo descrição é obrigatorio ");
            }
            if (produto.getValor().isEmpty()) {
                throw new ServiceException(" Campo valor é obrigatorio");
            }
            produtoDAO.salvar(produto);
        }

        
        public Produto buscarPorId(Integer id) {
            return produtoDAO.buscarPorId(id);
        }

        
        
        public void excluir(Produto produto) {
            produtoDAO.excluir(produto);
        }

         public void alterar(Produto produto){
        produtoDAO.alterar(produto);
    }
        
        public List<Produto> buscarTodos() {
            return produtoDAO.buscarTodos();
        }
    }



