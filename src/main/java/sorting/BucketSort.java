package main.java.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] array = {33, 8, 3, 9, 5, 4, 14, 19, 21};

        List<Integer>[] sortArray = new List[10];
        for (int i = 0; i < array.length; i++) {
            sortArray[i] = new ArrayList<>();
        }

        for (int i = 0; i < array.length; i++) {
            int index = (array[i] / 10) % 10;
            sortArray[index].add(array[i]);
        }

        for (int i = 0; i < sortArray.length; i++) {
            if (sortArray[i] != null) {
                sortArray[i].sort((i1, i2) -> {
                    return (i1.compareTo(i2));
                });
            }
        }

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, size = sortArray[i].size(); j < size; j++) {
                array[index++] = sortArray[i].get(j);
            }

        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
