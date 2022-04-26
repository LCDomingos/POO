package uniesp.P2.Aula4;

public class Principal {
    public static void main(String[] args){
        Livro l = new Livro();
        l.nomelivro = "Use a cabeça! Java";
        l.valorLivro = 100.50;
        l.dataPublicação = "10/03/2000";

        l.printEmTela();
    }

}
