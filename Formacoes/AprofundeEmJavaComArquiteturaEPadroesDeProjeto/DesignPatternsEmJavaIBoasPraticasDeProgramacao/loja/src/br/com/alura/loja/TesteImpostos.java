package br.com.alura.loja;

import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.ICMS;
import br.com.alura.loja.impostos.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
    }
}
