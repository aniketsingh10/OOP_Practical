/*
--------------------------------------------------------------------------------------
Name    : Aniket Singh
Title   : Templete
---------------------------------------------------------------------------------------
*/

import java.util.*;
class Generic_Demo
{
   
    void checkevenodd(int d)
    {
       int temp;
       temp=d%2;
       if(temp==0)
       {
           System.out.println("Number is even");
       }
       else
       {
           System.out.println("Number is odd");
       }
    }
    
    void checkprime(int x)
    {
        int i;
        int temp1;
        int flag=0;
        for(i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                flag=1;
                System.out.println("Number is not prime");
            }
        }
        if(flag==0)
        {
            System.out.println("Number is prime");
        }
    }
    
    void palindrome(String x)
    {
        Scanner sc=new Scanner(System.in);
        String a,b=" ";
        a=x;
        int length=a.length();
        for(int i=length-1;i>=0;i--)
            b=b+a.charAt(i);
        
        if(a.equals(b))
            System.out.println(a+"is palindrome");
        else
            System.out.println(a+"is not palindrome");

    }
}

public class Template
{
    public static void main(String[] args)
    {
        int a,b;
        Generic_Demo gd=new Generic_Demo();
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);

        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter Numbers Do You Want to Add:");
        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter Numbers:");
            list.add(sc.nextInt());
        }
       
        ArrayList<String> list1=new ArrayList<String>();
       System.out.println("Enter Numbers Do You Want to check for palindrome:");
        b=sc.nextInt();
        for(int i=0;i<b;i++)
        {
            System.out.println("Enter Numbers:");
            list1.add(sc1.nextLine());
        }
       
        for(int i=0;i<list.size();i++)
        {
           gd.checkevenodd(list.get(i));
           gd.checkprime(list.get(i));
        }
        for(int i=0;i<list1.size();i++)
        {
            gd.palindrome(list1.get(i));
        }
    }
}


/*
---------------------------------------------------------------------------------------------
OUTPUT :
---------------------------------------------------------------------------------------------
 
Enter Numbers Do You Want to Add:
3
Enter Numbers:
5
Enter Numbers:
65
Enter Numbers:
46
Enter Numbers Do You Want to check for palindrome:
3
Enter Numbers:
124
Enter Numbers:
654
Enter Numbers:
324
Number is odd
Number is prime
Number is odd
Number is not prime
Number is not prime
Number is even
Number is not prime
Number is not prime
124is not palindrome
654is not palindrome
324is not palindrome

*/
