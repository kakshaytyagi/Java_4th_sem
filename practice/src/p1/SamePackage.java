/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p1;

/**
 *
 * @author rravit
 */
class SamePackage {
    
    SamePackage()
    {
        Protection p = new Protection();
        System.out.println("samePackage constructor");
        System.out.println("n = " + p.n);
//        System.out.println("n_pri = " + p.n_pri);     // Error because of private access specifier
        System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
        
    }
}
