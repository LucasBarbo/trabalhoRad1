package testeDoBanco;

import PacoteClasses.Cliente;
import PacoteDAO.ClienteDAO;

public class testeDAO {

    public static void main(String[] args) {

//        testSalvar();
//        testDeletar();
//          testBuscatodos();
          testAlterar();
          
    }

    private static void testSalvar() {
        Cliente cli = new Cliente();

        cli.setNome("Ed Motta");
        cli.setTelefone("xburguer-xEgg");
        cli.setEmail("Manuel@foiproceu.wawa.com.br");

        ClienteDAO cliDao = new ClienteDAO();
        cliDao.salvar(cli);

    }

    private static void testDeletar() {
        Cliente cli = new Cliente();

        cli.setId(1);

        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.excluir(cli);

    }

    private static void testBuscatodos() {
        Cliente cli = new Cliente();

        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.buscarTodos();

    }
    
    private static void testAlterar() {
		Cliente cli = new Cliente();
		cli.setId(3);
		cli.setNome("William");
		cli.setTelefone("abcdef");
		cli.setEmail("Nor@Chuck.com.br");

		ClienteDAO cliDAO = new ClienteDAO();
		cliDAO.alterar(cli);
	}
    
    private static void testBuscaPorId() {
        Cliente cli = new Cliente();

        cli.setId(3);

        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.buscarPorId(3);

    }


}
