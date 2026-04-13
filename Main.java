public class Main {
    public static void main(String[] args) {

        Turma turmaC06 = new Turma();
      
        Aluno a1 = new Aluno("Debora", "225", 2);
        a1.notas[0] = 9.5; a1.notas[1] = 9.0;

        Aluno a2 = new Aluno("Ana", "132", 2);
        a2.notas[0] = 8.0; a2.notas[1] = 7.5;

        Aluno a3 = new Aluno("Luan", "804", 2);
        a3.notas[0] = 9.5; a3.notas[1] = 10.0;

        turmaC06.adicionarAluno(a1);
        turmaC06.adicionarAluno(a2);
        turmaC06.adicionarAluno(a3);

    
        turmaC06.listarAlunos();

        Aluno melhor = turmaC06.buscarMelhorAluno();
        if (melhor != null) {
            System.out.println("O melhor aluno é: " + melhor.nome);
            System.out.println("Com média: " + melhor.calculaMedia());
        }
    }
}
