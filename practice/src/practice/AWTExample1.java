/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package practice;

// importing Java AWT class  
import java.awt.*;

// extending Frame class to our class AWTExample1  
public class AWTExample1 extends Frame {

    // initializing using constructor  
    AWTExample1() {

        // creating a button   
        Button b = new Button("Click Me!!");

        // setting button position on screen  
        b.setBounds(30, 100, 80, 30);

        // adding button into frame    
        add(b);
        
        //creating label
        Label l = new Label("Hello Akshay!");
        
        //setting label postion on screen;
        l.setBounds(10, 35, 56, 88);
        
        
        //addding label into frame
        add(l);

        // frame size 300 width and 300 height    
        setSize(300, 300);

        // setting the title of Frame  
        setTitle("This is our basic AWT example");

        // no layout manager   
        setLayout(null);

        // now frame will be visible, by default it is not visible    
        setVisible(true);
    }

// main method  
    public static void main(String args[]) {

// creating instance of Frame class   
        AWTExample1 f = new AWTExample1();

    }

}
