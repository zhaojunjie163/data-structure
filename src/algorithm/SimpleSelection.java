package algorithm;

/**
 * Created by zhaojunjie on 16/4/17.
 */
public class SimpleSelection {
    /**
     *
     * repeat (numberOfElements -1) times
     *     set the first unsorted elements as the minimum
     *     for each of the unsorted elements
     *         if element < currentMinimum
     *            set element as new minumum
     *     swap minimum with the first unsorted position
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {3, 4, 53, 3, 2, 33, 23, 45};

        for (int i = 0; i < arr.length; i++) {
            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
               if (arr[min]> arr[j] ){
                   min = j;
               }
            }

            if(i != min) {
                swap(i,min,arr);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

    private static void swap(int i, int min, int[] arr) {

        int temp;
         temp = arr[i];
         arr[i] = arr[min];
         arr[min] = temp;
    }


}
