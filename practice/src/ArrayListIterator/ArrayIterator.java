/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ArrayListIterator;

import java.util.*;

public class ArrayIterator {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Akshay");
        list.add("Karityia");
        list.add("shiva");

         Iterator itr=list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println(list);
    }
}
