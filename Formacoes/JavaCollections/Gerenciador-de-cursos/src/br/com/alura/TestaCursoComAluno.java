package br.com.alura;

import java.util.Set;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções do Java", "Paulo");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);
        Aluno a4 = new Aluno("Eduardo Lima", 15879);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println("O " + a1 + ", Está matriculado? " + javaColecoes.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini",34672);
        System.out.println("E esse turini, está matriculado? ");
        System.out.println(javaColecoes.estaMatriculado(turini));

        System.out.println("O a1 é == ao Turini?");
        System.out.println(a1 == turini);

        System.out.println("o a1 é equals ao Turini?");
        System.out.println(a1.equals(turini));

        System.out.println("a1.hashCode() == turini.hashCode()");
        System.out.println(a1.hashCode() == turini.hashCode());
    }
}
