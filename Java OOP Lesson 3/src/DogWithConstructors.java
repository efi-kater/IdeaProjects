public class DogWithConstructors {
    private String name;
    private int age;

    public DogWithConstructors(String dogName, int dogAge) {
        name = dogName;
        age = dogAge;
    }

    public DogWithConstructors(String dogName){
        name = dogName;
    }

    public void bark(){
        System.out.println(name + " Says: Whaf");
    }
}
