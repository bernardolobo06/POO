package ficha1.helloWorld;

import java.util.Scanner;

public class Main {

    /**
     * desc
     * @param
     * @return 
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        HelloWorld hello = new HelloWorld();

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println(hello.greet(nome));

        sc.close();

    }

}
