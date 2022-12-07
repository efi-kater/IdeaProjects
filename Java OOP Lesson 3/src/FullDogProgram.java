public class FullDogProgram {
    public static void main(String[] args) {
        // Create a package1.Dog with a name and age
        FullDog fullDog = new FullDog("Lassi", 10);
        // Print object name and age
        System.out.println(fullDog.getName());
        System.out.println(fullDog.getAge());

        // Modify object name and age using setters
        fullDog.setName("Lassi2");
        fullDog.setAge(4);

        // Print object name and age again to see the changes
        System.out.println(fullDog.getName());
        System.out.println(fullDog.getAge());
    }
}
