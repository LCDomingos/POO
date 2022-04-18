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