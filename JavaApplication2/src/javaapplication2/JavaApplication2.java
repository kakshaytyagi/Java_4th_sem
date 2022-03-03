// WAP to illustrate default and parameterised constructor concept.
import java.util.Scanner;

class ctor
{
    private int a, b, c;
    Scanner s = new Scanner(System.in);
    
    public ctor()
    {
        a = 0;
        b = 0;
        System.out.println("No argument constructor invoked");
    }
    
    public ctor(int a, int b)
    {
        this.a = a; 
        this.b = b;
        c = a + b;
        System.out.println("two argument constructor invoked");
    }
    
    public void get_val()
    {
        System.out.println("Enter the value of a : ");
        a = s.nextInt();
        System.out.println("Enter the value of b : ");
        b = s.nextInt();
        
        c = a + b;
        
    }
    
    public void put_val()
    {
        System.out.println("Sum of the two number: " + c);
    }
}

public class JavaApplication2 {
    public static void main(String []args)
    {
        ctor c1 = new ctor();
        ctor c3 = new ctor(100, 20);
        
        c1.get_val();
        c1.put_val();
        c3.put_val();
    }
}
