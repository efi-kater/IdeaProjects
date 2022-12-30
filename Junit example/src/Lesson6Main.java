public class Lesson6Main {
    public static void main(String[] args) {
        extracted1();
    }

    private static void extracted1() {
        try {
            extracted();
        } catch (NumberFormatException e){
            System.out.println("efi");
        }
    }

    private static void extracted() {
        int x = 7;
        int y = 5;
        int c = x + y;
        int ac= Integer.parseInt(null);
        System.out.println(ac= c);
    }
}
