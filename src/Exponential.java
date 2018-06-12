public class Exponential {
    public static void main (String[] args) {
        System.out.println("5 to power 3 is " + findExponential(5, 3));
    }
    public static long findExponential(int base, int exponent) {
        if(exponent == 0)
            return 1;
        else
            return base * findExponential(base, exponent - 1);
    }
}
