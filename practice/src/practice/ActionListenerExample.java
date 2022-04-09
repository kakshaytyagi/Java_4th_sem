/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package practice;

import java.awt.*;
import java.awt.event.*;
//1st step  

public class ActionListenerExample implements ActionListener {

    public static void main(String[] args) {
        Frame f = new Frame("ActionListener Example");
        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        //2nd step  
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
//3rd step  

    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome to Javatpoint.");
    }
}
