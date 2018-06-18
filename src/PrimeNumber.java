public class PrimeNumber {
    public static void main (String[] args) {
        System.out.println("5 is a prime number? - " + findPrimeNumber(5, 5/2));
        System.out.println("9 is a prime number? - " + findPrimeNumber(9, 9/2));
    }

    public static int findPrimeNumber(int n, int n1) {
        if(n1 == 1) {
            return 1;
        } else {
            if(n % n1 == 0)
                return 0;
            else
                return findPrimeNumber(n, n1 - 1);
        }
    }
}
