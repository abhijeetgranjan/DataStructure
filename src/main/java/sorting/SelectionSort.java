package main.java.sorting;

/*
In insertion sort we first find the minimum element and insert it at first position and the element at first position
takes it place, and then we do it for second element and so on.

{8,3,9,7,5,4,-10}; --> {-10,3,9,7,5,4,8} --> {-10,3,4,7,5,9,8} -->{-10,3,4,5,7,9,8} -->{-10,3,4,5,7,9,8}
-->{-10,3,4,5,7,8,9}
 */

// Time Complexity O(n^2);


public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {8,3,9,7,5,4,-10};
        int min;
        int count =0;
        for (int i = 0; i < array.length-1; i++) {
            min = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[min] > array[j]) {
                    min = j;
                }
            }
            if(min!=i){
                int temp =array[i];
                array[i]=array[min];
                array[min]=temp;
            }


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
