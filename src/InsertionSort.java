import java.util.Arrays;

public class InsertionSort {
    public static void ordenar(int[] array, boolean print) {

        for (int i = 1; i < array.length - 1; i++) {
            int j = i;

            while (j > 0 && array[j] < array[j - 1]) {
                int aux = array[j];
                array[j] = array[j - 1];
                array[j - 1] = aux;
                j--;

                if (print) {System.out.println(Arrays.toString(array));}
            }
        }
    }
}
