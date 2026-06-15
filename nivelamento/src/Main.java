//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Integer idade = 50;
    Integer maiorIdade = 18;
    Double salario = 50.0;
    String nome = "João";
    Boolean temCNH = true;

    if (idade > maiorIdade) {
        System.out.println("Maior de Idade");
        if (temCNH == true) {
            System.out.println("possui habilitação");
        } else {
            System.out.println("Não possui habilitação");
        }
    } else if (idade.equals(maiorIdade)) {
        System.out.println("Maior de Idade");
    } else {
        IO.print("Menor de idade");
        System.out.println("não pode usar celular");
    }


}
