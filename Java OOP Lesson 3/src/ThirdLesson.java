import java.util.*;



public class ThirdLesson {
    public static void main(String[] args) {
        init();
        System.out.println("goodbye");
    }
    public static void add(){
        System.out.println("enter first number");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();
        System.out.println("enter Second number");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();
        int sum = num1+num2;
        System.out.println(num1 + "+" + num2 + "="+ sum);
        continueWork();
    }
    public static void sayHello(){
        System.out.println("hello. what is your name?");
        Scanner b = new Scanner(System.in);
        String name = b.next();
        System.out.println("nice to meet you "+ name + "."+System.getProperty("line.separator")+"I'm your PC");
        continueWork();
    }
    public static void continueWork() {
        String newLine = System.getProperty("line.separator");
        System.out.println("continue?"+newLine+ "Yes/No");
        Scanner a = new Scanner(System.in);
        String temp = a.next();
        if (temp.equalsIgnoreCase("yes")){
            init();
        } else if (temp.equalsIgnoreCase("no")) {
            return;
        }
    }
    public static void init (){
        String newLine = System.getProperty("line.separator");
        System.out.println("what you want to do? " +newLine+  "1. math" +newLine+ "2. meet");
        Scanner a = new Scanner(System.in);
        int num = a.nextInt();
        if (num == 1){
            add();
        }
        else if (num==2) {
            sayHello();
        }
    }
}
