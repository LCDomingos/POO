package br.uniesp.poo.Aula03;

import java.util.Scanner;

public class ExCerveja {

    public static void main(String[] args) {
        int cervejas = 99;
        Scanner leitor = new Scanner(System.in);

        //ENQUANTO
        while (cervejas > 0 ) {
            System.out.println("São " + cervejas + " cervejas na freezer.");
            cervejas  = cervejas - 1;
            System.out.println("Pego uma garrafa, passo pra frente. \n Agora são  " + cervejas + "  na freezer.");
            cervejas  = cervejas - 1;

            if (cervejas == 0) {
                System.out.println("Você deseja colocar mais cerveja?");
                System.out.println("Se sim quantas?");
                cervejas = leitor.nextInt();
                if (cervejas >0){
                    System.out.println("foram incluidas mais " + cervejas + "cervejas");
                }

            }

        }
        System.out.println("acabou a festa");
    }
}
