public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "O poderoso chefão";
        myMovie.releaseyear = 1970;
        myMovie.durationInMinutes = 180;

        myMovie.showedTechnicalSheet();

        myMovie.evaluate(8);
        myMovie.evaluate(5);
        myMovie.evaluate(10);

        System.out.println("Total de avaliações: " + myMovie.getEvaluationTotal());
        System.out.println(myMovie.mediumCatch());
    }
}
