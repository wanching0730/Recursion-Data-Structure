public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2,4,7,10,11,45,50,59,60,66,69,70,79};
        System.out.println("The index for key 11 is " + recursiveBinarySearch(numbers, 11));
    }

    public static int recursiveBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return recursiveBinarySearch(list, key, low, high);
    }

    private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
        if(low > high)
            return -low - 1;

        int middle = (low + high) / 2;
        if(key < list[middle])
            return recursiveBinarySearch(list, key, low, middle - 1);
        else if(key == list[middle])
            return middle;
        else
            return recursiveBinarySearch(list, key, middle+1, high);
    }
}
