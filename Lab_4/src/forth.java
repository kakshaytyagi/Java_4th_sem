
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
//Write a java program to represent Abstract class with example.
abstract class Example {

    protected int x;
    protected int y;
    Scanner s = new Scanner(System.in);

    abstract void sum();

    public void get_val() {
        System.out.println("abstract class invoked");
        System.out.println("Enter the value of x :");
        x = s.nextInt();
        System.out.println("Enter the value of y");
        y = s.nextInt();
    }

}

class suum extends Example {

    void sum() {
        System.out.println("inherted child class invoked");
        System.out.println("sum: " + (x+y));
    }
}

public class forth {

    public static void main(String args[]) {
        // TODO code application logic here
        Example e = new suum();
        e.get_val();
        e.sum();
    }
}
