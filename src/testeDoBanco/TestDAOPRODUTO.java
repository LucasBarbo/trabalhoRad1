package testeDoBanco;

import PacoteClasses.Produto;
import PacoteDAO.ProdutoDAO;
import java.util.List;

public class TestDAOPRODUTO {

   
//        testSalvarProduto();
//        testDeletarProduto();
//        testBuscatodosProduto();
//        testAlterarProduto();
//        testBuscaPorIdProduto();

    

    private static void testSalvarProduto() {
        Produto pro = new Produto();

        pro.setDescricao("Bolo");
        pro.setValor("11.90");
        pro.setId(6);

        ProdutoDAO proDAO = new ProdutoDAO();
        proDAO.salvar(pro);

    }

    private static void testDeletarProduto() {
        Produto pro = new Produto();

        pro.setId(6);

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
        pro.setDescricao("Torta");

        ProdutoDAO proDAO = new ProdutoDAO();
        proDAO.alterar(pro);
    }

    private static void testBuscaPorIdProduto() {
        ProdutoDAO proDAO = new ProdutoDAO();
        Produto res = proDAO.buscarPorId(6);
        System.err.println(res.getDescricao() + " " + res.getValor() + " " + res.getId());

    }
}
