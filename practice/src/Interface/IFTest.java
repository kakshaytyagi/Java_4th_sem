/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Interface;

class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Push an item onto the stack
    public void push(int item) {
        if (tos == stck.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stck[++tos] = item;
        }
    }

    //Pop the item from the stack
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stck[tos--];
        }
    }
}

public class IFTest {

    public static void main(String args[]) {
        // TODO code application logic here
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(7);

        for (int i = 0; i < 7; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 7; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack1 : ");
        for (int x = 0; x < 5; x++) {
            System.out.println(mystack1.pop() + "  ");
        }

        System.out.println("Stack2 : ");
        for (int x = 0; x < 7; x++) {
            System.out.println(mystack2.pop() + "  ");
        }
    }
}
