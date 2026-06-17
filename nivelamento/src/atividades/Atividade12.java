package atividades;

import java.util.Scanner;

public class Atividade12 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número 1");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o número 2");
        int numero2 = scanner.nextInt();
        System.out.println("Digite o número 3");
        int numero3 = scanner.nextInt();

        int maior = 0;
        boolean exibirMaior = true;

        if ((numero1 > numero2) && (numero1 > numero3)){
           maior = numero1;
        } else if ((numero2 > numero3) && (numero2 > numero1)) {
            maior = numero2;
        } else if ((numero3 > numero1) && (numero3 > numero2)) {
            maior = numero3;
        } else {
            exibirMaior = false;
            System.out.println("Números iguais");
        }

        if (exibirMaior) {
            System.out.println("maior é: " + maior);
        }

    }
}
