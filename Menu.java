import java.util.Scanner;

public class Menu {
    public static void display() {
        System.out.println("Conversor de Moedas");
        System.out.println("Digite as moedas no formato 'FROM TO' (Exemplo: USD BRL)");
        System.out.println("Moedas disponíveis: USD, BRL, EUR, GBP, JPY, CAD, etc.");
    }

    public static String[] getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a conversão: ");
        String input = scanner.nextLine();
        return input.split(" ");
    }

    public static double getAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor a ser convertido: ");
        return scanner.nextDouble();
    }
}
