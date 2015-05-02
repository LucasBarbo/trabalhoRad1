
package Services;

/**
 *
 * @author Wil
 */

import PacoteClasses.Cliente;
import PacoteDAO.ClienteDAO;
import java.util.List;

class ClienteService {

    private ClienteDAO clienteDAO;

    //Contrutor
    public ClienteService() {
        clienteDAO = new ClienteDAO();
    }

    public void salvar(Cliente cliente) throws ServiceException {

        if (cliente.getNome().isEmpty()) {
            throw new ServiceException(" Campo nome é obrigatorio ");
        }
        if (cliente.getTelefone().isEmpty()) {
            throw new ServiceException(" Campo telefone é obrigatorio ");
        }
         if (cliente.getEmail().isEmpty()) {
            throw new ServiceException(" Campo Email é obrigatorio ");
        }
        clienteDAO.salvar(cliente);
    }

      public Cliente buscarPorId(Integer id) {
        return clienteDAO.buscarPorId(id);
    }

    public void excluir(Integer id) {
       clienteDAO.excluir(id);
    }

     public List<Cliente> buscarTodos() {
        return clienteDAO.buscarTodos();
    }
}

