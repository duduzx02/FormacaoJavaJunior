package br.com.alura.loja.orcamento.situacao;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void Aprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser aprovado!");
    }

    public void Reprovar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser reprovado!");
    }

    public void Finalizar(Orcamento orcamento){
        throw new DomainException("Orcamento não pode ser Finalizado!");
    }
}
