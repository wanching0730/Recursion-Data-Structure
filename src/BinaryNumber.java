public class BinaryNumber {
    public static void main(String[] args) {
        findBinary(10);

    }

    public static void findBinary(int number) {
        if(number / 2 == 0)
            System.out.println(1);
        else {
            findBinary(number / 2);
            System.out.println(number % 2);

        }

    }


}
