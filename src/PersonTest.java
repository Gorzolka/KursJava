public class PersonTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher("Tom", 29, "university");

        teacher.walk();
        teacher.eat();
        teacher.sayHello();
        teacher.teachMatch();

        Footballer footballer = new Footballer("Mike", 24, "Wisła Kraków");

        footballer.playFootball();
        footballer.walk();
        footballer.eat();
    }
}
