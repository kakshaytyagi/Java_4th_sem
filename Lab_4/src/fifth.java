/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

interface I1 {

    void sum();
}

interface I2 {

    void multiply();
}

interface I3 {

    void area();
}

class A implements I1, I2 {

    public void sum() {
        System.out.println("sum function overridden calls");
    }

    public void multiply() {
        System.out.println("multiply function override calls");
    }
}

class B extends A {

    public void area() {
        System.out.println("area function override calls");
    }
}

public class fifth {

    public static void main(String args[]) {
        B b = new B();
        I1 i1 = new A();
        I2 i2 = new B();
        A a = new A();

        System.out.println("instance of B class");
        b.area();
        b.multiply();
        b.sum();

        System.out.println("instance of I1 interface");
        i1.sum();

        System.out.println("instance of I2 interface");
        i2.multiply();

        System.out.println("instance of A class");
        a.sum();
    }
}
