package br.com.alura;

import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");

        // No set os itens não se repetem.
        alunos.remove("Mauricio Aniche"); // Se tirar um, tira todos, até porque nunca entrou

        System.out.println(alunos);

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos.size());

        boolean eduadoEstaMatriculado = alunos.contains("Eduardo Lima");
        System.out.println(eduadoEstaMatriculado);

        List<String> alunosEmLista = new ArrayList<>(alunos);

        alunosEmLista.forEach(aluno -> {
            System.out.println(aluno);
        });
    }

}
