package ficha1.ex2.factorial;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Factorial fac = new Factorial();

        System.out.print("Factorial de: ");
        int n = sc.nextInt();

        System.out.println("Resultado: " + fac.factorial(n));

        sc.close();

    }

}
