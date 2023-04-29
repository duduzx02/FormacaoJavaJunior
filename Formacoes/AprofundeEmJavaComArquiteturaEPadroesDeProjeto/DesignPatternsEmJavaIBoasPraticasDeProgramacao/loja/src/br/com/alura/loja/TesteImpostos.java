package br.com.alura.loja;

import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ICMS));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));
    }
}
