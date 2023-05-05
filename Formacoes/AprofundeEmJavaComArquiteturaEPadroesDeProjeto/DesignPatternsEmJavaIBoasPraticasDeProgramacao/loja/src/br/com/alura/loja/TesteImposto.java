package br.com.alura.loja;

import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.ICMS;
import br.com.alura.loja.impostos.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(null)));
    }
}
