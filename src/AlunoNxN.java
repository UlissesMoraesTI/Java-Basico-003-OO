import java.util.ArrayList;

public class AlunoNxN {
    final String nome;
    final ArrayList<CursoNxN> cursos = new ArrayList<>();

    public AlunoNxN(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(CursoNxN curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    @Override
    public String toString() {
        return "AlunoNxN{" +
                "nome='" + nome + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
