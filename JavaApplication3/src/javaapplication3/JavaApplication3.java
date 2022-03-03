/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author rravit
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10;
        int b = 15;
        int c = 12;
        
        if (a > b && a > c)
        {
                System.out.println("Greater is A");
        }
        else if (b > a && b > c)
        {
                System.out.println("Greater is B");
        }
        else if (c > a && c > b)
        {
                System.out.println("Greater is C");
        }
    }
    
}
