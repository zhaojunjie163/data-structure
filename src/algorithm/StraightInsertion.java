package algorithm;

/**
 * Created by zhaojunjie on 16/4/17.
 */
public class StraightInsertion {
    public static void main(String[] args) {
        int[] arr = {3, 0, 2, 2, 88, 5, 33, 23, 45, 1};
        int lastSortedIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                lastSortedIndex = i;
                for (int j = lastSortedIndex; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        swap(j, j - 1, arr);
                    }
                }
            }
        }

        // print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void swap(int i, int j, int[] arr) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
