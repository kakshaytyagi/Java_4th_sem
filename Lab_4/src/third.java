/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *Calculate area of different geometrical figures(circle, rectangle,square, triangle)
 * using function overloading.
 */

class Area
{
    private final double pie = 3.14;
    private double height;
    private double breadth;
    private double length;
    private double radius;
    private double a;
    
    public Area()
    {
        height = 0;
        breadth = 0;
        length = 0;
        radius = 0;
    }
    
    public void ara(double r)
    {
        a = pie * r * r;
        System.out.println("Area of the circle: " + a);
    }
    
    public void ara(double h, double b, double l)
    {
        a = l * h * b;
        System.out.println("Area of the Rectangle: " + a);
    }
    
    public void ara(int r)
    {
        a = r * r * r;
        System.out.println("Area of the Square: " + a);
    }
    
    public void ara(double l, double b)
    {
        a = 0.5 * l * b;
        System.out.println("Area of the Triangle: " + a);
    }
    
}
public class third {

    public static void main(String args[]) {
        
        Area a1 = new Area();
        
        //Area of the circle
        a1.ara(10.5);
        
        //Area of the square
        a1.ara(5);
        
        //Area of the Rectangle
        a1.ara(10.5, 8.99, 9);
        
        //Area of the Triangle
        a1.ara(10.5, 10.5);
    }
}
