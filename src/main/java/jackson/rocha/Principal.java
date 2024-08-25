package jackson.rocha;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        Integer[] notas = {8, 5, 6, 9, 10};

        Arrays.sort(notas);
        Arrays.sort(notas, Comparator.reverseOrder());

        System.out.println(Arrays.toString(notas));
    }
}
