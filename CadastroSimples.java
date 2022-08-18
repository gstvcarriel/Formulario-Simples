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
                if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                    infoValida = true;
                } else {
                    System.out.println("Gênero inválido. Tente novamente.");
                }
            } while (!infoValida);

            infoValida = false;
            do {
                System.out.print("Digite seu estado civil ('C', 'S', 'D' ou 'V'): ");
                estadoCivil = entrada.next();
                if (estadoCivil.equalsIgnoreCase("c") ||
                        estadoCivil.equalsIgnoreCase("s") ||
                        estadoCivil.equalsIgnoreCase("d") ||
                        estadoCivil.equalsIgnoreCase("v")) {
                    infoValida = true;
                } else {
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

            System.out.println("As seguintes informações foram preenchidas: ");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Gênero: " + sexo);
            System.out.println("Estado Civil: " + estadoCivil);
            System.out.println("Salario: R$ " + salario);

            System.out.println("Deseja continuar? ('S' ou 'N')");
            confirmacao = entrada.next();
            if (confirmacao.equalsIgnoreCase("S")) {
                infoValida = true;
                System.out.println("Cadastro encerrado. Obrigado!");
            }  else {
                i--;
            }
        }
    }
}
