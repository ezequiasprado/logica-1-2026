package atividades;

import java.util.Scanner;

public class Atividade09 {
    void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número");
        int numero2 = scanner.nextInt();

        if (numero1 != numero2) {
            if (numero1 > numero2){
                System.out.println("Soma: " +(numero1 + numero2));
            } else {
                System.out.println("Mult: " + (numero1 * numero2));
            }
        } else {
            System.out.println("Não é permitido números iguais");
        }
    }
}
