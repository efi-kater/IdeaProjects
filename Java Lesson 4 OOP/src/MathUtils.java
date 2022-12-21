interface MathUtils {

    int add(int x, int y);

    default double getValue(int value) {
        return getSquareRootValue(value);
    }

    private double getSquareRootValue(int value) {
        return java.lang.Math.sqrt(value);
    }
}
