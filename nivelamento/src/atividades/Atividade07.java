package atividades;

import java.util.Scanner;

public class Atividade07 {
    void main (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Idade");
        int idade = scanner.nextInt();

        if ((idade >= 6) && (idade <= 10)) {
            System.out.println("infantil");
        } else if ((idade >= 11) && (idade <= 17)) {
            System.out.println("Juvenil");
        } else if (idade >= 18) {
            System.out.println("Adulto");
        }
    }
}
