import java.util.Scanner;

public class CadastroSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil, confirmacao;
        int idade;
        double salario;

        for (int i = 0; i < 1; i++) {
            do {
                System.out.print("Digite seu nome: ");
                nome = entrada.next();
                if (nome.length() >= 3) {
                    infoValida = true;
                } else {
                    System.out.println("Nome precisa ter acima de 3 letras. Tente novamente.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.print("Digite sua idade: ");
                idade = entrada.nextInt();
                if (idade > 0 && idade <= 150) {
                    infoValida = true;
                } else {
                    System.out.println("Idade precisa ser entre 1 e 150. Tente novamente");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.print("Digite seu gênero ('M' ou 'F'): ");
                sexo = entrada.next();
                if (sexo.equalsIgnoreCase("f")) {
                    sexo = ("Feminino");
                    infoValida = true;
                } else if (sexo.equalsIgnoreCase("m" )) {
                    sexo = ("Masculino");
                    infoValida = true;
                } else {
                    System.out.println("Gênero inválido. Tente novamente.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.print("Digite seu estado civil ('C', 'S', 'D' ou 'V'): ");
                estadoCivil = entrada.next();
                if    ( estadoCivil.equalsIgnoreCase("c")) {
                    estadoCivil = ("Casado");
                    infoValida = true;
                }
                else if (estadoCivil.equalsIgnoreCase("s")) {
                    estadoCivil = ("Solteiro");
                    infoValida = true;
                }
                else if (estadoCivil.equalsIgnoreCase("d")) {
                    estadoCivil = ("Divorciado");
                    infoValida = true;
                }
               else if (estadoCivil.equalsIgnoreCase("v")) {
                estadoCivil = ("Viuvo (a)");
                infoValida = true;
                }
               else {
                    System.out.println("Estado Civil invalido. Tente novamente.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.print("Digite seu salário atual: ");
                salario = entrada.nextDouble();
                if (salario > 0) {
                    infoValida = true;
                } else {
                    System.out.println("Salário invalido. Tente novamente.");
                }
            } while (!infoValida);

            infoValida = false;
            System.out.println("As seguintes informações foram preenchidas: ");
            System.out.println("============================");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + (" anos"));
            System.out.println("Gênero: " + sexo);
            System.out.println("Estado Civil: " + estadoCivil);
            System.out.println("Salario: R$ " + salario);
            System.out.println("============================");
            System.out.println("Deseja continuar? ('S' ou 'N')");
            confirmacao = entrada.next();
            if (confirmacao.equalsIgnoreCase("S")) {
                infoValida = true;
                System.out.println("Cadastro encerrado. Obrigado!");
            }  else if (confirmacao.equalsIgnoreCase("N")) {
                i--;
                System.out.println("Cadastro reiniciado. Preencha as informações novamente!!");
            } else {
                System.out.println("Opção invalida, digite 'S' para SIM ou 'N' para NÃO.");
            }
        }
    }
}
