/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringclasses;

/**
 *
 * @author rravit
 */
public class Stringclasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = new String("Computer");
        String s2 = s1.toUpperCase();
        
        System.out.println(s2);
        s2 = s1.toLowerCase();
        System.out.println(s2);
        
        int i = s1.indexOf("put", 3);
        System.out.println(i);
        
        i = s1.lastIndexOf('p');
        System.out.println("last index of char: " + i);
        
        
        String s3 = new String("computer");
        if (s1.equals(s3))
            System.out.println("String are same");
        else
            System.out.println("Not same");
        
        
        if (s1.equalsIgnoreCase(s3))
            System.out.println("String are same");
        else
            System.out.println("not same");
        
       i = s1.compareTo(s3);
        System.out.println("mismatch charater index : " + i);
        
        if (i == 0)
            System.out.println("String are same");
        else if (i > 0)
            System.out.println("dictonary order");
        else
            System.out.println("opposite in disctonary order");
        
        
        String s4 = s1.substring(3);
        System.out.println(s4);
        
        String s5 = s1.substring(2,5);
        System.out.println(s5);
        
        System.out.println(s1.length());
        System.out.println(s1.charAt(4));
        
        System.out.println(s1.startsWith("Comp"));
        System.out.println(s1.endsWith("ter"));
        
        String st1 = s1.replace("omp", "x");
        System.out.println(st1);
        
        String st2 = new String("        Akshay              ");
        System.out.println(st2.trim());
    }
    
}
