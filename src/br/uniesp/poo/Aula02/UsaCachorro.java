package br.uniesp.poo.Aula02;

public class UsaCachorro {

    public static void main(String[] args) {
        Cachorro viralata = new Cachorro();
        //O PONTO (.) ELE VAI CHAMAR A AÇÃO DA CLASSE FEITA NO OUTRO ARQUIVO
        viralata.late();
        viralata.exibeNome();
    }

}
