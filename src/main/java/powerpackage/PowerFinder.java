package powerpackage;

public class PowerFinder {
    public static int calculate(int base, int exponent) {
        int product = 1;
        for (int iteration = 0; iteration < exponent; iteration++) {
            product *= base;
        }
        return product;
    }
}
