package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDecontos {
    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantidadeDeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        if (orcamento.getValor().compareTo(new BigDecimal("500"))  > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
}
