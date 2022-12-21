package Lesson4Homework;


public class MainHomeWork {
    public static void main(String[] args) {
        Human a = new Human(32, "Efi");
        System.out.println(a.runSpeed(a.getAge()));
        a.getType();
        a.printDetails();

        Ball b = new Ball();
        System.out.println(b.isRound);



    }
}
