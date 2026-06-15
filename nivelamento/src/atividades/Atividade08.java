package atividades;

import java.util.Scanner;

public class Atividade08 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número:");
        int numero = scanner.nextInt();

        if ((numero > 0) && (numero < 10)){
            System.out.println("Unidade");
        } else if ((numero >= 10) && (numero < 100)) {
            System.out.println("Dezena");
        } else if ((numero >= 100) && (numero <=999)) {
            System.out.println("Centena");
        } else {
            System.out.println("Número inválido!");
        }
    }
}
