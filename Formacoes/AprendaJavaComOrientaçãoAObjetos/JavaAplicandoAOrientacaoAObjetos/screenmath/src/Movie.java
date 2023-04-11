public class Movie {
    String name;
    int releaseyear;
    boolean includedInThePlan;
    private double sumOfRatings;
    private int evaluationTotal;
    int durationInMinutes;

    int getEvaluationTotal(){
        return evaluationTotal;
    }


    void showedTechnicalSheet(){
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + releaseyear);
    }

    void evaluate(double note){
        sumOfRatings += note;
        evaluationTotal++;
    }

    double mediumCatch(){
       return sumOfRatings / evaluationTotal;
    }


}
