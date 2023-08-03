public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstWalue = true;
        boolean secondWalue = false;
        boolean thirdWalue = false;
        boolean fourtWalue = true;
        // && -> true wtedy gdy wyrażenia składowe są równe true
        System.out.println(firstWalue && secondWalue);

        // || gdy jedno wyrażenie jest równe true, spełniony jeden warunek
        System.out.println(firstWalue || secondWalue);
        System.out.println(thirdWalue || fourtWalue);

        // ! negacja - zwraca wartość przeciwną do wyrażenia przed którym się znajduje
        System.out.println(!firstWalue);
        System.out.println(!thirdWalue);
        System.out.println((!firstWalue&&secondWalue));
    }
}
