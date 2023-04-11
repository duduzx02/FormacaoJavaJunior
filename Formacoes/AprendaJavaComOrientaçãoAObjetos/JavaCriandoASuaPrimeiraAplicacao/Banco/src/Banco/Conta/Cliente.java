package Banco.Conta;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "Eduardo Lima";
        String tipoConta = "Corrente";
        double saldoInicial = 2500.0;
        int opcoes = 0;
        int novoSaldo = 0;
        int valorTransferencia = 0;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoInicial);
        System.out.println("\n***********************");

        while(true) {
            System.out.print("""
                    Operações:
                                
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                                    
                    Digite a opção desejada:
                    """);
            opcoes = scan.nextInt();

            if (opcoes == 1){
                System.out.println("Seu saldo é : " + saldoInicial);
            } else if (opcoes == 2){
                System.out.println("Informe o valor a receber: ");
                novoSaldo = scan.nextInt();
                novoSaldo += saldoInicial;
                System.out.println("Seu novo saldo: R$ " + novoSaldo);
            } else if (opcoes == 3){
                System.out.println("Informe o valor que deseja transferir: ");
                valorTransferencia = scan.nextInt();
                if (valorTransferencia > novoSaldo){
                    System.out.println("Saldo insuficiente!");
                } else{
                    novoSaldo -= valorTransferencia;
                    System.out.println("Seu novo saldo: R$ " + novoSaldo);
                }
            } else if (opcoes == 4){
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }


    }
}
