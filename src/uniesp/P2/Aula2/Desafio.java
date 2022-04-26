package uniesp.P2.Aula2;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva aqui sue nome completo: ");
        String nome = scanner.nextLine();
        System.out.println("Escreva aqui o nome do seu curso: ");
        String curso = scanner.nextLine();
        System.out.println("Escreva em que periodo você está: ");
        int periodo = scanner.nextInt();
        System.out.println("Escreva sua primeira nota: ");
        float primeiraNota = scanner.nextFloat();
        System.out.println("Escreva sua segunda nota: ");
        float segundaNota = scanner.nextFloat();
        System.out.println("Escreva quantas faltas você teve: ");
        int falta = scanner.nextInt();

        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu curso: " + curso);
        System.out.println("Seu periodo: " + periodo);
        System.out.println("Sua primeira nota: " + primeiraNota);
        System.out.println("Sua segunda nota: " + segundaNota);
        System.out.println("Numero de faltas: " + falta);
        float media = (primeiraNota+segundaNota)/2;

        System.out.println("Sua media foi: " + media);

    }
}