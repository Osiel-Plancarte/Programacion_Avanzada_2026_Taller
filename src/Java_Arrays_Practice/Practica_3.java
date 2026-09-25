package Java_Arrays_Practice;

import java.util.Arrays;

public class Practica_3 {

    public static void main(String[] args) {

        // 1. Declara un arreglo 'scores' tipo int para 15 números
        int[] scores = new int[15];
        
        // 2. Arreglo 'odd' con los primeros 5 impares
        int[] odd = {1, 3, 5, 7, 9};

        // 3. Ciclo que inicializa un arreglo 'number' de tamaño 30 en 5
        int[] number = new int[30];
        for (int i = 0; i < number.length; i++) {
            number[i] = 5;
        }

        // 4. Ciclo que imprime los valores de un arreglo de 16 elementos
        int[] array16 = new int[16];
        for (int i = 0; i < array16.length; i++) {
            System.out.print(array16[i] );
        }

        // 5. Trace code
        int num[] = {7, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 2, 1};
        for (int i = 0; i < 13; i = i + 4) {
            System.out.print(num[i]);
        }
        System.out.println();

        // 6. Trace code
        int array6[][] = {{2, 3, 1}, {2, 2, 1}, {0, 2, 3}, {1, 0, 4}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array6[i][j]);
            }
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
       

        // 8. Trace code;
        int array8[][] = {{6, 4, 3}, {4, 3, 2}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(2 * array8[i][j]);
            }
        }
    }
}