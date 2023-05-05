package br.com.alura.loja.impostos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {
    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected  abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorDoutroImposto = BigDecimal.ZERO;
        if (outro != null){
            valorDoutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valorDoutroImposto);
    }
}
