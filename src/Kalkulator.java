import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj proszę pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        int resoult = firstNumber * firstNumber;
        System.out.println("Kwadrat tej liczby to " + resoult);
        System.out.println("Podaj proszę drugą liczbę");
        int secondNumber = scanner.nextInt();
        int addition = firstNumber  + secondNumber;
        int substraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
       int division = firstNumber / secondNumber;
        int mod = secondNumber%firstNumber;
        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania" + substraction);
        System.out.println("Wynik mnozenia" + multiplication) ;
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Modulo " + mod);

    }
}
