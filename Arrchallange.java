package Arays;

import java.util.Scanner;


public class Arrchallange {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] MyArray = getArray(5);
         int[] sorted = getSortedArray(MyArray);
        printArray(sorted);

    }

    public static int[] getArray(int capacity) {
        int[] array = new int[capacity];
        System.out.println(" Enter " + capacity + " integer values");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " value stored  is " + array[i]);
        }
    }
    public  static int[] getSortedArray(int[] array){
        int[] sortedArray = new int[array.length];
        for (int i=0; i<array.length; i++){
            sortedArray[i] =array[i];
        }

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for(int i=0;i<sortedArray.length-1;i++){
               if (sortedArray[i]<sortedArray[i+1]) {
                   temp = sortedArray[i];
                   sortedArray[i] = sortedArray[i + 1];
                   sortedArray[i + 1] = temp;
                   flag = true;
               }

            }
        }
        return sortedArray;
    }
}


