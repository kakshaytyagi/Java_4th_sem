/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Interface;

interface I1 {

    void setdata();

    default void str() {
        System.out.println("I1 exicuted");
    }
}

interface I2 extends I1 {

    void setdata2();

    @Override
    default void str() {
        System.out.println("I2 exicuted");
    }
}

interface I3 extends I1 {

    void setdata3();

    @Override
    default void str() {
        System.out.println("I3 exicuted");
    }
}

interface I4 extends I2, I3 {

    @Override
    default void str() {
        System.out.println("I4 exicuted");
    }
}

class A implements I4 {
    @Override
    public void setdata(){
        
    }
    @Override
    public void setdata2(){
        
    }
    @Override
    public void setdata3(){
        
    }
}

public class MultiInheritance {

    public static void main(String args[]) {
        A a = new A();
        a.setdata();
//        a.str();  

    }
    
}
