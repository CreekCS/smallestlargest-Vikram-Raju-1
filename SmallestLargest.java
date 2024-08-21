//Vikram Raju, 8/21/24

import java.lang.Math;

public class SmallestLargest{
    public static void main(String[] args){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        } System.out.println(smallestValue(arr));
        System.out.println(largestValue(arr));
    }
    public static int smallestValue(int[] arr){
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
    public static int largestValue(int[] arr){
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}