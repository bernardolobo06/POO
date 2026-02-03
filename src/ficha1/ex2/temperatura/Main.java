package ficha1.temperatura;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperatura t = new Temperatura();

        System.out.println("Temperatura em ºC: ");
        double celsius = sc.nextDouble();

        System.out.println("Temperatura em ºF: " + t.celsiusFarenheit(celsius));    

        sc.close();
    }

}
