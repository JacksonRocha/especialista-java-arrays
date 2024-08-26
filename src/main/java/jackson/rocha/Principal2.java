package jackson.rocha;

public class Principal2 {
    public static void main(String[] args) {
        Turma turmaB = new Turma();
        turmaB.identificacao = "Maternal B";
        turmaB.nomeProfessora = "Tia Maria";
        turmaB.alunos = new Aluno[3];

        turmaB.alunos[0] = new Aluno();
        turmaB.alunos[0].nome = "João";
        turmaB.alunos[0].idade = 3;

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Laura";
        aluno1.idade = 4;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria";
        aluno2.idade = 6;

        turmaB.adicionarAluno(aluno1);
        turmaB.adicionarAluno(aluno2);

        turmaB.imprimirListaDeAlunos();
    }
}
