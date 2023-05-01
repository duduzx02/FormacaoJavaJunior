package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento {

    @Override
    public void Finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
