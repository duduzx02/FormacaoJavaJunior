package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPeidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "args[0]";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidaDeItens = Integer.parseInt("2");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidaDeItens);
        GeraPeidoHandler handler = new GeraPeidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
        );
        handler.execute(gerador);
    }


}
