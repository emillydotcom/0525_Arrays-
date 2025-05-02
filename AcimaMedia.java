// Atividade 5
import java.util.Scanner;
public class AcimaMedia {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n[] = new int [12];
        int soma = 0;

        for (int i =0; i < n.length; i++) {
            System.out.print("Digite o número " + ( i + 1) + ":");
            n[i] = scanner.nextInt();
            soma += n[i];
        }
        double media = (double) soma / n.length;
        int acimaDaMedia = 0;

        for (int i = 0; i < n.length; i++) {
            if (n[i] > media) {
                acimaDaMedia++;
            }
    }
    System.out.println("Média: " + media);
        System.out.println("Quantidade de números acima da média: " + acimaDaMedia);
        
    scanner.close();
}
 }
