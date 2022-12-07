public class Methods {
    public static void main(String[] args) {
        run1();
        String s = run2();
        run3("anything");
        String s2 = run4("any word");
    }

    static void run1 (){
        System.out.println("hello");
    }

    static String run2 (){
        return "hello";
    }

    static void run3 (String word){
        System.out.println(word);
    }

    static String run4(String word) {
        return "your word is " + word;
    }
}
