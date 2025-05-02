// Atividade 7
import java.util.Scanner;
public class Ocorrencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[15];
        int contador = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }

        System.out.print("Digite o número que deseja contar: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < n.length; i++) {
            if (n[i] == numero) {
                contador++;
            }
        }

        System.out.println("O número " + numero + " apareceu " + contador + " vez(es).");

        
        scanner.close();
    }
}
