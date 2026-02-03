package ficha1.ex2.inteiros;

public class Inteiros {

    public void ordenaInteiros(int a, int b) {

        if (a > b) System.out.println(String.format("%d, %d, %f", a, b, ((a+b)/2.0)));
        else System.out.println(String.format("%d, %d, %f", b, a, ((a+b)/2.0)));

    }

}
