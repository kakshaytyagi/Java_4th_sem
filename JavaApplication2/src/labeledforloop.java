/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rravit
 */
public class labeledforloop {
    public static void main(String[] args) {
        one: for (int i = 0; i < 3; i++)
        {
            two:
            for (int j = 0; j <= 100; j++)
            {
                System.out.println("value is : " + j);
                if (j == 10) break one;
                if (j == 2)
                {
                    System.out.println("value is :" + j);
                    break two;
                }
            }
            System.out.println("out of j loop");
        }
        System.out.println("out of the i loop");
    }
}
