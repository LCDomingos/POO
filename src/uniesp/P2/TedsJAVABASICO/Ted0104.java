//Desenvolva um algoritmo capaz de encontrar o menor dentre 3 números inteiros quaisquer dados pelo teclado.
//        Crie uma classe Calculadora que dentro dela, tenha um método que recebe 3 número e faça o que foi pedido.


        package uniesp.P2.TedsJAVABASICO;

import java.util.Scanner;
public class Ted0104 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite seu primeiro numero: ");
        int num1 = scn.nextInt();
        System.out.println("Digite seu segundo numero: ");
        int num2 = scn.nextInt();
        System.out.println("Digite seu terceiro numero: ");
        int num3 = scn.nextInt();

        if(num1 < num2 && num1 < num3) {
            System.out.println("O menor numero é: "+num1);
        }else
        if(num2 < num1 && num2 < num3){
            System.out.println("O menor numero é:"+num2);
        }else{
            System.out.println("o menor numero e:"+num3);
        }

    }
}