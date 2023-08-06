import java.util.Scanner;

public class ZadanieIFElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Podaj swój wiek");
        int age = scanner.nextInt();
        if(age >= 18) {
            System.out.println("Dziękuję za zakupy! Zapraszam ponownie!");
        }else if (age <0 ) {
                System.out.println("Podaj poprawną wartość");
        } else {
            System.out.println("Nie możesz kupić alkoholu");

        }
    }
}
