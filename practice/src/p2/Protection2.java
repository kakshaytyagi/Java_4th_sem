/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p2;

/**
 *
 * @author rravit
 */
public class Protection2 extends p1.Protection {
    Protection2()
    {
        System.out.println("Drived other package constructor (protection2)");
        //class and package only
//        System.out.println("n = " + n);
//class only
//        System.out.println("n_pri = " + n_pri);
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
