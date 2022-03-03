/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arguments;

/**
 *
 * @author rravit
 */

class Box
{
    int i;
    protected int j;
    
    Box(Box ob)
    {
        i = ob.i;
        j = ob.j;
    }
    
    Box (int x, int j)
    {
        i = x;
        j = y;
    }
    
    Box ()
    {
        i = 0;
        j = 0;
    }
    
    int volume ()
    {
        return i * j;
    }
}
    
   
class BoxArea extends Box
{
    int k;
    
    BoxArea(int x, int y, int z)
    {
        i = x;
        j = y;
        k = z;
    }
}

public class inheritance {
    public static void main(String[] args)
    {
        BoxArea ob = new BoxArea(10, 20, 30);
        int i = ob.volume();
        System.out.println(i);
    }
}
