/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exceptionhandlingfolder;

public class NestTry {

    public static void main(String args[]) {
        // TODO code application logic here

        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);

            try {
                if (a == 1) {
                    a = a / (a - a);
                }
                if (a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array out of Bounds: " + e);
            }
        } catch (ArithmeticException ae) {
            System.out.println("Divide by 0: " + ae);
        }
    }
}
