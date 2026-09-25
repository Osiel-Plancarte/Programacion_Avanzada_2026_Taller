package ArrayList_Utilities;

import java.util.ArrayList;

public class ArrayListUtilities {
    
    private ArrayList<Integer> list = new ArrayList<Integer>();
    
    
     // Llena la lista con una cantidad de números enteros generados al azar entre 1 y 20.
    
    public void buildList(int size) {
        for (int i = 0; i < size; i++) {
            list.add((int)(Math.random() * 20 + 1));
        }
    }
   
    
     //Recorre la lista y elimina todos los números pares.
     //Imprime en consola el valor eliminado y decrementa el índice (i--) para evitar
     // saltarse elementos al reestructurarse el ArrayList tras el remove.
     
    public void removeEvens() {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.println("Remove: " + list.get(i));
                list.remove(i);
                i--;
            }
        }
    }
    
    
     // Suma todos los elementos contenidos en la lista.
     
    public Integer getSum() {
        int sum = 0;
        for(Integer el: list) {
            sum += el;
        }
        return sum;
    }
    
    
    // Calcula el promedio aritmético de los números almacenados en la lista.
     // Convierte la suma a double para obtener precisión decimal.
     
    public double getAverage() {
        if (list.isEmpty()) return 0.0;
        return (double)getSum() / list.size();
    }
    
    //
     // Demuestra el cálculo de la mediana para dos listas estáticas simuladas:
     // una con número par de elementos y otra con número impar de elementos.
     
    public void getMedian() {
        System.out.println("\ngetMedian method");
        
        ArrayList<Integer> evenCountList = new ArrayList<Integer>();
        System.out.print("\t");
        for (int i = 60; i <= 100; i += 5) {
            System.out.print(i + " ");
            evenCountList.add(i);
        }
        System.out.println("");

        ArrayList<Integer> oddCountList = new ArrayList<Integer>();
        System.out.print("\t");
        for (int i = 60; i < 100; i += 5) {
            System.out.print(i + " ");
            oddCountList.add(i);
        }
        System.out.println("");
        
        int evenListIndex = evenCountList.size() / 2;
        int oddListIndex = oddCountList.size() / 2;
        
        int evenMedian = (evenCountList.get(evenListIndex) + evenCountList.get(evenListIndex - 1)) / 2;
        int oddMedian = (oddCountList.get(oddListIndex));
        
        System.out.println("\tEvenCountList Median: " + evenMedian);
        System.out.println("\tOddCountList Median: " + oddMedian);
    }
    
    
     // Cuenta cuántos elementos de la lista se encuentran estrictamente entre los valores
     //límite especificados (excluyendo 'low' y 'high').
    
    public int valuesBetween(int low, int high) {
        int num = 0;
        for (Integer el: list) {
            if (el > low && el < high) {
                num++;
            }
        }  
        return num;
    }
    
    
     // Verifica si TODOS los números de la lista se encuentran estrictamente entre 'low' y 'high'.
     
    public boolean allNumbersBetween(int low, int high) {
        for (Integer el: list) {
            if (el <= low || el >= high) {
                return false;
            }
        }  
        return true;
    }
    
    
     // Imprime las parejas de elementos adyacentes que tienen el mismo valor en la lista.
     // Si no se encuentran parejas consecutivas iguales, muestra un mensaje indicándolo.
     
    public void displayConsecutivePairs() {
        System.out.println("Display Consecutive Pairs");
        int value = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i+1))) {
                System.out.println("\t" + list.get(i) + ", " + list.get(i+1));
                value++;
            }
        }
        if (value == 0) {
            System.out.println("NO CONSECUTIVE PAIRS");
        }
    }
    
    
     // Busca y elimina elementos duplicados en la lista utilizando dos ciclos anidados.
     
    public void removeDuplicates() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    System.out.println("\tRemove: " + list.get(j));
                    list.remove(j);
                    j--;
                }
            }
        }
    }
    
     //Este método genera una excepción ConcurrentModificationException al modificar 
     // la lista mientras se itera sobre ella con un for-each.
    
    public void removeElement_Bad(Integer value) {
        for (Integer obj: list) {
            if (obj.equals(value)) {
                list.remove(obj);
            }
        }
    }
   
    
     // Remueve el elemento situado en la posición 'index' y lo inserta al final de la lista.
    
    public void moveToEnd(int index) {
        if (index >= 0 && index < list.size()) {
            Integer valueToBeMoved = list.remove(index);
            list.add(valueToBeMoved);
        }
    }

    
     // Remueve el elemento situado en la posición 'index' y lo inserta en el inicio de la lista (índice 0).
    
    public void moveToBegining(int index) {
        if (index >= 0 && index < list.size()) {
            Integer valueToBeMoved = list.remove(index);
            list.add(0, valueToBeMoved);
        }
    }

    
     // Invierte el orden de los elementos contenidos en la lista utilizando una lista temporal.
     
    public void reverseList() {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = list.size() - 1; i >= 0; i--) {
            temp.add(list.remove(i));
        }
        list = temp;
    }
   
    
     // Devuelve una representación en String con todos los elementos de la lista separados por espacios.
    
    public String toString() {
        String str = "";
        for (Integer num: list) {
            str += (num + "  ");
        }
        return str;
    }
}