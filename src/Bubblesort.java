import java.util.Arrays;
public class Bubblesort {
    public static void ordenar(int[] array, boolean print) {
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (!(array[i] > array[i + 1])) {continue;}

                int aux = array[i];
                array[i] = array[i + 1];
                array[i + 1] = aux;
                trocou = true;

                if (print) {System.out.println(Arrays.toString(array));}
            }
        } while (trocou);
    }
}