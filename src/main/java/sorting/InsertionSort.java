package main.java.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {8,3,9,7,5,4,-10};
        int count =0;
        int temp;

        for (int i = 1; i < array.length; i++) {
            int j =i-1;
            temp = array[i];
            while ( j>=0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[k]+"  ");
            }
            System.out.println("Iteration "+ ++count +" ");
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
    }
}
