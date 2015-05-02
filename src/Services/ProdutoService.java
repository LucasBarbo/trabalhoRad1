package Services;

import java.util.List;

/**
 *
 * @author Wil
 */
/*public class ProdutoService {

    class ClienteService {

        private ProdutoDAO produtoDAO;

        //Contrutor
        public ProdutoService() {
            produtoDAO = new ProdutoDAO();
        }

        public void salvar(Produto produto) throws ServiceException {

            // verifica se usuario passou vazio, apos confirmado que está vazio é lançado uma exceção com uma mensagem
            if (produto.getId().isEmpty()) {
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

        
        
        public void excluir(Integer id) {
            produtoDAO.excluir(id);
        }

        
        public List<Produto> buscarTodos() {
            return produtoDAO.buscarTodos();
        }
    }

}
*/
