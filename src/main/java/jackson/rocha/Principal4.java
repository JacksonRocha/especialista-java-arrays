package jackson.rocha;

import java.util.ArrayList;

public class Principal4 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

        for (int i = 0; i < alunos.size(); i++) {
            String nome = alunos.get(i);
            System.out.println(nome);
        }

    }
}
