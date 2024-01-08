import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lendo o nome:
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Lendo a idade:
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Nome: " + nome + ", Idade: " + idade);
        System.out.println("Até a próxima!");

        scanner.close();

    }
}