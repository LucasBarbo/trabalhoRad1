package Services;

import PacoteClasses.TipoEvento;
import PacoteDAO.TipoEventoDAO;
import java.util.List;

/**
 *
 * @author Wil
 */
public class TipoEventoService {

    private TipoEventoDAO tipoeventoDAO;

    public TipoEventoService() {
        tipoeventoDAO = new TipoEventoDAO();
    }

    public void salvar(TipoEvento tipoevento) throws ServiceException {

        if (tipoevento.getDescricao().isEmpty()) {
            throw new ServiceException(" Campo descricao é obrigatorio ");
        }
        tipoeventoDAO.salvar(tipoevento);
    }

    public void excluir(TipoEvento tipoevento) {
        tipoeventoDAO.excluir(tipoevento);
    }

    public List<TipoEvento> buscarTodos() {
        return tipoeventoDAO.buscarTodos();
    }

    public TipoEvento buscarPorId(Integer id) {
        return tipoeventoDAO.buscarPorId(id);
    }

    public void alterar(TipoEvento tipoevento) {
        tipoeventoDAO.alterar(tipoevento);
    }

}
