package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcoesAposGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPeidoHandler {

    private List<AcoesAposGerarPedido> acoes;

    public GeraPeidoHandler(List<AcoesAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acoesAposGerarPedido -> {
            acoesAposGerarPedido.executarAcao(pedido);
        });
    }
}
