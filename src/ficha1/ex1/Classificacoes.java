package ficha1.ex1;

import java.util.Scanner;

public class Classificacoes {

    public static int type(int val) {

        if (val >= 0 && val < 5) return 1;
        else if (val >= 5 && val < 10) return 2;
        else if (val >= 10 && val < 15) return 3;
        else if (val >= 15 && val <= 20) return 4;
        else return 0;

    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, c = 0, d = 0;
        int n, val;
        
        System.out.print("Número de classificações: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print(String.format("Valor %d: ", i));
            val = sc.nextInt();

            switch (type(val)) {
                case 1 -> a++;
                case 2 -> b++;
                case 3 -> c++;
                case 4 -> d++;
            }

        }

        System.out.println(String.format("[0, 5[: %d   |   [5, 10[: %d   |   [10, 15[: %d   |   [15, 20]: %d", a, b, c, d));

        sc.close();

    }

}
