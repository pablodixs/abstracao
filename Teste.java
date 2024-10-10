import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float av1, av2;

        System.out.println("Insira a nota da AV1 da UCB");
        av1 = sc.nextFloat();

        System.out.println("Insira a nota da AV2 da UCB");
        av2 = sc.nextFloat();

        ProvaUCB provaUCB = new ProvaUCB(av1, av2);

        System.out.println("Insira a nota da AV1 da Fafifo");
        av1 = sc.nextFloat();

        System.out.println("Insira a nota da AV2 da Fafifo");
        av2 = sc.nextFloat();

        ProvaFafifo provaFafifo = new ProvaFafifo(av1, av2);

        System.out.println();
        System.out.println("Resultado UCB");
        if(provaUCB.aprovado()) {
            System.out.println("Aprovado na UCB");
        } else {
            System.out.println("Reprovado na UCB. Média menor que 7");
        }

        System.out.println();
        System.out.println("Resultado UCB");
        if(provaFafifo.aprovado()) {
            System.out.println("Aprovado na Fafifo");
        } else {
            System.out.println("Reprovado na Fafifo. Média menor que 7");
        }
    }
}
