// Atividade 1
public class inteiros10 {
    public static void main(String[] args) throws Exception {
    int [ ] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int soma = 0;
    for (int i = 0; i < numeros.length; i++) 
// Cria uma variável 'i', e enquanto i for menor que numeros.length, aumenta i de 1 em 1
    { 
        soma += numeros[i];
 // pega o que esta na posição i e soma com o que está na var soma
    } 
    System.out.println("A soma dos números é:" + soma);
}
}
