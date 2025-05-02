import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n[] = new int [20];
        int pares = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
            if (n[i] % 2 == 0 ) {
                pares++;
            }
        }

    System.out.println("A quantidade de números pares é: " + pares);

    scanner.close();

    }
}
