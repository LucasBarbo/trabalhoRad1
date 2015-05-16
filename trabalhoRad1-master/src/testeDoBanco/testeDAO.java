package testeDoBanco;

import PacoteClasses.Cliente;
import PacoteClasses.Produto;
import PacoteClasses.TipoEvento;
import PacoteDAO.ClienteDAO;
import PacoteDAO.ProdutoDAO;
import PacoteDAO.TipoEventoDAO;
import java.util.List;

public class testeDAO {

    public static void main(String[] args) {

//        testSalvar();
//        testDeletar();
        testBuscatodos();
//        testAlterar();
//        testBuscaPorId();
//------------------------------------
//       testSalvarProduto();
//       testDeletarProduto();
//       testBuscatodosProduto();
//       testAlterarProduto();
//       testBuscaPorIdProduto();
//        
//----------------------------
//        testSalvarTipoEvento();
//        testBuscatodosEventos();
//        testAlterarEvento();
//        testBuscaPorIdEvento();
//        testDeletarEvento();
    }

    private static void testSalvar() {
        Cliente cli = new Cliente();

        cli.setNome("Steve Vai");
        cli.setTelefone("CDEFGAB");
        cli.setEmail("vai.steveguitar@guitars.com");

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

        ClienteDAO cliDao = new ClienteDAO();
        List<Cliente> listaRes = cliDao.buscarTodos();
        System.out.print("\n");
        for (Cliente c : listaRes) {
            System.out.println(c.getNome() + " " + c.getTelefone() + " " + c.getEmail() + " " + c.getId());

        }

    }

    private static void testAlterar() {
        Cliente cli = new Cliente();
        cli.setId(5);
        cli.setNome("Anderson Silva");
        cli.setTelefone("abcdeffsfs");
        cli.setEmail("spideroaranha@gmail.com");

        ClienteDAO cliDAO = new ClienteDAO();
        cliDAO.alterar(cli);
    }

    private static void testBuscaPorId() {
        ClienteDAO cliDAO = new ClienteDAO();
        Cliente res = cliDAO.buscarPorId(6);
        System.err.println(res.getNome() + " " + res.getTelefone() + " " + res.getEmail() + " " + "Id do usuário " + res.getId());

    }

    // --------------------------------------------------------------------------------------------------
    // TESTES DO PRODUTO
    private static void testSalvarProduto() {
        Produto pro = new Produto();

        pro.setDescricao("Torta alemã");
        pro.setValor("7.50");

        ProdutoDAO proDAO = new ProdutoDAO();
        proDAO.salvar(pro);

    }

    private static void testDeletarProduto() {
        Produto pro = new Produto();

        pro.setId(1);

        ProdutoDAO proDAO = new ProdutoDAO();
        proDAO.excluir(pro);

    }

    private static void testBuscatodosProduto() {

        ProdutoDAO proDao = new ProdutoDAO();
        List<Produto> listaRes = proDao.buscarTodos();
        System.out.print("\n");
        for (Produto p : listaRes) {
            System.out.println(p.getDescricao() + " " + p.getValor() + " " + p.getId());

        }

    }

    private static void testAlterarProduto() {
        Produto pro = new Produto();
        pro.setId(6);
        pro.setDescricao("Mouse de maracuja");
        pro.setValor("4.50");
        ProdutoDAO proDAO = new ProdutoDAO();
        proDAO.alterar(pro);
    }

    private static void testBuscaPorIdProduto() {
        ProdutoDAO proDAO = new ProdutoDAO();
        Produto res = proDAO.buscarPorId(3);
        System.err.println(res.getDescricao() + " " + res.getValor() + " " + "O id do produto é" + " " + "" + res.getId());

    }

// ------------------------------------------------------------------------------------------------------
//    Teste TipoEvento
    private static void testSalvarTipoEvento() {
        TipoEvento evento = new TipoEvento();

        evento.setDescricao("Baile");

        TipoEventoDAO eventDAO = new TipoEventoDAO();
        eventDAO.salvar(evento);

    }

    private static void testBuscatodosEventos() {

        TipoEventoDAO eventDAO = new TipoEventoDAO();
        List<TipoEvento> listaRes = eventDAO.buscarTodos();
        System.out.print("\n");
        for (TipoEvento e : listaRes) {
            System.out.println(e.getDescricao() + " " + " " + e.getId());

        }
    }

    private static void testDeletarEvento() {
        TipoEvento event = new TipoEvento();

        event.setId(3);

        TipoEventoDAO eventDAO = new TipoEventoDAO();
        eventDAO.excluir(event);

    }

    private static void testBuscaPorIdEvento() {
        TipoEventoDAO eventDAO = new TipoEventoDAO();
        TipoEvento res = eventDAO.buscarPorId(5);
        System.err.println("Evento: " + res.getDescricao() + " " + " " + "com id: " + " " + "" + res.getId());

    }

    private static void testAlterarEvento() {
        TipoEvento event = new TipoEvento();
        event.setId(8);
        event.setDescricao("Aniversario");
        TipoEventoDAO eventDAO = new TipoEventoDAO();
        eventDAO.alterar(event);
    }

}
