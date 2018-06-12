public class GCD {
    public static void main (String[] args) {
        System.out.println("GCD for 48 and 18 is " + findGcd(48, 18));
    }

    public static int findGcd(int n1, int n2) {
        int remainder;
        remainder = n1 % n2;
        if(remainder == 0)
            return n2;
        else
            return findGcd(n2, remainder);
    }
}
