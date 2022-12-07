public class ConstructedDogsProgram {
    public static void main(String[] args) {
        DogWithConstructors dog = new DogWithConstructors("Rexi", 5);
        dog.bark();

        DogWithConstructors dog2 = new DogWithConstructors("Lassi");
        dog2.bark();
    }
}
