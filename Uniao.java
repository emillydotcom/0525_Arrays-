// Atividade 8
import java.util.Scanner;
public class Uniao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        System.out.println("Digite os 5 números do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os 5 números do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            C[i] = A[i];
            C[i + 5] = B[i];
        }

        System.out.print("Vetor união C: ");
        for (int i = 0; i < C.length; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}
