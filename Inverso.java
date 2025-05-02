// Atividade 4
import java.util.Scanner;
public class Inverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[8];

        // Lê os 8 números do usuário
        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }

        // Mostra os números na ordem inversa
        System.out.println("Vetor invertido:");
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }

        scanner.close();
    }
}
