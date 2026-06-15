package atividades;

import java.util.Scanner;

public class Atividade05 {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = scanner.next();
        System.out.println("Digite a nota 1:");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite a nota 2:");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite a nota 3");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
