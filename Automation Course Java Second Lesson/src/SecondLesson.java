public class SecondLesson {
    public static void main(String[] args) {


        //conditions//
        int a =5;
        String b ="8";
        loop(a,b);
        if (a>Integer.parseInt(b)){
            System.out.println("good");
        } else if (b.contains("8")) {
            System.out.println("efi");

        } else {
            System.out.println("bad");
        }

        //ternary condition - assign value to a parameter depending on condition //

        int c = a>Integer.parseInt(b)? 20:30;
        String s = a>Integer.parseInt(b)? "a":b;
        System.out.println(c);
        System.out.println(s);

        //switch case//

        switch (c){
            case 20:
                System.out.println(c);
                break;
            case 31:
                System.out.println(c+1);
                break;
            default:
                System.out.println(c-1);
                break;
        }
        //........//

        //loops//


    }
    static void loop(int a, String b){
        while (a<Integer.parseInt(b)){
            System.out.println("good");
            a++;
            if (a==7){
                System.out.println("i'm gonna skip {{a}}");
                continue;

            }
            System.out.println(a);
        }
    }
}
