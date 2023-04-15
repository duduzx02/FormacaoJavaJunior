package CarrinhoDecompras;

import java.util.ArrayList;

public class Carrinho {
    ArrayList<String> produtos = new ArrayList<>();

    public void adicionarProduto(String produto){
        if (produtos.size() <= 10){
            produtos.add(produto);
        } else {
            System.out.println("Carrinho Cheio");
        }

    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "produtos=" + produtos +
                '}';
    }
}


class Main{
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        carrinho.adicionarProduto("1");
        carrinho.adicionarProduto("2");
        carrinho.adicionarProduto("3");
        carrinho.adicionarProduto("4");
        carrinho.adicionarProduto("5");
        carrinho.adicionarProduto("6");
        carrinho.adicionarProduto("7");
        carrinho.adicionarProduto("8");
        carrinho.adicionarProduto("9");
        carrinho.adicionarProduto("10");
        carrinho.adicionarProduto("11");
        carrinho.adicionarProduto("11");
        carrinho.adicionarProduto("11");
        carrinho.adicionarProduto("11");
        carrinho.adicionarProduto("11");

        System.out.println(carrinho);
    }
}