public class Loops {
    public static void main(String[] args) {
        forLoop();
        whileLoop();
    }

    static void forLoop(){
        for (int i = 0; i < 5; i++){
            System.out.println(i);
        }
    }

    static void whileLoop(){
        int a = 5;
        while (a < 10){
            System.out.println(a);
            a++;
        }
    }
}
