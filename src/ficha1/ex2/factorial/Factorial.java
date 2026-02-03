package ficha1.ex2.factorial;

public class Factorial {

    public long factorial(int n) {

        long fac = 1;

        for (int i = n; i > 0; i--) {
            fac *= i;
        }

        return fac;

    }

}
