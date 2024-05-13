package labExam;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int[] nums = {3, 6, 11, 4, 15, 1};
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums) {
        if (nums.length > 1) {
            int[] leftArray = Arrays.copyOfRange(nums, 0, nums.length / 2);
            int[] rightArray = Arrays.copyOfRange(nums, nums.length / 2, nums.length);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(leftArray, rightArray, nums);
        }
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length) {
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[mergedIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[mergedIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        while (leftIndex < leftArray.length) {
            array[mergedIndex] = leftArray[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        while (rightIndex < rightArray.length) {
            array[mergedIndex] = rightArray[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
    }
}