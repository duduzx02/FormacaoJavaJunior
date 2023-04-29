package br.com.alura.loja.descontos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDecontos {
    public BigDecimal calcular(Orcamento orcamento){
       Desconto desconto = new DescontoParaQuantidadeDeItens(new DescontoParaValorDoOrcamento(new SemDesconto()));

        return  desconto.calcular(orcamento);
    }
}
