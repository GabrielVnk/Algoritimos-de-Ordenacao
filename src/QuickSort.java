import java.util.Arrays;

public class QuickSort {
    public static void ordenar(int[] array, boolean print) {
        ordenarRecursao(array, 0, array.length - 1, print);
    }

    private static void ordenarRecursao(int[] array, int inicio, int fim, boolean print) {
        int pivo = array[inicio];
        int esquerda = inicio;
        int direita = fim;
        boolean pivoInicio = true;

        if (print) {System.out.println("pivo: " + pivo + ", indice: " + inicio + "\n" + Arrays.toString(array));}

        while (esquerda < direita) {
            if (pivoInicio) {
                if (pivo > array[direita]) {
                    array[esquerda] = array[direita];
                    array[direita] = pivo;
                    pivoInicio = false;
                    esquerda++;

                    if (print) {System.out.println(Arrays.toString(array));}

                } else {direita--;}
            }
            else {
                if (pivo < array[esquerda]) {
                    array[direita] = array[esquerda];
                    array[esquerda] = pivo;
                    pivoInicio = true;
                    direita--;

                    if (print) {System.out.println(Arrays.toString(array));}

                } else {esquerda++;}
            }
        }
        if (esquerda-1 > inicio) {ordenarRecursao(array, inicio, esquerda-1, print);}
        if (esquerda+1 < fim) {ordenarRecursao(array, esquerda + 1, fim, print);}
    }
}
