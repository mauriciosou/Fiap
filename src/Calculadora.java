import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        // Entrada - Usuário vai Digitar dois valores
        // Processamento - Calcular as 4 operações ( + - */)
        // Saída - exibir as 4 oprações

        double a, b;
        System.out.println("Digite o primeiro valor:");
        a = leitor.nextInt();

        System.out.println("Digite o segundo valor:");
        b = leitor.nextInt();

        double soma = a+b;
        double sub = a-b;
        double div = a/b;
        double mult = a*b;

        System.out.println("Resultado da Soma: "  + soma);
        System.out.println("Resultado da Subtração: "  + sub);
        System.out.println("Resultado da Divisão: "  + div);
        System.out.println("Resultado da Multiplicação: "  + mult);

        double media = (a + b) / 2;
        System.out.println("Média: " + media);

    }



}
