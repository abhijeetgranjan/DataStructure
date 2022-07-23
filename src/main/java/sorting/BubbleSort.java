package main.java.sorting;

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
