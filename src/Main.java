import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array original: " + Arrays.toString(array));

        //Bubblesort.ordenar(array, false);
        //InsertionSort.ordenar(array, false);
        //QuickSort.ordenar(array, false);

        System.out.println("Array após ordenação: " + Arrays.toString(array));
    }
}