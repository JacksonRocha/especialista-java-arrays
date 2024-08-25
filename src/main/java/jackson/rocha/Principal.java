package jackson.rocha;

public class Principal {
    public static void main(String[] args) {
        int[] notas = {8, 5, 6, 9, 10};

        double media = Calculadora.calcularMedia(notas);

        System.out.println(media);

    }
}
