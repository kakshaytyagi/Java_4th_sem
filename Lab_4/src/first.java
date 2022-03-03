/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * WAP a program to maintain the student record containing roll number , 
 * Name, marks1, marks2, marks3 as data member and getdata(), display() 
 * and setdata() as member functions.
 */
import java.util.Scanner;

class student
{
    private String Name;
    private int rollno;
    private int marks1;
    private int marks2;
    private int marks3;
    private int totl;
    Scanner s = new Scanner(System.in);
    
    public student()
    {
        rollno = 0;
        marks1 = 0;
        marks2 = 0;
        marks3 = 0;
    }
    
    public void getdata()
    {
        System.out.print("Enter the Name of the student : ");
        Name = s.nextLine();
        System.out.println("");
        
        System.out.print("Enter the Roll No.: ");
        rollno = s.nextInt();
        System.out.println("");
        
        System.out.print("Enter the 1st subject marks : ");
        marks1 = s.nextInt();
        System.out.println("");
        
        System.out.print("Enter the 2nd subject marks : ");
        marks2 = s.nextInt();
        System.out.println("");
        
        System.out.print("Enter the 3rd subject marks : ");
        marks3 = s.nextInt();
        System.out.println("");
    }
    
    public void display()
    {
        System.out.println("Name : " + Name + "\n" + "Roll No. : " + rollno);
        System.out.print("Physics : " + marks1 + "\n");
        System.out.print("Maths : " + marks2 + "\n");
        System.out.println("Chemistry : " + marks3 + "\n");
    }
    
    public void setdata()
    {
        totl = marks1 + marks2 + marks3;
        System.out.println("Total Score : " + totl + "\n\n"); 
    }
}


public class first {

    public static void main(String args[]) {
        
        student[] std = new student[10];
        int i = 0;
        int j;
        Scanner s1 = new Scanner(System.in);
        do
        {
            student s = new student();
            
            
            std[++i] = s;
            
            s.getdata();
            System.out.println("Do you wanna one more entry?(y/n)");
            
        }while ("y".equals(s1.next()));
        j = i;
        
        System.out.println("\n\n\n");
        
        for (i = 1; i <= j; i++)
        {
            std[i].display();
            std[i].setdata();
        }
    }
}
