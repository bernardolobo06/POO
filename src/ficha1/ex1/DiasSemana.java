package ficha1.ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiasSemana {

    public static int diasMes(int i) {

        return switch (i) {
            case 1 -> 31;
            case 2 -> 28;
            case 3 -> 31;
            case 4 -> 30;
            case 5 -> 31;
            case 6 -> 30;
            case 7 -> 31;
            case 8 -> 31;
            case 9 -> 30;
            case 10 -> 31;
            case 11 -> 30;
            case 12 -> 31;
            default -> -1;
        };

    }

    public static int diaSemana(String input) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(input, format);

        int dia = data.getDayOfMonth();
        int mes = data.getMonthValue();
        int ano = data.getYear();
        int total = 0;

        if (ano < 1900 || ano > 2100) return -1;
        
        total += (ano - 1900) * 365;
        total += (ano - 1900) / 4;

        if ((ano - 1900) % 4 == 0 && mes < 3) total--;

        for (int i = 1; i < mes; i++) total += diasMes(i);
        total += dia;

        return total % 7;

    }

    public static void main(String[] args) {

        String input;
        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();

        int result = diaSemana(input);
        switch (result) {
            case 0 -> System.out.println("Domingo");
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            default -> System.out.println("Inválido");
        }

        sc.close();

    }

}
