package uniesp.P2.HerancaEscola;

import java.util.Date;

public class EscolaMain {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", "798.798.798-79", new Date());
        System.out.println(aluno.nome);
        System.out.println(aluno.cpf);
        System.out.println(aluno.data_nascimento.toString());
        System.out.println("_______________________________");

        System.out.println(aluno.tiraCopia(3));
        Professor professor = new Professor("Thiago", "123.132.123-78", new Date());
        System.out.println("Valor copias prof" + professor.tiraCopia(3));
    }
}