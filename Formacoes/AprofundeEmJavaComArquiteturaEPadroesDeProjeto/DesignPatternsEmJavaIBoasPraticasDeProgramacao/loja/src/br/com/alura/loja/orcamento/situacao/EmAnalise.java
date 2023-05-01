package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void Aprovar(Orcamento orcamento){
        orcamento.setSituacao(new Aprovado());
    }

    public void Reprovar(Orcamento orcamento){
        orcamento.setSituacao(new Reprovado());
    }
}
