/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * WAP to increment the employee salaries on the basis of their designation(Manager-5000,
 * General Manager-10000, CEO-20000, worker-2000). Use employee name, id, designation,
 * salary as data member and inc_sal as member function.
 */

import java.util.Scanner;

class Employee
{
    private String Name;
    private int ID;
    private String dgtn;
    private int salary;
    Scanner s = new Scanner(System.in);
    
    public Employee()
    {
        ID = 0;
        salary = 0;
    }
    
    public void getdata()
    {
        System.out.println("Enter the Name of the Employee : ");
        Name = s.nextLine();
        
        System.out.println("Enter the Designatin : ");
        dgtn = s.nextLine();
        
        System.out.println("Enter the ID: ");
        ID = s.nextInt();
        
        switch(dgtn)
        {
            case "Manager" : salary = 5000;
            break;
            case "CEO" :salary =20000;
            break;
            case "General Manager" : salary = 10000; break;
            case "Worker" : salary = 2000; break;
            default : System.out.println("Enter valid designation.");
        }
    }
    
    public void display()
    {
        System.out.println("Name : " + Name + "\n" + "ID No. : " + ID);
        System.out.print("Designation : " + dgtn + "\n");
        System.out.println("Salary Increment : " + salary ); 
    }
    
}


public class Second {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Employee[] std = new Employee[10];
        int i = 0;
        int j;
        Scanner s1 = new Scanner(System.in);
        do
        {
            Employee s = new Employee();
            
            
            std[++i] = s;
            
            s.getdata();
            System.out.println("Do you wanna one more entry?(y/n)");
            
        }while ("y".equals(s1.next()));
        j = i;
        
        for (i = 1; i <= j; i++)
        {
            std[i].display();
        }
    }
}
