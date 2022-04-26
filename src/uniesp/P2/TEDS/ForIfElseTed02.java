//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//        a maior e a menor altura do grupo;
//        média de altura do sexo igual a masculino;
//        o número de registros de sexo igual a feminino.


package uniesp.P2.TEDS;

import java.util.Scanner;

public class ForIfElseTed02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PessoaTed02[] pessoas = new PessoaTed02[10];
        Double maior = 0.0;
        Double menor = 0.0;
        Double media;
        int numHomem = 0;
        int numMulher = 0;
        Double total = 0.0;
        int numBin = 0;

        for (int i = 0; i < 10; i++) {

            PessoaTed02 pessoa = new PessoaTed02();
            System.out.println("Informe a altura da pessoa " +(i+1)+ ": ");
            pessoa.setAltura(scan.nextDouble());
            System.out.println("Informe o sexo da pessoa (m ou f) " +(i+1)+ ": ");
            pessoa.setSexo(scan.next().charAt(0));
            pessoas[i] = pessoa;


            if (menor == 0 && i == 0){
                menor = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() < menor) {
                menor = pessoas[i].getAltura();
            }
            if (maior == 0){
                maior = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() > maior) {
                maior = pessoas[i].getAltura();
            }
            if (pessoas[i].getSexo() == 'm' || pessoas[i].getSexo() == 'M' ){
                total += pessoas[i].getAltura();
                numHomem++;
            }
            else if (pessoas[i].getSexo() == 'f' || pessoas[i].getSexo() == 'F' ){
                numMulher++;
            }
            else{
                System.out.println("Ser não binario");
                numBin++;
            }

        }
        media = (total/numHomem);


        System.out.println("o sexo da primeira pessoa é: " +pessoas[0].getSexo());
        System.out.println("A altura da primeira pessoa é: " +pessoas[0].getAltura());
        System.out.println("A maior altura do grupo é: " +maior);
        System.out.println("A menor altura do grupo é: " +menor);
        System.out.println("A media da altura dos homens é: " +media);
        System.out.println("O total de mulheres é: " +numMulher);
        System.out.println("Existe(m) " +numBin+ "não binario(s)!");
    }


}
