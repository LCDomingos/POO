//Escreva um programa Java que usa o laço do...while para ler números inteiros até que o valor lido seja igual a 0.
//Em seguida mostre a quantidade de valores positivos e negativos, a soma dos valores e a média aritmética
//(sem incluir o valor 0 na contagem e no cálculo da média). A média deverá ser exibida como um valor de ponto flutuante.




        package uniesp.P2.DesafioDoWhile;
import java.util.Scanner;
public class DesafioDoWhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, lido = 0, soma = 0,positivo = 0, negativo = 0;

        do {

            System.out.print("Informe um número inteiro (0 para sair): ");
            num = Integer.parseInt(entrada.nextLine());

            if(num > 0){
                positivo++;
            }
            else if(num < 0){
                negativo++;
            }

            soma += num;

            if(num != 0){
                lido++;
            }
        }
        while(num != 0);

        if(lido == 0){
            System.out.println("Você não informou nenhum número.");
        }
        else{
            System.out.println("Quantidade de números positivos: " + positivo);
            System.out.println("Quantidade de números negativos: " + negativo);
            System.out.println("A soma dos números lidos é: " + soma);
            System.out.println("A média aritmética é: " + ((soma * 1.0) / lido));
        }
    }
}