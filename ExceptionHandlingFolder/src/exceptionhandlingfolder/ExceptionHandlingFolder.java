/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandlingfolder;

//Using Try and catch 
public class ExceptionHandlingFolder {

    public static void main(String[] args) {
        // TODO code application logic here
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed");
        } catch (ArithmeticException ae) {
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement");

    }
}
