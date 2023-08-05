public class CursoTesteNxN {
    public static void main(String[] args) {
        AlunoNxN aluno1 = new AlunoNxN("Jao");
        AlunoNxN aluno2 = new AlunoNxN("Maria");
        AlunoNxN aluno3 = new AlunoNxN("Pedro");

        CursoNxN curso1 = new CursoNxN("Java Completo");
        CursoNxN curso2 = new CursoNxN("Designer Patters");
        CursoNxN curso3 = new CursoNxN("Git");
        CursoNxN curso4 = new CursoNxN("AWS");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for ( AlunoNxN aluno : curso1.alunos ) {
            System.out.println(aluno.nome);
            System.out.println(curso1.nome);
        }
    }
}
