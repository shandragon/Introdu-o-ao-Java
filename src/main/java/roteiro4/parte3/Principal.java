package roteiro4.parte3;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno(20061, "João", "Sistema de Informação", 2006);

        aluno01.setMatricula(20062);

        System.out.println("Matricula: " + aluno01.getMatricula());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Curso: " + aluno01.getCurso());
        System.out.println("Ano de Ingresso: " + aluno01.getAnoIngresso());
        System.out.println();

        Aluno aluno02 = new Aluno(20111, "Maria", "Ciência da Computação", 2011);

        System.out.println("Matricula: " + aluno02.getMatricula());
        System.out.println("Nome: " + aluno02.getNome());
        System.out.println("Curso: " + aluno02.getCurso());
        System.out.println("Ano de Ingresso: " + aluno02.getAnoIngresso());
    }
}
