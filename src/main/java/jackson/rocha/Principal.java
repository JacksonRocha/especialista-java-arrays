package jackson.rocha;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] notas = {8, 5, 6, 9, 10};

        String notasEmString = Arrays.toString(notas);

        System.out.println(notasEmString);
    }
}
