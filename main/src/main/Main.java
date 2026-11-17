/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // PROBLEM 2
        Scanner input = new Scanner(System.in);
        input.useDelimiter("[,\\s{}]+");

        int[] grades = new int[5];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = input.nextInt();
        }

        input.next(); 

        int passingMark = input.nextInt();

        int result = countPassing(grades, passingMark);

        System.out.println(result);

        input.close();
    }

    // Iterative Method
    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;

        for (int g : grades) {
            if (g >= passingMark) {
                count++;
            }
        }

        return count;
    }

    // Recursive Method
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {

        if (index == grades.length) {
            return 0;
        }

        int thisOne = (grades[index] >= passingMark) ? 1 : 0;

        return thisOne + countPassingRecursive(grades, passingMark, index + 1);
    }
}
// COMMENTS
//1. What does each recursive call do to index, and why must it change?

//Each recursive call increases index by 1 to check the next grade and avoid repeating the same grade.

//2. What happens if you delete the base case entirely?

//The recursion will continue without stopping and eventually cause a StackOverflowError.
