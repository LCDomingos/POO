//Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10 (incluindo estes dois valores)
// e peça ao usuário para adivinhá-lo. Use um laço while para registrar as tentativas feitas e, a cada tentativa,
// dê dicas informando se o número gerado é maior ou menor que a tentativa feita. Finalmente mostre a quantidade de
// tentativas feitas até que o número fosse acertado.




package uniesp.P2.DesafioDoWhile;

import java.util.Scanner;
import java.util.Random;

public class DesafioWhile {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int numRandom = random.nextInt(10);
        /*System.out.println(numeroAleatorio);*/

        int numEntrada;
        int tentativas = 1;

        System.out.println("Informe um número de 0 a 10: ");

        numEntrada = scan.nextInt();

        while (numEntrada != numRandom) {
            if (numEntrada >  numRandom) {
                System.out.println("Errou. Tente um número menor.");
                numEntrada = scan.nextInt();
                tentativas++;
            }
            else if (numEntrada < numRandom) {
                System.out.println("Errou. Tente um número maior.");
                numEntrada = scan.nextInt();
                tentativas++;
            }
        }
        if (numEntrada ==  numRandom) {
            System.out.println("Parabéns, você acertou em " + tentativas + " tentativas!");
        }
    }
}