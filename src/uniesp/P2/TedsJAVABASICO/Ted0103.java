//Em uma loja de CD 's existem apenas quatro tipos de preços que estão associados a cores.
// Assim os CD´s que ficam na loja não são marcados por preços e sim por cores.
// Desenvolva um algoritmo que a partir da entrada da cor o software mostra o preço.
// A loja está atualmente com a seguinte tabela de preços.



package uniesp.P2.TedsJAVABASICO;

import java.util.Scanner;

public class Ted0103 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do cd: ");
        String cor = scanner.nextLine();


        if (cor.equals("Verde") || cor.equals("verde") ){
            System.out.println("Este disco custa 10,00 reais");
        }else
        if (cor.equals ("Azul") || cor.equals("azul")){
            System.out.println("Este disco custa 20,00 reais");
        }else
        if (cor.equals("Amarelo") || cor.equals("amarelo")) {
            System.out.println("Este disco custa 30,00 reais");
        }else
        if (cor.equals("Vermelho") || cor.equals("vermelho") ) {
            System.out.println("Este disco custa 40,00 reais");
        }else{
            System.out.println("Naõ temos este em estoque!");
        }

    }
}