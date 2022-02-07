-----------------------------------------------------
Name:Aniket Singh
Title: Operations on Complex Number
-----------------------------------------------------


package ComplexNo;

import java.util.Scanner;

class complex
{
    double real,img;
    Scanner sc=new Scanner(System.in);
    complex(double a,double b)
    {
        real=a;
        img=b;
    }
    void getdata()
    {
         System.out.println("Enter real part of no");
         real=sc.nextDouble();
          System.out.println("Enter imaginary part of no");
         img=sc.nextDouble();
    }
   
     void Show_Complex()
    {
        System.out.println("complex no is:"+real+"+"+img+"i");
    }
     
     void add_complex(complex c1,complex c2)
     {
         real=c1.real+c2.real;
         img=c1.img+c2.img;
         
         System.out.println("Addition is:"+real+"+"+img+"i");
     }
      void substract_complex(complex c1,complex c2)
     {
         real=c1.real-c2.real;
         img=c1.img-c2.img;
         
         System.out.println("Substraction is:"+real+"-"+img+"i");
     }
      
}
 
public ComplexNo {
    public static void main(String[] args) {
        complex A=new complex(2,5);
         complex B=new complex(9,5);
        complex C=new complex(1,2);
        
         A.getdata();
         B.getdata();
         A.Show_Complex();
         B.Show_Complex();
         
         C.add_complex(A,B);
         C.Show_Complex();
         C.substract_complex(A, B);
         C.Show_Complex();
    }
}



-------------------------------------------------------------
OUTPUT:
-------------------------------------------------------------
Enter real part of no
2
Enter imaginary part of no
3
Enter real part of no
4
Enter imaginary part of no
5
complex no is:2.0+3.0i
complex no is:4.0+5.0i
Addition is:6.0+8.0i
complex no is:6.0+8.0i
Substraction is:-2.0--2.0i
complex no is:-2.0+-2.0i
BUILD SUCCESSFUL (total time: 8 seconds)
