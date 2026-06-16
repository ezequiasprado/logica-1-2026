package atividades;

import java.util.Scanner;

public class Atividade11 {
    void main() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe a quantidade:");
        int quantidade = scanner.nextInt();

        double valor = 0.0;
        if ((quantidade >= 1) && (quantidade <=10)) {
            valor = quantidade * 0.10;
        } else if ((quantidade >= 11) && (quantidade <= 50)){
            valor = quantidade * 0.08;
        } else if (quantidade > 50) {
            valor = quantidade * 0.05;
        }
        System.out.println("O valor é: " + valor);
    }
}
