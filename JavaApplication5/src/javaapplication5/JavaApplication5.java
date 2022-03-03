/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author rravit
 */

class Example
{
    int x;  //instance variable
    static int y;   // static member variable

    public void fun1(int l)
    {
        x = l;
        System.out.println("instance function");
    }

    public int fun_1()
    {
        return x;
    }

    public static void fun2(int r)
    {
        y = r;
        System.out.println("static member function");
    }

    public static int fun_2()
    {
        return y;
    }

    static class Box
    {
        public static String xbx = "Akshay Tyagi";
        static int y = 1900;
    }
}




public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Example e1 = new Example();
        Example e2 = new Example();

        Example.fun2(999);  //static function calling using class name with dot
        System.out.println(Example.fun_2());
        
        e1.fun1(3434);
        System.out.println(e1.fun_1());

        e2.fun1(8989);
        System.out.println(e2.fun_1());

        System.out.println(Example.Box.xbx);
        System.out.println(Example.Box.y);
    }
    
}
