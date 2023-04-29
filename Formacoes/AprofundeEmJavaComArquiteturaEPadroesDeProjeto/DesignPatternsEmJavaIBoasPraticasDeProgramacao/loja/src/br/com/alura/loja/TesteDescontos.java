package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDecontos;
import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.ICMS;
import br.com.alura.loja.impostos.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 4);

        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDecontos calculadoraDeDecontos = new CalculadoraDeDecontos();
        System.out.println(calculadoraDeDecontos.calcular(primeiro));
        System.out.println(calculadoraDeDecontos.calcular(segundo));
    }
}
