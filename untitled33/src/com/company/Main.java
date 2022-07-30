package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

/**
 *
 * @author iit123
 */
        class Calculator {


            /**
             * @param args the command line arguments
             */
            public static void main(String[] args) {
                // TODO code application logic here
                int rows, columns;
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the number of rows of the matrix: ");
                rows = input.nextInt();
                System.out.println("Enter number of columns of the matrix: ");
                columns = input.nextInt();

                DataHandler handler = new DataHandler();

                System.out.println();
                System.out.println("Enter first matrix");
                int[][] a = handler.readMatrix(rows, columns);

                System.out.println("Enter second matrix");
                int[][] b = handler.readMatrix(rows, columns);

                System.out.println();
                System.out.println("A + B =");
                Sum summation = new Sum();
                int[][] sum = summation.calculate(a, b);
                handler.printMatrix(sum);

                Subtract subtractor1 = new Subtract();
                int[][] difference1 = subtractor1.calculate(a, b);
                System.out.println();
                System.out.println("A - B =");
                handler.printMatrix(difference1);

                Subtract subtractor2 = new Subtract();
                int[][] difference2 = subtractor2.calculate(b, a);
                System.out.println();
                System.out.println("B - A =");
                handler.printMatrix(difference2);

                Multiplication multiply = new Multiplication();
                int[][] multiplication = multiply.calculate(a, b);
                System.out.println();
                System.out.println("A * B =");
                handler.printMatrix(multiplication);

            }

        }

        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */

/**
 *
 * @author iit123
 */
        class DataHandler {
            public static int[][] readMatrix(int rows, int columns) {
                int[][] result = new int[rows][columns];
                Scanner s = new Scanner(System.in);
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        result[i][j] = s.nextInt();
                    }
                }
                return result;
            }

            public static void printMatrix(int[][] matrix) {
                int rows = matrix.length;
                int columns = matrix[0].length;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
