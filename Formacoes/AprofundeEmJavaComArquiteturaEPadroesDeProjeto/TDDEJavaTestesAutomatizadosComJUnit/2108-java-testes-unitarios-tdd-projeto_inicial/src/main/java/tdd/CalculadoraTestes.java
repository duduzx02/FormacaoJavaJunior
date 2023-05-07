package tdd;

public class CalculadoraTestes {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3,7);
        System.out.println(soma);

        int soma1 = calc.somar(1,0);
        System.out.println(soma1);

        int somaa = calc.somar(0,0);
        System.out.println(somaa);

        int soma4 = calc.somar(-1,7);
        System.out.println(soma4);

    }
}
