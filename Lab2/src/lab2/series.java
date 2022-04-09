/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab2;

import java.util.Scanner;

class Example {

    private int i1;
    private int i2;

    public Example() {
        i1 = 0;
        i2 = 1;
    }

    public void fun(int n) {
        int temp = 0;
        System.out.print(i1 + "  " + i2 + "  ");
        while (temp < n) {
            temp = i1 + i2;
            System.out.print(temp + "  ");

            i1 = i2;
            i2 = temp;
        }

    }
}

public class series {

    public static void main(String[] args) {
        Example e1 = new Example();

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the upper bound of the Series: ");
        int n = s.nextInt();

        System.out.println("\nFibonacci series : ");
        e1.fun(n);
    }
}
