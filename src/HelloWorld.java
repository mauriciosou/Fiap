import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //Entrada - Saída - Processamento
        Scanner leitor = new Scanner(System.in);
        //Saída
        System.out.println("Hello World");


        /*Variavel de memoria - > Espaço na memoria Ram para armazenar
        uma informação*/
        //tipo_dado nomeVariavel;
        int idade; // variável que vai armazenar um número inteiro e chama idade
        String nome, nomeDoAluno, nomeMae;
        double altura; //numeros reais
        char letra; //armarzena 1 caractere


        System.out.println("Digite seu nome: ");
        nome = leitor.nextLine(); //leitura de uma String no terminal
        System.out.println("Boa noite ! " +nome + "! Bem vindo(a) ao Shift Java");
        System.out.println("Digite a sua idade");
        idade = leitor.nextInt();
        System.out.println(nome +" voce tem " +idade+ " anos de idade");



    }


}
