/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package arguments;

/**
 *
 * @author rravit
 */

class PassArray
{
    static void vaTest(int... v)
    {
        System.out.print("NUMBER OF ARGS: " + v.length + " Content : " );
        
        for (int i : v)
        {
            System.out.print(i + "  ");
        }
    }
    
    static void vaTest(String... v)
    {
        for (String i : v)
        System.out.println("Name : " + i);
    }
}

public class argspara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PassArray.vaTest( 10, 2, 3, 4);
        PassArray.vaTest(34,65, 21, 66);
        PassArray.vaTest("Akshay");
    }
}
