// umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.F;

        int addition = firstNumber  + secondNumber; // 10
        int substraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber / secondNumber; // 0.66
        int mod = secondNumber%firstNumber; // modulo % to reszta z dzielenia

        System.out.println("Wynik dodawania: " + addition);
        System.out.println("Wynik odejmowania" + substraction);
        System.out.println("Wynik mnozenia" + multiplication) ;
        System.out.println("Wynik dzielenia " + division);
        System.out.println("Modulo " + mod);

        firstNumber+=secondNumber;
        System.out.println("Po dodaniu " + firstNumber);
        firstNumber-=secondNumber;
        System.out.println("Po oejmowaniu " + firstNumber);
        firstNumber*=secondNumber;
        System.out.println("Po mnożeniu " +firstNumber);
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu " + firstNumber);
        firstNumber%=secondNumber;
        System.out.println("Po modulo " + firstNumber);
    }

}
