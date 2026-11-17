/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problm3;
import java.util.Scanner;
/**
 *
 * @author dell
 */
public class PROBLM3 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        input.useDelimiter("[,\\s()]+");

        input.next();

        int n = input.nextInt();

        int result = factorial(n);

        System.out.println(result);

        input.close();
    }

    public static int factorial(int n) {
        if (n <= 1) { // base case 
            return 1;
        }
        return n * factorial(n - 1); // recursive case
    }
}
/* COMMENTS
1. Why did one wrong return make every result wrong?

Because each recursive call depends on the previous return value. One wrong return affects the entire calculation.

2. Stretch: What happens for factorial(-2) with your corrected code, and why?

It returns 1 because -2 satisfies the condition n <= 1, so the base case immediately returns 1.
*/
