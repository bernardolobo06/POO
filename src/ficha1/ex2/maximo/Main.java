package ficha1.ex2.maximo;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Maximo max = new Maximo();

        System.out.println("Primeiro Operando:");
        int n1 = sc.nextInt();

        System.out.println("Segundo Operando:");
        int n2 = sc.nextInt();

        System.out.println("Máximo: " + max.maximo(n1, n2));

        sc.close();
    }
    
}