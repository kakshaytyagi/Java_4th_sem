/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lambdaexpression;

/**
 *
 * @author rravit
 */
interface operation{
    public int perform(int x, int y);
}

class Demo
{
    public void actn(operation t)
    {
        System.out.println(t.perform(20, 10));
        System.out.println("hello");
    }
}
public class LambdaExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        operation x = (i,j)-> i+j;
        Demo obj = new Demo();
        obj.actn(x);
        
        x = (i,j)-> i*j;
        obj.actn(x);
    }
    
}
