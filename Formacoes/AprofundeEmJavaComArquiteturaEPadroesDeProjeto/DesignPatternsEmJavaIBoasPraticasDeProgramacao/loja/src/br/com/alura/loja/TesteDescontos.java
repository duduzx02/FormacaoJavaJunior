package br.com.alura.loja;

import br.com.alura.loja.descontos.CalculadoraDeDecontos;
import br.com.alura.loja.impostos.CalculadoraDeImpostos;
import br.com.alura.loja.impostos.ICMS;
import br.com.alura.loja.impostos.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeDecontos calculadoraDeDecontos = new CalculadoraDeDecontos();
        System.out.println(calculadoraDeDecontos.calcular(primeiro));
        System.out.println(calculadoraDeDecontos.calcular(segundo));
        System.out.println(calculadoraDeDecontos.calcular(terceiro));
    }
}
