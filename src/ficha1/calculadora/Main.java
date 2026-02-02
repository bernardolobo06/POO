package ficha1.calculadora;

import java.util.Scanner;

public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Calculadora c = new Calculadora();

        System.out.println("Primeiro Operando:");
        double o1 = sc.nextDouble();

        System.out.println("Segundo Operando:");
        double o2 = sc.nextDouble();

        System.out.println("Soma = " + c.soma(o1, o2));
        System.out.println("Subtração = " + c.subtracao(o1, o2));
        System.out.println("Multiplicação = " + c.multiplicar(o1, o2));
        System.out.println("Divisão = " + c.dividir(o1, o2));

        sc.close();
    }
    
}
