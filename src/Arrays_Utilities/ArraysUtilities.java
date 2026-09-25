package Arrays_Utilities;

public class ArraysUtilities {
    
    private int[] ary = new int[20];
    private int count = 0;
    
    
     //Llena el arreglo 'ary' con números enteros aleatorios entre 1 y 20.
     // Incrementa la variable 'count' para mantener el control de los elementos válidos ocupados.
     
    public void buildList() {
        count = 0; // Reinicia el contador en caso de volver a construir
        for (int i = 0; i < ary.length; i++) {
            ary[i] = (int)(Math.random() * 20 + 1);
            count++;
        }
    }
    
    
     //Recorre los elementos activos del arreglo y elimina aquellos que sean pares.
     //Decrementa el índice (i--) tras eliminar para reevaluar la posición actual
     // desplazada por el método removeElement.
     
    public void removeEvens() {
        for (int i = 0; i < count; i++) {
            if (ary[i] % 2 == 0) {
                removeElement(i);
                i--;
            }
        }
    }
    
    
     //Elimina el elemento en la posición dada desplanzando los elementos contiguos hacia la izquierda
     // y decrementa la cantidad 'count' de elementos válidos en el arreglo.
     
    public void removeElement(int index) {
        System.out.println("remove: " + ary[index]);
        for (int i = index; i < count - 1; i++) {
            ary[i] = ary[i + 1];
        }
        count--;
    }
    
    
     // Suma todos los elementos almacenados actualmente en el arreglo.
     
    public int getSum() {
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += ary[i];
        }
        return sum;
    }
    
    
     // Calcula el promedio aritmético dividiendo la suma total entre el número de elementos activos (count).
    
    public double getAverage() {
        if (count == 0) return 0.0;
        return (double)getSum() / count;
    }
    
   
     //Demuestra el cálculo de la mediana para dos arreglos estáticos:
     // uno con número par de elementos y otro con número impar de elementos.
     
    public void getMedian() {
        int[] evenCountList = {60, 65, 70, 75, 80, 85, 90, 95};
        int[] oddCountList = {60, 65, 70, 75, 80, 85, 90, 95, 100};
        
        int oddIndex = oddCountList.length / 2;
        int oddMedian = oddCountList[oddIndex];
        
        int evenIndex = evenCountList.length / 2;
        int evenMedian = (evenCountList[evenIndex] + evenCountList[evenIndex - 1]) / 2;
        
        System.out.println("EvenCountList Median: " + evenMedian);
        System.out.println("OddCountList Median: " + oddMedian);
    }
    
    
     // Cuenta cuántos elementos activos están estrictamente entre los valores límite especificados.
   
    public int valuesBetween(int low, int high) {
        int num = 0;
        for (int i = 0; i < count; i++) {
            if (ary[i] > low && ary[i] < high) {
                num++;
            }
        }
        return num;
    }
     
    
     // Evalúa si TODOS los elementos activos del arreglo se encuentran estrictamente entre 'low' y 'high'.
    
    public boolean allNumbersBetween(int low, int high) {
        for (int i = 0; i < count; i++) {
            if (ary[i] <= low || ary[i] >= high) {
                return false;
            }
        }
        return true;
    }
    
    
     //Muestra en pantalla las parejas de elementos adyacentes iguales.
     // Imprime un mensaje informativo si no existen pares consecutivos.
     
    public void displayConsecutivePairs() {
        System.out.println("Display Consecutive Pairs");
        int value = 0;
        for (int i = 0; i < count - 1; i++) {
            if (ary[i] == ary[i+1]) {
                System.out.println("\t" + ary[i] + ", " + ary[i+1]);
                value++;
            }
        }
        if (value == 0) {
            System.out.println("NO CONSECUTIVE PAIRS");
        }
    }
    
    
     // Remueve valores repetidos comparando cada elemento con los subsecuentes.
     
    public void removeDuplicates() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (ary[i] == ary[j]) {
                    removeElement(j);
                    j--;
                }
            }
        }
    }

    
     // Desplaza el elemento en el índice indicado hasta la última posición válida del arreglo (count - 1).
    
    public void moveToEnd(int index) {
        if (index >= 0 && index < count) {
            int valueToBeMoved = ary[index];
            for (int i = index; i < count - 1; i++) {
                ary[i] = ary[i + 1];
            }
            ary[count - 1] = valueToBeMoved;
        }
    }

    
      //Desplaza el elemento en el índice indicado hacia la primera posición (índice 0).
     
    public void moveToBeginning(int index) {
        if (index >= 0 && index < count) {
            int valueToBeMoved = ary[index];
            for (int i = index; i > 0; i--) {
                ary[i] = ary[i - 1];
            }
            ary[0] = valueToBeMoved;
        }
    }

    
     // Invierte la secuencia de los elementos válidos del arreglo mediante un arreglo temporal.
     
    public void reverseList() {
        int[] temp = new int[ary.length];
        int current = 0;
        for (int i = count - 1; i >= 0; i--) {
            temp[current] = ary[i];
            current++;
        }
        ary = temp;
    }
    
    
     // Retorna una representación en texto con los elementos activos del arreglo separados por espacios.
    
    public String toString() {
        String str = "";
        for (int i = 0; i < count; i++) {
            str += (ary[i] + "  ");
        }
        return str;
    }
}