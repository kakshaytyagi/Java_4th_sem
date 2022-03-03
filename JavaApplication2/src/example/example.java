/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example;

/**
 *
 * @author rravit
 */
public class example {

    public static void main(String[] args) {
        boolean b = true;

        one:
        for (int i = 0; i <= 10; i++) {
            System.out.println("for loop invoked  " + i);
            if (i == 4) {
                if (b) {
                    break one;
                }
            }

        }
        System.out.println("hello world");
    }
}
