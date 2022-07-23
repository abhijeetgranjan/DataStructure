package main.java.algorithms;

/*
Given an array Arr[] of N integers.
 Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.
 */
public class KadaneAlgo {
    public static void main(String[] args) {
        int []arr = {-1,-2,-3,-4};
        int []arr1= {1,2,-3,4,5,-1};
        System.out.println(getMaxSum(arr));
        System.out.println(getMaxSum(arr1));
    }

    private static int getMaxSum(int [] arr){
        int cursum =0;
        int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cursum = cursum+arr[i];
            if(cursum>maxsum){
                maxsum = cursum;
            }
            if(cursum <0){
                cursum=0;
            }
        }
        return maxsum;
    }
}
