// Atividade 2
import java.util.Scanner;
public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int n[] = new int[15]; 

        
        int maior = Integer.MIN_VALUE; 
        int indiceMaior = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = scanner.nextInt(); 

            if (n[i] > maior) {
                maior = n[i];      
                indiceMaior = i;          
            }
        }

        
        System.out.println("Maior valor: " + maior);
        System.out.println("Índice do maior valor: " + indiceMaior);

      scanner.close();
    }
}
