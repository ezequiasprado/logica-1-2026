package atividades;

import java.util.Scanner;

public class Atividade10 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a Idade");
        int idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Não poderá votar");
        } else if ((idade <= 17) || (idade > 60)) {
            System.out.println("Voto opcional");
        } else {
            System.out.println("Voto obrigatório");
        }
    }
}
