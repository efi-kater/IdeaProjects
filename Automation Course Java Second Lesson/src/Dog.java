import java.security.spec.ECField;

public class Dog {
    int age;
    String name;
    Boolean isHappy;

    public static void main(String[] args) {
        Dog Pincher = new Dog();
        Pincher.age=35;
        Pincher.isHappy=true;
        Pincher.name="Efi";
        System.out.println("Yor Dog's name is: "+ Pincher.name);
        System.out.println("Yor Dog's age is: "+ Pincher.age);
        System.out.println("Yor Dog's happiness is: "+ Pincher.isHappy);
    }
}

