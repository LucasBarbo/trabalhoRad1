package testeBancoEstePacoteESopratestarobancomesmo;

import PacoteClasses.Cliente;

public class TestClienteDAO {

    public static void main(String[]args){
        testCadastrar();
    }

    private static void testCadastrar() {
        Cliente cli = new Cliente();
        
        cli.setId(001);
        cli.setNome("Diosefer");
        cli.setEmail("dioumisbond@hotmail.com");
        cli.setTelefone("xxxx-xxx");
    }
}
