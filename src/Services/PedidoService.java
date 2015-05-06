package Services;

import PacoteClasses.Pedido;
import java.util.List;

/**
 *
 * @author williamdrummer
 */
/*public class PedidoService {

    private PedidoDAO pedidoDAO;

    public PedidoService() {
        pedidoDAO = new PedidoService();
    }

    public void salvar(Pedido pedido) throws ServiceException {

        //rever condição do banco se esta setando id automatico
        if (pedido.getId() == null) {
            throw new SecurityException("O campo id é obrigatorio ");
        }
        if (pedido.getOrigemPedido().isEmpty()) {
            throw new SecurityException("O campo origem do pedido é obrigatorio ");
        }

        if (pedido.getDataPedido() == null) {
            throw new SecurityException("O campo data do pedido é obrigatorio ");
        }
        if (pedido.getCliente() == null) {
            throw new SecurityException("O campo Cliente é obrigatorio ");
        }
        if (pedido.getCerimonial().isEmpty()) {
            throw new SecurityException("O campo cerimonial é obrigatorio ");
        }
        if (pedido.getDataEvento() == null) {
            throw new SecurityException("O campo data do evento é obrigatorio ");
        }
        if (pedido.getTipoEvento() == null) {
            throw new SecurityException("O campo tipo do evento é obrigatorio ");
        }
        if (pedido.getCerimonial().isEmpty()) {
            throw new SecurityException("O campo cerimonial é obrigatorio ");
        }
        if (pedido.getHoraEvento().isEmpty()) {
            throw new SecurityException("O campo hora do evento é obrigatorio ");
        }
        if (pedido.getLocalEvento().isEmpty()) {
            throw new SecurityException("O campo local do evento é obrigatorio ");
        }
        if (pedido.getEndereco().isEmpty()) {
            throw new SecurityException("O campo endereço do evento é obrigatorio ");
        }
        pedidoDAO.salvar(pedido);
    }

    public Pedido buscarPorId(Integer id) {
        return pedidoDAO.buscarPorId(id);
    }

    public void excluir(Integer id) {
        pedidoDAO.excluir(id);
    }

    public List<Pedido> buscarTodos() {
        return pedidoDAO.buscarTodos();
    }
}*/
