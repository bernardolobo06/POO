package ficha1.saldo;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Saldo desc = new Saldo();

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Saldo (€): ");
        double saldo = sc.nextDouble();

        desc.criaDescricaoConta(nome, saldo);

        sc.close();

    }

}
