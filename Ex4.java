package labExam;

import java.util.Arrays;

public class Ex4 {
    public static void bubbleSort(char[] array){
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length-1; j++) {
                if(array[j+1] < array[j]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = (char) temp;
                    swapped = true;
                }
                if(!swapped)
                    break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        char[] array = {'c', 'b', 'a', 'h', 'd', 'k', 'e' };
        bubbleSort(array);
    }
}
