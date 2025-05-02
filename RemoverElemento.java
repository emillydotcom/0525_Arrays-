// Atividade 6
import java.util.Scanner;
public class RemoverElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[10];
        int[] novoVetor = new int[9];
        boolean removido = false;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }

        System.out.print("Digite o número a ser removido: ");
        int numeroParaRemover = scanner.nextInt();
        int j = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == numeroParaRemover && !removido) {
                removido = true; // Pular a primeira ocorrência
                continue;
            }
            if (j < novoVetor.length) {
                novoVetor[j++] = n[i];
            }
        }

        System.out.print("Vetor após remoção: ");
        for (int i = 0; i < novoVetor.length; i++) {
            System.out.print(novoVetor[i] + " ");
        }

        scanner.close();
    }
}
