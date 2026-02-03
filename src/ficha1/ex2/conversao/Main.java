package ficha1.ex2.conversao;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conversao c = new Conversao();

        System.out.println("Valor a converter:");
        double valor = sc.nextDouble();

        System.out.println("Taxa de conversão:");
        double taxa = sc.nextDouble();

        System.out.println("Valor: " + c.eurosParaLibras(valor, taxa));

        sc.close();
    }
    
}