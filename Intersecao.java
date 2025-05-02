// Atividade 9
import java.util.Scanner;
public class Intersecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[6];
        int[] B = new int[6];
        int[] C = new int[6]; 
        int k = 0;

        System.out.println("Digite os 6 números do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        System.out.println("Digite os 6 números do vetor B:");
        for (int i = 0; i < B.length; i++) {
            B[i] = scanner.nextInt();
        }

       
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    // Verificar se já está no vetor C p nao dar repetição
                    boolean jaExiste = false;
                    for (int x = 0; x < k; x++) {
                        if (C[x] == A[i]) {
                            jaExiste = true;
                            break;
                        }
                    }
                    if (!jaExiste) {
                        C[k++] = A[i];
                    }
                }
            }
        }

        System.out.print("Elementos em comum: ");
        for (int i = 0; i < k; i++) {
            System.out.print(C[i] + " ");
        }

        scanner.close();
    }
}
