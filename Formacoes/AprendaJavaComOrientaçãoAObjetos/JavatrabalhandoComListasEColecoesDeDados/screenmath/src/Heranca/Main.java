package Heranca;

public class Main {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();

        minhaConta.depositar(1000);
        minhaConta.setTitular("Eduardo");
        minhaConta.sacar(500);
        System.out.println(minhaConta.getSaldo());

        ContaPoupanca minhaContaPoupanca = new ContaPoupanca();
        minhaContaPoupanca.depositar(1000);
        minhaContaPoupanca.setTitular("Augusto");
        minhaContaPoupanca.sacar(500);

    }
}
