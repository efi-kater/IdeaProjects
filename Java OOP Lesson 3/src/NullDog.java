

public class NullDog {
    static Dog d;

    public static void main(String[] args) {
        d.bark(); // will throw NullPointerException
    }
}
