/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ice.tasknine;
import javax.swing.JOptionPane;
/**
 *
 * @author B.O.N.N.Y
 */
public class ICETASKNINE {

    public static void main(String[] args) {
     
        // Get two numbers from the user
        String num1Str = JOptionPane.showInputDialog("Enter the first number:");
        String num2Str = JOptionPane.showInputDialog("Enter the second number:");
        
        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);

        int option;
        do {
            // Display menu
            String menu = "Choose an operation:\n" +
                          "1. Addition\n" +
                          "2. Subtraction\n" +
                          "3. Division\n" +
                          "4. Multiplication\n" +
                          "0. Exit";
            
            String optionStr = JOptionPane.showInputDialog(menu);
            option = Integer.parseInt(optionStr);

            switch (option) {
                case 1:
                    addition(num1, num2);
                    break;
                case 2:
                    subtraction(num1, num2);
                    break;
                case 3:
                    division(num1, num2);
                    break;
                case 4:
                    multiplication(num1, num2);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Calculation not recognized");
            }
        } while (option != 0);
    }

    private static void addition(double num1, double num2) {
        double result = num1 + num2;
        JOptionPane.showMessageDialog(null, num1 + " + " + num2 + " = " + result);
    }

    private static void subtraction(double num1, double num2) {
        double result = num1 - num2;
        JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + result);
    }

    private static void division(double num1, double num2) {
        if (num2 != 0) {
            double result = num1 / num2;
            JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = " + result);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Division by zero");
        }
    }

    private static void multiplication(double num1, double num2) {
        double result = num1 * num2;
        JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + result);
    }
}

