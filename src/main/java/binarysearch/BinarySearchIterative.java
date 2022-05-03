package main.java.binarysearch;

public class BinarySearchIterative {

    public static void main(String[] args) {
        int[] array = {1, 3, 22, 56, 78, 91, 100, 1031, 2222,3333};
        BinarySearch(array, 1);
        BinarySearch(array, 78);
        BinarySearch(array, 2222);
        BinarySearch(array, 586);
        BinarySearch(array, 91);
    }
    private static void BinarySearch(int[] array, int noToBeSearched) {
        int index = BinarySearch(array, 0, array.length, noToBeSearched);
        if(index>=0){
            System.out.println(" the number " + noToBeSearched + " is present in array at index " + (index + 1));
        }else{
            System.out.println(" the number "+ noToBeSearched+ " isn't present int the array");
        }

    }
    private static int BinarySearch(int[] array, int start, int last, int noToBeSearched) {

        while(start<last){
            int middle = (start + last) / 2;
            if (array[middle] == noToBeSearched) {
                return middle;
            }else if (noToBeSearched < array[middle]) {
                last = middle;
            }else{
                start=middle+1;
            }

        }
        return -1;
    }


}
