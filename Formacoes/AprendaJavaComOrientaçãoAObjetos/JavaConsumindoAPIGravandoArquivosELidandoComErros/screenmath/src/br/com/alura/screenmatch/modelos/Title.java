package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecoes.ErroNaConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class Title implements Comparable<Title> {
    private String name;
    private int releaseyear;
    private boolean includedInThePlan;
    private double sumOfRatings;
    private int evaluationTotal;
    private int durationInMinutes;

    public Title(String name, int releaseyear) {
        this.name = name;
        this.releaseyear = releaseyear;
    }

    public Title(TituloOmdb meuTitulo) {
        this.name = meuTitulo.title();
        if(meuTitulo.year().length() > 4){
            throw new ErroNaConversaoDeAnoException("O ano tem mais de 04 caracteres! ");
        }
        this.releaseyear = Integer.valueOf(meuTitulo.year());
        this.durationInMinutes = Integer.valueOf(meuTitulo.runtime().substring(0, 2));
    }

    public int getEvaluationTotal(){
        return evaluationTotal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getReleaseyear() {
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }

    public void setSumOfRatings(double sumOfRatings) {
        this.sumOfRatings = sumOfRatings;
    }

    public void setEvaluationTotal(int evaluationTotal) {
        this.evaluationTotal = evaluationTotal;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showedTechnicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseyear);
        System.out.println("Duração em minutos: " + durationInMinutes);
        System.out.println("Incluído no plano: " + includedInThePlan);
    }

    public void evaluate(double note){
        sumOfRatings += note;
        evaluationTotal++;
    }

    public double mediumCatch(){
       return sumOfRatings / evaluationTotal;
    }

    @Override
    public int compareTo(Title outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString() {
        return
                "(" + name + "(" + releaseyear + ") Duração: " + durationInMinutes + "min)";

    }
}
