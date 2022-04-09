/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package exceptionhandlingfolder;

import java.util.Random;

public class HandleError {

    public static void main(String args[]) {
        // TODO code application logic here
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 100; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException ae) {
                System.out.println("Exceptin : " + ae);
                System.out.println("division by zero");
                a = 0;

            }
            System.out.println("value of a :" + a);
        }
    }
}
