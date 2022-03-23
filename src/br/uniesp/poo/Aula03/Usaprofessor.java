package br.uniesp.poo.Aula03;

public class Usaprofessor {

    public static void main(String[] args) {
        Professor fujioka = new Professor();
        fujioka.disciplina = "Linguagem de Programação";
        fujioka.nome = "Rodrigo da Cruz Fujioka";
        fujioka.ensinar();

        Professor marcelo = new Professor();
        marcelo.disciplina = "Coordenador";
        marcelo.nome = "Marcelo bla bla bla";
        marcelo.ensinar();

    }
}
