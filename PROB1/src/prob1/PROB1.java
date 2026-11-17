/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prob1;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class PROB1 {

   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useDelimiter("[,\\s]+");

        int a = input.nextInt();
        int b = input.nextInt();

        double result = computeAverage(a, b);

        System.out.println(result);

        input.close();
    }

    static double computeAverage(double total, double count) {

        // Base Case
        if (count <= 0) {
            return 0.0;
        }

        // Calculation
        return total / count;
    }
}

/* COMMENTS
1. Why does the method need the word double (or a cast) in the return?

Because double allows decimal answers. Without it, the result might lose its decimal part.

2. What would go wrong without the count <= 0 guard?

The program might divide by zero, causing an error or an invalid result.
*/
