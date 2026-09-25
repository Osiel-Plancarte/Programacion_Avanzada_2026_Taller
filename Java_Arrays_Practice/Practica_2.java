package Java_Arrays_Practice;

import java.util.Arrays;

public class Practica_2 {

    public static void main(String[] args) {
        // 1. 
        int[] price = new int[10];
        
        // 2. Arreglo 'fib' con los primeros 5 números de Fibonacci
        int[] fib = {0, 1, 1, 2, 3};
        System.out.println("2. Arreglo fib: " + Arrays.toString(fib));

        // 3. Ciclo que inicializa un arreglo 'number' de tamaño 20 en 4
        int[] number = new int[20];
        for (int i = 0; i < number.length; i++) {
            number[i] = 4;
        }

        // 4. Ciclo que imprime un arreglo de 30 elementos
        int[] array30 = new int[30];
        System.out.println("4. Imprimiendo arreglo de 30 elementos:");
        for (int i = 0; i < array30.length; i++) {
            System.out.print(array30[i] + " ");
        }

        // 5. Código para calcular y mostrar la media (promedio) de un arreglo
        int[] sampleArr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int val : sampleArr) {
            sum += val;
        }
        double mean = (double) sum / sampleArr.length;
        System.out.println(" Media  " + mean);

        // 6. Código para calcular y mostrar la mediana de un arreglo
        int[] arrForMedian = {2, 3, 5, 7, 10,12};
        double median;
        if (arrForMedian.length % 2 == 0) {
            median = (arrForMedian[arrForMedian.length / 2 - 1] + arrForMedian[arrForMedian.length / 2]) / 2.0;
        } else {
            median = arrForMedian[arrForMedian.length / 2];
        }
        System.out.println("Mediana: " + median);
    }
}