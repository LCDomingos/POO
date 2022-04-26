package uniesp.P2.Aula4;

public class Livro {
    String nomelivro;
    Double valorLivro;
    String dataPublicação;

    public void printEmTela() {
        System.out.println("Nome do livro:"+nomelivro);
        System.out.println("Valor do livro:"+valorLivro);
        System.out.println("Data da publicação:"+dataPublicação);
    }
}
