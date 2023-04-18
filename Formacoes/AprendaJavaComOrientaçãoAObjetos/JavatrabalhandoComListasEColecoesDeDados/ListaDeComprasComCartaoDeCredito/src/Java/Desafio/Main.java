package Java.Desafio;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int continuar = 1;
        while(continuar != 0){

            System.out.print("Digite a descrição da compra: ");
            String descricaoCompraAtual = scanner.next();

            System.out.print("Digite o valor da compra: ");
            double valorCompraAtual = scanner.nextDouble();

            Compra compra = new Compra(descricaoCompraAtual, valorCompraAtual);
            boolean compraRealizada = cartaoDeCredito.registraCompra(compra);

            if(compraRealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                continuar = scanner.nextInt();
            } else {
                System.out.println("----------ERROR----------");
                System.out.println("    Saldo insuficiente!    ");
                System.out.println("----------ERROR----------");

                continuar = 0;
            }

            System.out.println("***********************");
            System.out.println("COMPRAS REALIZADAS:\n");
            Collections.sort(cartaoDeCredito.getCompras());
            for (Compra c: cartaoDeCredito.getCompras()) {
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }
            System.out.println("\n***********************");
            System.out.println(cartaoDeCredito.getSaldo());


        }


    }
}
