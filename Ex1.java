package labExam;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();

        int count = 0;
        for (int number : numbers) {
            if (number == searchNumber) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println(searchNumber + " is present " + count + " times.");
        } else {
            System.out.println(searchNumber + " is not present");
        }

        scanner.close();
    }

}
