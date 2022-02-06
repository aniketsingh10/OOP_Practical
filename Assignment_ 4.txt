-----------------------------------------------------
Name:Aniket Singh
Title:Area calculation and abstraction
-----------------------------------------------------

import java.util.Scanner;

abstract class shape
{
    double a,b;
    Scanner S1=new Scanner(System.in);
    
    void get_data()
    {
        System.out.println("Enetr value of a:");
         a=S1.nextDouble();
         
        System.out.println("Enetr value of b:");
          b=S1.nextDouble();
    }
    
   abstract void compute_area();
}

class Triangle extends shape
{
    void compute_area()
    {
        double area;
        area=0.5*a*b;
        
         System.out.println("Area of triangle is"+area);
    }
}

class rectangle extends shape
{
    void compute_area()
    {
        double area;
        area=a*b;
        
         System.out.println("Area of rectangle is"+area);
    }
}
public class Assignment4_shape {
    public static void main(String[] args)
    {
        shape A=new Triangle();
        A.get_data();
        A.compute_area();
        A=new rectangle();
        A.get_data();
        A.compute_area();
    }
}

-------------------------------------------------------------
OUTPUT:
-------------------------------------------------------------
Enetr value of a:
3
Enetr value of b:
4
Area of triangle is6.0
Enetr value of a:
4
Enetr value of b:
6
Area of rectangle is24.0
BUILD SUCCESSFUL (total time: 14 seconds)
