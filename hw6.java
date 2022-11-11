package hw6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author jiahaoxian
 */

public class Hw6 {

    public static void main(String[] args) {
        
        int[] counter = new int[2];
        
        Scanner input = new Scanner(System.in);
        
        
        //Program1
        int length;
        
        System.out.println("Enter the length of the array: ");
        length = input.nextInt();
        int[] array = new int[length];
        
        
        if(length == 0) {
            //Skip -- do nothing
        }
        else{
        System.out.println("Enter " + length + " different numbers: ");
            for(int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
        }
        
        //System.out.println("Unsorted: " + Arrays.toString(array));
        mergeSort(array, counter);
        //System.out.println("Sorted: " + Arrays.toString(array));
        System.out.println("Operations taken: " + counter[0] + "\n");
        

        //Program2
        int discs;
        
        System.out.println("Enter a number of discs");
        discs = input.nextInt();
        
        towerOfHanoi(discs, "A", "B", "C", "D", counter);
        System.out.println("Operations taken: " + counter[1]);
        
    }

    static void mergeSort(int[] array, int[] counter) {
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        if (array.length < 2) {
            return;
        }

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
            counter[0]++;
        }

        for (int i = mid; i < array.length; i++) {
            rightArray[i - mid] = array[i];
            counter[0]++;
        }

        mergeSort(leftArray, counter);
        counter[0]++;
        mergeSort(rightArray, counter);
        counter[0]++;

        int i = 0, j = 0, k = 0;

        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
                counter[0]++;
            } else {
                array[k] = rightArray[j];
                j++;
                counter[0]++;
            }
            k++;
            counter[0]++;
        }

        while (i < leftArray.length) {
            array[k] = leftArray[i];
            i++;
            k++;
            counter[0]++;
        }

        while (j < rightArray.length) {
            array[k] = rightArray[j];
            j++;
            k++;
            counter[0]++;
        }
    }

    static void towerOfHanoi(int n, String from, String to, String helper, String helper2, int[] counter) { 
        
        if (n == 0) {
            return;
        }
        
        else if (n == 1) {
           //System.out.println("Disk " + n + " from " + from + " to " + to);
           counter[1]++;
           return;
        }
        
        if (n > 1) {
            towerOfHanoi(n - 2, from, helper, helper2, to, counter);
            //System.out.println("Disk " + (n - 1) + " from " + from + " to " + helper2);
            counter[1]++;
            //System.out.println("Disk " + n + " from " + from + " to " + to);
            counter[1]++;
            //System.out.println("Disk " + (n - 1) + " from " + helper2 + " to " + to);
            counter[1]++;
            towerOfHanoi(n - 2, helper, to, from, helper2, counter);
        }
    }
}
