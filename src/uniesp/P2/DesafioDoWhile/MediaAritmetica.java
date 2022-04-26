package uniesp.P2.DesafioDoWhile;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double media1, media2;

        System.out.println("Digite a primeira média:");
        media1 = scanner.nextDouble();
        System.out.println("Digite a segunda média:");
        media2 = scanner.nextDouble();

        double mediaFinal = (media1 + media2) / 2;
        double recuperacao = (10-(mediaFinal+2));
        double provaFinal = (10-mediaFinal);

        if (mediaFinal <= 4.9) {
            System.out.println("O Aluno está em recuperação!!");
            System.out.printf("O Aluno precisará obter '%.1f' na recuperação.",recuperacao);//%2f quer dizer que vai ser mostrado apenas 2 casas decimais, poderia ser 3 com 3f,4 com 4f...
        }
        if (mediaFinal >=5.0 && mediaFinal <=6.9){
            System.out.println("O aluno está na prova final!!");
            System.out.printf("O Aluno precisará obter '%s' na prova final.",provaFinal);
        }
        if (mediaFinal >=7.0){
            System.out.println("O aluno está aprovado!!");
        }
    }
}
