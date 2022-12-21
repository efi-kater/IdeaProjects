public class MainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.add(4,5);
        System.out.println(calculator.getValue(result));
    }
}
