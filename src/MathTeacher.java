public class MathTeacher extends Person {
    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze Mathteacher");
        this.school = school;
    }

    public void teachMatch() {
        System.out.println("I'm teaching math");
    }
    public void sayHello() {
        System.out.println("Hallo my name is " + name);
        System.out.println("I'm " + age);
    }
}
