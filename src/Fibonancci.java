public class Fibonancci {
    public static void main (String[] args) {
        System.out.println("The fibonancci number at index 5 is " + fib(5));
    }

    public static long fib(int index) {
        if(index == 0)
            return 0;
        else if(index == 1)
            return 1;
        else
            return fib(index-1) + fib(index-2);
    }
}
