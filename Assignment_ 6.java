-----------------------------------------------------
Name:Aniket Singh
Roll no:59
Title:Exception Handling
-----------------------------------------------------

package assignment6;
import java.util.Scanner;
class Exdemo {  
        int a,b,ans;
        int num[]=new int[3];
        Scanner sc=new Scanner(System.in);
        void getdata(){
        System.out.println("Enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
        void division(){
        ans=a/b;
        System.out.println("Result "+ans );
        
    }
       void Arraycheck(){
        int index;
        num[0]=150;
        num[1]=250;
        num[2]=300;
        System.out.println("Enter the index number to acces data from array");
        index=sc.nextInt();
       System.out.println("Value at index "+index + "is"+num[index]);
       
    }
}

public class Assignment6{
    public static void main(String[] args){
        
        Exdemo obj=new Exdemo();
        try{
            obj.getdata();
        }
        catch(Exception d){
            System.out.println("Error");
        }
        try{
            obj.division();
        }
        catch(ArithmeticException E){
            System.out.println("Error in arrithmetic expression is");
        }
        try{
            obj.Arraycheck();
        }
        catch(ArrayIndexOutOfBoundsException A){
            System.out.println("Array index out of bound exception");
        }
    }
}

------------------------------------------------------------------------------
OUTPUT:
    
Enter two numbers

20
0
Error in arrithmetic expression is
Enter the index number to acces data from array
------------------------------------------------------------------------------
