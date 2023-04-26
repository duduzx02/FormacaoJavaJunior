package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformace {

        public static void main(String[] args) {

            Collection<Integer> numerosComArrayList = new ArrayList<>();

            long inicio = System.currentTimeMillis();

            for (int i = 1; i <= 50000; i++) {
                numerosComArrayList.add(i);
            }

            for (Integer numero : numerosComArrayList) {
                numerosComArrayList.contains(numero);
            }

            long fim = System.currentTimeMillis();

            long tempoDeExecucao = fim - inicio;

            System.out.println("Tempo gasto com ArrayList: " + tempoDeExecucao);


            Collection<Integer> numerosComHashSet = new HashSet<>();

            long inicioHashSet = System.currentTimeMillis();

            for(int i = 1; i <= 50000; i++){
                numerosComHashSet.add(i);
            }

            for(Integer numero: numerosComHashSet){
                numerosComHashSet.contains(numero);
            }

            long fimHashSet = System.currentTimeMillis();

            long tempoDeExecucaoHashSet = fimHashSet - inicioHashSet;

            System.out.println("Tempo gasto com HashSet: " + tempoDeExecucaoHashSet);
        }

    }
