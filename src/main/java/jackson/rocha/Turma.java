package jackson.rocha;

import java.util.ArrayList;
import java.util.Arrays;

public class Turma {

    String identificacao;
    String nomeProfessora;
    Aluno[] alunos = new Aluno[0];
    ArrayList<Aluno> alunos2 = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        this.alunos = Arrays.copyOf(this.alunos, this.alunos.length + 1);
        alunos[this.alunos.length - 1] = aluno;
    }

    void adicionarAluno2(Aluno alunos) {
        alunos2.add(alunos);
    }

    void removerAluno(Aluno aluno) {
        alunos2.remove(aluno);
    }

    void imprimirListaDeAluno() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.printf("vago");
            }
        }
    }

}
