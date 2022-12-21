package Lesson4Homework;

public class Human extends AbsMammals implements Run{
    private int age;
    private String name;

    public Human (int age, String name){
        this.age=age;
        this.name = name;
    };
    @Override
    public int runSpeed(int speed) {
        return speed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    void getType() {
        System.out.println("this is a Human");
    }

    @Override
    void printDetails() {
        String line = System.lineSeparator();
        System.out.println("This Human name is: " +this.name + line +"This Human age is: " + this.age);
    }
}
