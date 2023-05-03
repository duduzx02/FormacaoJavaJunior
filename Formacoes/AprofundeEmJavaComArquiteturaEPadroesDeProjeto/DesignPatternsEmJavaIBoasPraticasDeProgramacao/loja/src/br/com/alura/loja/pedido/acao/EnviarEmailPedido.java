package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;
import org.w3c.dom.ls.LSOutput;

public class EnviarEmailPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido!");
    }
}
