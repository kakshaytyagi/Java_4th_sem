/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arguments;

/**
 *
 * @author rravit
 */

class PassArray
{
    static void vaTest(int v[])
    {
        System.out.print("NUMBER OF ARGS: " + v.length + " Content : " );
        
        for (int i : v)
        {
            System.out.print(i + "  ");
            System.out.println();
        }
    }
}
public class varoldargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] n1 = { 10 };
        int[] n2 = { 1, 2, 3, 4, 5 };
        int[] n3 = { };
        
        PassArray.vaTest(n1);
        PassArray.vaTest(n2);
        PassArray.vaTest(n3);
    }
    
}
