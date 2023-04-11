package PessoaAnivesariante;

public class Main {
    public static void main(String[] args) {
        Person eduardo = new Person();

        eduardo.name = "Eduardo";
        eduardo.year = 26;

        System.out.println("Idade antes do aniversário: " + eduardo.year);
        eduardo.makesBirthday();
        System.out.println("Idade depois do aniversário: " + eduardo.year);
    }
}
