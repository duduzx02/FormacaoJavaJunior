package br.com.alura.screenmatch.modelos;

public class Movie {
    String name;
    int releaseyear;
    boolean includedInThePlan;
    private double sumOfRatings;
    private int evaluationTotal;
    int durationInMinutes;

    public int getEvaluationTotal(){
        return evaluationTotal;
    }


    public void showedTechnicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseyear);
    }

    public void evaluate(double note){
        sumOfRatings += note;
        evaluationTotal++;
    }

    public double mediumCatch(){
       return sumOfRatings / evaluationTotal;
    }


}
