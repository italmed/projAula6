// exemplo de vetor

package exemplos;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double media, soma = 0;
        int qntdAcima = 0;

        double vetor[] = new double[4];
        for (int i=0; i<vetor.length; i++){
                System.out.printf("Digite a %dª nota: ", i+1);
                vetor[i] = in.nextDouble();
                soma += vetor[i];
        }
        media = soma / vetor.length;

        for (int i=0; i<vetor.length; i++){
            System.out.printf("A %dª nota digitada foi: %.1f\n", i+1, vetor[i]);
            if (vetor[i] > media){
                qntdAcima++;
            }
    }
        System.out.printf("\nA média da turma é %.2f\nTotal de %d notas acima da média.", media, qntdAcima);
        in.close();
    }
}