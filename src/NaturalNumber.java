public class NaturalNumber {
    public static void main(String[] args) {
        System.out.println("Ascending: ");
        printAsc(10);
        System.out.println("Descending: ");
        printDesc(10);
    }

    public static void printDesc(int number) {
        if(number == 0)
            System.out.println(number);
        else {
            System.out.println(number);
            printDesc(number - 1);
        }
    }

    public static void printAsc(int number) {
        if(number >= 0) {
            printAsc(number - 1);
            System.out.println(number);
        }
    }
}
