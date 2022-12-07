public class FirstClass {
    public static void main(String[] args) {
        int s=5;
        boolean efi=true;
        byte a=-127;
        short ShortNum =32;
        char cha = 's';
        long LongNum = 100000L+ShortNum;
        float floatNum = 1.5f;
        double doubleNum = 1.55+a;
        String mock;
        if ((s==1 && LongNum>1) || efi){
            doubleNum+=ShortNum;
            mock="The Value is: ";
            System.out.println(mock+ (doubleNum+3) + " " + cha);
        } else if (ShortNum>floatNum) {
            System.out.println(ShortNum>floatNum);

        } else{
            floatNum= (float) (floatNum+ShortNum);
            mock="The Value is: ";
            System.out.println(mock + floatNum);
        }

    }
}
