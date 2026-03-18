import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CONVERSOR DE MEDIDAS ===");
            System.out.println("1 - Converter metros");
            System.out.println("2 - Sair");
            System.out.print("Escolha a opção: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a distância em metros: ");
                double metros = sc.nextDouble();

                double km = metros / 1000;
                double hm = metros / 100;
                double dam = metros / 10;
                double dm = metros * 10;
                double cm = metros * 100;
                double mm = metros * 1000;

                System.out.printf("A distância de %.2f m corresponde a:%n", metros);
                System.out.printf("%.5f km%n", km);
                System.out.printf("%.4f hm%n", hm);
                System.out.printf("%.3f dam%n", dam);
                System.out.printf("%.1f dm%n", dm);
                System.out.printf("%.1f cm%n", cm);
                System.out.printf("%.1f mm%n", mm);

            } else if (opcao != 2) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 2);

        System.out.println("Programa encerrado.");
        sc.close();
    }
}