import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lesson5Main {
    public static void main(String[] args) {
        int a =0;
        while (a==0){
            try {
                init();
                System.out.println("akol tov");
            } catch (Exception e) {
                e.printStackTrace();
                a=1;

            }
        }
        System.out.println("goodbye");
        ArrayList<Double> doubleArray = new ArrayList<>();
        try {
            for (int i=1; i<=10; i++){
                doubleArray.add(i+0.5);
                System.out.println(doubleArray.get(i-1));
                            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("out of bounds");
        }catch (IndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("bad");
        }
    }
    public static void calc() throws Exception{
        Scanner s = new Scanner(System.in);
        int b = s.nextInt();
        int a=5/b;

    }
    public static void init() throws Exception{
        calc();
    }
}
