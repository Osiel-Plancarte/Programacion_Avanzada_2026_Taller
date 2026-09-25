package Arrays_Utilities;

import java.util.Scanner;

public class ArraysUtilitiesTester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraysUtilities utils = new ArraysUtilities();

        System.out.println("********************************************");
        System.out.println("   Hola, Sea bienvenido a mi programa de testeo de Matrices  ");
        System.out.println("********************************************");

        boolean exit = false;

        while (!exit) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Construir/Llenar arreglo aleatorio ");
            System.out.println("2. Eliminar números pares ");
            System.out.println("3. Obtener suma ");
            System.out.println("4. Obtener promedio ");
            System.out.println("5. Ejecutar demostración de mediana ");
            System.out.println("6. Contar valores entre un rango ");
            System.out.println("7. Verificar si todos están entre un rango ");
            System.out.println("8. Mostrar parejas consecutivas iguales");
            System.out.println("9. Eliminar elementos duplicados");
            System.out.println("10. Mover elemento al final");
            System.out.println("11. Mover elemento al inicio ");
            System.out.println("12. Invertir el arreglo ");
            System.out.println("13. Mostrar contenido del arreglo ");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    utils.buildList();
                    System.out.println("Arreglo generado:");
                    System.out.println(utils.toString());
                    break;

                case 2:
                    System.out.println("Eliminando elementos pares...");
                    utils.removeEvens();
                    System.out.println("Arreglo resultante:");
                    System.out.println(utils.toString());
                    break;

                case 3:
                    System.out.println("Suma de elementos: " + utils.getSum());
                    break;

                case 4:
                    System.out.println("Promedio de elementos: " + utils.getAverage());
                    break;

                case 5:
                    utils.getMedian();
                    break;

                case 6:
                    System.out.print("Ingrese el límite inferior (low): ");
                    int low1 = scanner.nextInt();
                    System.out.print("Ingrese el límite superior (high): ");
                    int high1 = scanner.nextInt();
                    int count = utils.valuesBetween(low1, high1);
                    System.out.println("Cantidad de valores estrictamente entre " + low1 + " y " + high1 + ": " + count);
                    break;

                case 7:
                    System.out.print("Ingrese el límite inferior (low): ");
                    int low2 = scanner.nextInt();
                    System.out.print("Ingrese el límite superior (high): ");
                    int high2 = scanner.nextInt();
                    boolean allBetween = utils.allNumbersBetween(low2, high2);
                    System.out.println("¿Todos los valores están entre " + low2 + " y " + high2 + "? " + allBetween);
                    break;

                case 8:
                    utils.displayConsecutivePairs();
                    break;

                case 9:
                    System.out.println("Eliminando elementos duplicados...");
                    utils.removeDuplicates();
                    System.out.println("Arreglo resultante:");
                    System.out.println(utils.toString());
                    break;

                case 10:
                    System.out.print("Ingrese el índice del elemento a mover al final: ");
                    int endIdx = scanner.nextInt();
                    utils.moveToEnd(endIdx);
                    System.out.println("Arreglo actualizado:");
                    System.out.println(utils.toString());
                    break;

                case 11:
                    System.out.print("Ingrese el índice del elemento a mover al inicio: ");
                    int startIdx = scanner.nextInt();
                    utils.moveToBeginning(startIdx);
                    System.out.println("Arreglo actualizado:");
                    System.out.println(utils.toString());
                    break;

                case 12:
                    System.out.println("Invertiendo el arreglo...");
                    utils.reverseList();
                    System.out.println("Arreglo resultante:");
                    System.out.println(utils.toString());
                    break;

                case 13:
                    System.out.println("Contenido actual del arreglo:");
                    System.out.println(utils.toString());
                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}