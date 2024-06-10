public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, olá  World!");
        Conta cliente = new Conta();
        cliente.inserirCliente();
        cliente.inserirAgencia();
        cliente.inserirNumeroConta();
        cliente.inserirSaldo();
        cliente.retornoDados();

    }
}
