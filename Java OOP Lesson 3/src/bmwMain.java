import java.util.Scanner;

public class bmwMain {
    public static void main(String[] args) {
        bmw bimi = new bmw();
        int action = init();
        int temp=0;
        if (action==1){
            temp=1;
            bimi.startEngine();
            while (temp!=0){
                action=actionSelection();
                switch (action){
                    case 1:
                        int speed=changeSpeed();
                        bimi.speedUp(speed);
                        break;
                    case 2:
                        speed=changeSpeed();
                        bimi.breakDown(speed);
                        break;
                    case 3:
                        bimi.shutDownEngine();
                        temp=0;
                        break;
                }
            }
        }else {
            System.out.println("bye");
            return;
        }


    }
    public static int actionSelection(){
        String newLine = System.getProperty("line.separator");
        System.out.println("What's next?"+newLine+"1. Speed up"+newLine+"2. Slow down"+newLine+"3. Shut Engine Down");
        int actionSelected=userInput();
        return actionSelected;
    }
    public static int changeSpeed(){
        System.out.println("enter how much to change");
        int newSpeed=userInput();
        return newSpeed;
    }
    public static int init() {
        String newLine = System.getProperty("line.separator");
        System.out.println("Welcome. Bimi is at your service. Please select action"+newLine+"1. Start Engine"+newLine+"2. Exit");
        int actionSelected=userInput();
        return actionSelected;
    }
    public static int userInput(){
        Scanner a = new Scanner(System.in);
        int userInput = a.nextInt();
        return userInput;
    }
}
