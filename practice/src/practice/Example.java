/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package practice;

/**
 *
 * @author rravit
 */
class Parent {

    int y;
    
    public Parent(int a)
    {
        y = a;
        System.out.println("A" + y);
    }
}

class child extends Parent {
//Static members are not inherited with inheritance
    int b;
    public child()
    { 
//      ]=super(5);
        this(7);
        
        System.out.println("B");
    }
    public child(int x)
    {
        super(5);
        System.out.println("B" + x);
    }
}

public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
//        System.out.println("y = " + Child.y);   //Error
    child obj = new child();
    }
}
