package main.java.algorithms;

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
