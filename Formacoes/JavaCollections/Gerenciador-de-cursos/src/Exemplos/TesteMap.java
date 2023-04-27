package Exemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        // Para acessar as chaves devemos executar:

        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome: chaves) {
            System.out.println(nome);
        }

        // E para pegar os valores usamos:
        nomesParaIdade.keySet().forEach(idade -> {
            System.out.println(nomesParaIdade.get(idade));
        });

    }
}
