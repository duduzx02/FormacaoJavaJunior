package VariaveisEReferencias;

public class VariaveisEreferencias {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Avatar", 2009);
        Filme filme2 = new Filme("The Matrix", 1999);
        Filme filme3 = filme1;

        if(filme1 == filme3){
            System.out.println("Iguais");
        } else{
            System.out.println("Diferentes");
        }

        Filme filme4 = new Filme("The Matrix", 1999);

        if (filme2 == filme4){
            System.out.println("iguais");
        } else {
            System.out.println("Diferentes");
        }
    }
}

class Filme{
    private String nome;
    private int ano;

    public Filme(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }
}