package br.com.alura.loja.impostos;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMScomISS implements Imposto{

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal icms = new ICMS().calcular(orcamento);
        BigDecimal iss = new ISS().calcular(orcamento);
        return icms.add(iss);
    }
}
