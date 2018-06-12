public class SumOfSquares {
    public static void main (String[] args) {
        System.out.println("Sum of squares of 5 is " + findSquares(5));
    }

    public static int findSquares(int number) {
        int a, b;
        if(number == 0)
            return 0;

        if(number == 1)
            return 1;

        a = number - 1;
        b = number * number + findSquares(a);

        return b;
    }
}
