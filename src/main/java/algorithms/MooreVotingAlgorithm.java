package main.java.algorithms;
/*
This alogortihm is used to find the element with the maximum occurences in an array. It is based on the approach that , initially we take the element at 
zero position for majority element and if we encounter the same element we increase the counter else decrease the counter and if counter becomes zero, we take the
next element as the majority element.
*/
public class MooreVotingAlgorithm {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 1, 1, 1, 1, 1, 1, 1};
        findtheMajorityElementInArray(array);
    }

    private static void findtheMajorityElementInArray(int[] array) {
        int majorityElement = 0, counter = 0;

        for (int a = 0; a < array.length; a++) {

            if (counter == 0) {
                majorityElement = array[a];
            }
            if (array[a] == majorityElement) {
                counter++;
            } else {
                counter--;
            }
        }

        System.out.println(" the majority element in array is " + majorityElement);
    }
}
