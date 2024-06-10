import java.util.Scanner;

public class Conta {
    private String nomeCliente;
    private String agencia;
    private int numeroConta;
    private double saldo;

    public void inserirCliente() {
        System.out.println("Digite o seu nome:");
        String cliente = new Scanner(System.in).nextLine();
        setNomeCliente(cliente);
    }

    public void inserirNumeroConta() {
        System.out.println("Digite o número da sua conta:");
        int numeroConta = new Scanner(System.in).nextInt();
        setNumeroConta(numeroConta);

    }

    public void inserirAgencia() {
        System.out.println("Digite sua agência:");
        String agencia = new Scanner(System.in).nextLine();
        setAgencia(agencia);

    }

    public void inserirSaldo() {
        System.out.println("Digite seu Saldo:");
        double saldo = new Scanner(System.in).nextDouble();
        setSaldo(saldo);

    }

    public void retornoDados() {
        System.out.println("Olá " + getNomeCliente() + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + getAgencia() + ", conta " + getNumeroConta() + " e seu saldo " + getSaldo() + " já está disponível");

    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
