/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author rravit
 */
class OtherPackage {
    OtherPackage()
    {
        p1.Protection p = new p1.Protection();
        System.out.println("Other Package from p2");
//        System.out.println("n =" + p.n);  // Access class and package only
//        System.out.println("n_pri = " + p.n); // access only class
//        System.out.println("n_pro = " + p.n_pro);     // access only class, package , subclass
        System.out.println("n_pub = " + p.n_pub);
        
    }
}
