package testeDoBanco;

import PacoteClasses.Cliente;
import PacoteDAO.ClienteDAO;

public class testeDAO {

    public static void main(String[] args) {
     
        testSalvar();
    }
    private static void testSalvar() {
        Cliente cli = new Cliente();

        cli.setId(001);
        cli.setNome("Willian");
        cli.setTelefone("xxx-xxx");
        cli.setEmail("ffffafadfaa@faffdz");

        
        ClienteDAO cliDao = new ClienteDAO();
        cliDao.salvar(cli);
    

 }
}

