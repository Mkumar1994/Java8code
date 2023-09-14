import java.util.Arrays;

public class ParallelSorting {
    public static void main(String[] args) {

        int[] arr = {5,8,1,0,6,9};

        for (int i : arr) {
            System.out.print(i+" ");
        }

        Arrays.parallelSort(arr,0,5);

        System.out.println("\n Array elements after sorting");

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
