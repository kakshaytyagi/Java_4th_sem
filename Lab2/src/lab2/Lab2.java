/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

class Area {

    private double a;
    private double pie;
    private double p;

    public Area() {
        pie = 3.14;
    }

    public void ara(double R) {
        a = pie * R * R;
        System.out.println("Area of the Circle :" + a);
    }

    public void paramtr(double R) {
        p = 2 * pie * R;
        System.out.println("Perimeter of Circle : " + p);
    }
}

public class Lab2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Area a = new Area();

        System.out.println("Enter the Radius of the Circle : ");
        double r = s.nextDouble();

        a.ara(r);
        a.paramtr(r);
    }
}
//WAP to take radius from user and find area, perimeter of circle.
