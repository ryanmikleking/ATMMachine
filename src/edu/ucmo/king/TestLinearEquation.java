/* Ryan M. King
* CS 1110
* HW4
* Description: Tests the class Linear Equation by creating a linear object finding a solution for the Linear Equation.
*/
package edu.ucmo.king;

import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        //  Takes uses input
        Scanner input = new Scanner(System.in);

        String userPrompt = "Please input 6 values for Linear Equation: "; // Prompts users values for equation
        System.out.println(userPrompt);

        // Stores users input into 6 variables
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // creates LinearEquation object from users input
        LinearEquation linEquation = new LinearEquation(a, b, c, d, e, f);
        // Determines if the user has given solvable data
        if (linEquation.isSolvable()){
            System.out.println(" X = " + linEquation.getX());
            System.out.println(" Y  = " + linEquation.getY());
        }
        else{
            System.out.println("The equation has no solution"); // Print statement for invalid data
        }

    }
}
