/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Interface;

class A {

    public interface NestedIF {

        boolean isNotNegative(int x);
    }

    public A() {
        System.out.println("A is working.");
    }
}

class B implements A.NestedIF {

    public B() {
        System.out.println("B is working.");
    }

    @Override
    public boolean isNotNegative(int x) {
        return (x < 0) ? false : true;
    }
}

public class NestedInterf {

    public static void main(String[] args) {
        A.NestedIF n = new B();

        if (n.isNotNegative(10)) {
            System.out.println("10 is not negative");
        }
        if (n.isNotNegative(-12)) {
            System.out.println("-12 is negative");
        }
    }

}
