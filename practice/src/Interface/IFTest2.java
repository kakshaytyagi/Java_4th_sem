/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Interface;

class DynStack implements IntStack {

    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    //Push an item onto the stack
    public void push(int item) {
        if (tos == stck.length - 1) {
            int tem[] = new int[stck.length * 2];
            for (int i = 0; i < stck.length; i++) {
                tem[i] = stck[i];
            }
            stck = tem;
            stck[++tos] = item;
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

public class IFTest2 {

    public static void main(String args[]) {
        // TODO code application logic here
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(7);

        for (int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        for (int i = 0; i < 20; i++) {
            mystack2.push(i);
        }

        System.out.println("Stack1 : ");
        for (int x = 0; x < 15; x++) {
            System.out.println(mystack1.pop() + "  ");
        }

        System.out.println("Stack2 : ");
        for (int x = 0; x < 26; x++) {
            System.out.println(mystack2.pop() + "  ");
        }
    }
}
