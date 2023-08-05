import java.util.ArrayList;

public class CursoNxN {
    final String nome;
    final ArrayList<AlunoNxN> alunos = new ArrayList<>();

    public CursoNxN(String nome) {
        this.nome = nome;
    }

    void adicionarAluno(AlunoNxN aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    @Override
    public String toString() {
        return "CursoNxN{" +
                "nome='" + nome + '\'' +
                ", alunos=" + alunos +
                '}';
    }
}
