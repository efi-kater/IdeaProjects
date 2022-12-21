public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myCat = new Cat();  // Create a Cat object
        Animal myHorse = new Horse();  // Create a Horse object
        myAnimal.animalSound();
        myCat.animalSound();
        myHorse.animalSound();
    }
}
