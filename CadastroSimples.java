import java.util.Scanner;

public class CadastroSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean infoValida = false;
        String nome, estadoCivil;
        int idade;

        do {
            System.out.print("Digite seu nome: ");
            nome = entrada.next();
            if (nome.length() <= 3){
                System.out.println("Nome deve possuir acima de 3 caracteres. Tente novamete.");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Digite sua idade: ");
            idade = entrada.nextInt();
            if (idade < 18 || idade >= 60){
                System.out.println("Idade deve ser entre 18 a 60 anos. Tente novamente.");
            } else {
                infoValida = true;
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Digite seu estado civil ('S', 'C', 'D' ou 'V'): ");
            estadoCivil = entrada.next();
            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("d") ||
                    estadoCivil.equalsIgnoreCase("v")) {
                infoValida = true;
            } else {
                System.out.println("Opção invalida. Tente novamente.");
            }
        } while (!infoValida);
    }
}