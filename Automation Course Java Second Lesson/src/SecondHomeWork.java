import java.util.Scanner;

public class SecondHomeWork {
    public static void main(String[] args) {
        //1-2
//        int x =5;
//        int y =1;
////        for (int i=0; i<5;i++) {
////            if (x > y) {
////                System.out.println(x + " Bigger than " + y);
////                x--;
////            } else if (x == y) {
////                System.out.println(x + " is equal " + y);
////                x--;
////
////            }
////        }
////            System.out.println(x+" smaller than "+y);
        //3
//        int season =1;
//        for (season=1; season<5;season++){
////            switch (season){
////                case 1:
////                    System.out.println("Summer"+season);
////                    break;
////                case 2:
////                    System.out.println("winter"+season);
////                    break;
////                case 3:
////                    System.out.println("fall"+season);
////                    break;
////                case 4:
////                    System.out.println("spring"+season);
////            }
//            if (season==1){
//                System.out.println("Summer"+season);
//            } else if (season==2) {
//                System.out.println("winter"+season);
//            } else if (season==3) {
//                System.out.println("fall"+season);
//            } else if (season==4) {
//                System.out.println("spring"+season);
//            }
//        }
        //5
//        int age = 37;
//        char surName = 'k';
//        double currency = 3.5;
//        boolean ifFlew = true;
//        String appNumber = "15";
//        System.out.println("Efi is "+surName+" "+ age+" "+currency+" "+ifFlew+" "+appNumber);
//        int intCurrency = (int)currency;
//        System.out.println(intCurrency);
//        intCurrency = Integer.parseInt(appNumber);
//        System.out.println(intCurrency);
        //6
//        System.out.println("please enter your phone number");
//        Scanner phone = new Scanner(System.in);
//        String phoneString = phone.nextLine();
//        int charLoc = phoneString.indexOf("-");
//        int charLoc2 = phoneString.indexOf("+");
//        int charLoc3 = phoneString.indexOf(" ");
//        if (charLoc == -1 && charLoc2 == -1 && charLoc3 == -1){
//            long phoneNum = Long.parseLong(phoneString);
//            if (phoneString.startsWith("0")){
//                System.out.println("Your phone number is: 0"+phoneNum);
//            }
//            else {
//                System.out.println("Your Phone Number is: "+phoneNum);
//            }
//
//        }
//        else {
//            phoneString=phoneString.replace("-","");
//            phoneString=phoneString.replace("+","");
//            phoneString=phoneString.replace(" ","");
//            long phoneNum = Long.parseLong(phoneString);
//            if (phoneString.startsWith("0")){
//                System.out.println("Your phone number is: 0"+phoneNum);
//            }
//            else {
//                System.out.println("Your Phone Number is: "+phoneNum);
//            }
//        }
        //7
//        printHello();
        //7
//        calculate();
        //8
//        String name1 = "Efi";
//        name(name1);
        //8
//        int a= 13;
//        by2(a);
        //9
//        System.out.println("enter a first name");
//        Scanner a = new Scanner(System.in);
//        String firstNum = a.next();
//        System.out.println("enter a family name");
//        Scanner b = new Scanner(System.in);
//        String secondNum = a.next();
//        String sum ="Your full name is: "+ fullName(firstNum, secondNum);
//        System.out.println(sum);
        //14
//        String a = "*";
//        for (int i = 0; i<5; i++){
//            System.out.println(a);
//            a=a+"*";
//        }
        //15
//        String a = "*";
//        String b = "       ";
//        String c = "";
//        for (int i = 0; i <=3; i++){
//            if (b.length()==1){
//                System.out.println(c+b+a);
//            } else {
//                System.out.println(c+a+b+a);
//                b= b.substring(0,(b.length()- 2));
//                c=c+" ";
//            }
//        }
//        b="   ";
//        c="  ";
//        for (int i = 0; i <=2; i++){
//            System.out.println(c+a+b+a);
//            b=b+"  ";
//            if (c.length()>0){
//                c=c.substring(0,c.length()-1);
//            }
//            else {
//                c="";
//            }
//        }
        //16
//        Scanner num = new Scanner(System.in);
//        int a = num.nextInt();
//        getSumNum(a);
        //18
        System.out.println("enter a whole number between 1-10");
        Scanner score = new Scanner(System.in);
        int enteredScore = score.nextInt();
        String scoreString="";
        if (enteredScore >= 1 && enteredScore<=3) {
            scoreString ="a";
        } else if (enteredScore>=4 && enteredScore<=6) {
            scoreString="b";
        } else if (enteredScore<=10) {
            scoreString="c";
        }
        switch (scoreString){
            case "a":
                System.out.println(scoreString);
                break;
            case "b":
                System.out.println(scoreString);
                break;
            case "c":
                System.out.println(scoreString);
                break;
            default:
                System.out.println("score out of range!");
        }


    }
    static void printHello(){
        System.out.println("hello");
    }

    static void calculate(){
        System.out.println(5+3.2);
    }

    static String name(String name){
        System.out.println(name);
        return name;
    }

    static double by2(int number){
        double result = (double)number/2;
        System.out.println(result);
        return result;
    }

    static double addNum(double a, double b){
        double sum = a+b;
        return sum;
    }

    static String fullName (String a, String b){
        String c = a + " " + b;
        return c;
    }

    static int getSumNum (int a){
        int sum=0;
        while (a / 10 != 0) {
            sum += a % 10;
            a /= 10;
            //System.out.println(sum);
        }
        sum +=a%10;
        System.out.println(sum);
        return sum;
    }
}

