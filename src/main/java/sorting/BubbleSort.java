package main.java.sorting;
/*
Bubble sort is a sorting method where we compare each element one by one and push the largest element at end and
then do the same process for the element from index to size n-1
{8, 3, 9, 7, 5, 4, -10} --> { 3,8,7,5,4,-10,9} --> {3,7,5,4,-10,8,9} --> {3,5,4,-10,7,8,9} -->{3,4,-10,5,7,8,9}
--> {3,-10,4,5,7,8,9} -->{-10,3,4,5,7,8,9}
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 3, 9, 7, 5, 4, -10};
        int count = 0;
        int temp;


        for (int i = array.length; i >0  ; i--) {
            for(int j=0; j < array.length-1; j++){
                if(array[j] > array[j+1]){
                    //swap elements
                    temp =array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

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
