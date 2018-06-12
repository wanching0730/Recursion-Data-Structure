public class Sorting {
    public static void main(String[] args) {
        double[] list = {2,1,3,1,2,5,-1,0};

        sort(list);

        for(int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }

    public static void sort(double[] list) {
        sort(list, 0, list.length - 1);
    }

    private static void sort(double[] list, int low, int high) {
        if(low < high) {
            // Find smallest number and its index
            int indexOfMin = low;
            double min = list[low];
            for(int i = low+1; i <= high; i++) {
                if(list[i] < min) {
                    min = list[i];
                    indexOfMin = i;
                }
            }

            // swap the min value with list[low]
            list[indexOfMin] = list[low];
            list[low] = min;

            // sort remaining list
            sort(list, low+1, high);
        }
    }
}
