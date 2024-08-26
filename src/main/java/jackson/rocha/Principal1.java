package jackson.rocha;

import java.util.Arrays;

public class Principal1 {
    public static void main(String[] args) {
        int[] numerosJogos1 = {25, 11, 8, 46, 37, 14};
        int[] numerosJogos2 = Arrays.copyOf(numerosJogos1, numerosJogos1.length + 1);
        numerosJogos2[numerosJogos2.length - 1] = 44;

        System.out.println(Arrays.toString(numerosJogos1));
        System.out.println(Arrays.toString(numerosJogos2));
    }
}
