package Java_Arrays_Practice;

import java.util.Arrays;

public class Practica_4 {

    public static void main(String[] args) {

        // 1. Declara un arreglo 'winners' tipo double para 18 números
        double[] winners = new double[18];

        // 2. Arreglo 'first_array' con los primeros 8 números primos
        int[] first_array = {2, 3, 5, 7, 11, 13, 17, 19};

        // 3. Ciclo que inicializa un arreglo 'num' de tamaño 20 con el doble del valor de su índice
        int[] num = new int[20];
        for (int i = 0; i < num.length; i++) {
            num[i] = i * 2;
        }
        System.out.println(" Arreglo  " + Arrays.toString(num));

        // 4. Arreglo bidimensional de 30x40 llamado 'maze'
        int[][] maze = new int[30][40];

        // 5. Ciclo que imprime una matriz de 16x32
        int[][] matrix = new int[16][32];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 32; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 6. Trace code
        int array6[][] = {{2, 3, 1}, {2, 2, 1}, {0, 2, 3}, {1, 0, 4}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array6[i][j]);
            }
            System.out.println();
        }

        // 7. Trace code
        int array7[][] = {{2, 2, 2}, {2, 2, 0}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if (array7[i][j] == 0 && j == 2) {
                    System.out.print(array7[i][j]);
                }
            }
        }
        System.out.println();

        // 8. Trace code
        int array8[][] = {{6, 4, 3}, {4, 3, 2}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(2 * array8[i][j]);
            }
        }
        System.out.println();
    }
}