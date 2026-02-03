package ficha1.ex2.inteiros;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Inteiros i = new Inteiros();

        System.out.println("Insira o primeiro valor: ");
        int a = sc.nextInt();

        System.out.println("Insira o primeiro valor: ");
        int b = sc.nextInt();

        i.ordenaInteiros(a, b);

        sc.close();

    }

}
