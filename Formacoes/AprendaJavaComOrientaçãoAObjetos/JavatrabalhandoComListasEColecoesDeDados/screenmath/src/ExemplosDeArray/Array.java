package ExemplosDeArray;

import br.com.alura.screenmatch.modelos.Movie;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numeroInteiros = new int[5];
        numeroInteiros[0] = 5;
        numeroInteiros[1] = 4;
        numeroInteiros[2] = 3;
        numeroInteiros[3] = 2;
        numeroInteiros[4] = 1;

/*        for (int i = 0; i <= numeroInteiros.length - 1 ; i++) {
            System.out.println(numeroInteiros[i] = i + 1);
        }*/

        for (int i = 0; i <= numeroInteiros.length - 1 ; i++) {
            System.out.println(numeroInteiros[i]);
        }

    }




}
