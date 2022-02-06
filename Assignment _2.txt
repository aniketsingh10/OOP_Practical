-----------------------------------------------------
Name:Aniket Singh
Title:Book Shop
-----------------------------------------------------

package assignment2_book;
import java.util.Scanner;

class publication
{
    String title;
    double price;
    int copies;
    
    Scanner S=new Scanner(System.in);
    static int total_sale;
    
    void salecopy()
    {
        
        System.out.println("How many copies do you want");
        int demand=S.nextInt();
        if (copies>=demand){
            double bill=demand*price;
            copies=copies-demand;
            System.out.println("Final bill ammount is"+bill);
        }
        else
        {
        System.out.println("Insufficient quantity");            
        }
     }
}  
class book extends publication{
    
    String author;
            Scanner input=new Scanner(System.in);

   static int total_order;
     void ordercopies()
    {
        System.out.println("How many copies do you want");
        int order_Quantities=input.nextInt();
        copies=copies+order_Quantities;
        total_order=total_order+order_Quantities;
    }
     
     void getbookdata()
  {
    System.out.println("Enter Author name:");
    author=input.nextLine();
    System.out.println("Enter book title:");
    title=input.nextLine();
    System.out.println("Enter book price");
    price=input.nextInt();
    System.out.println("enter copies");
    copies=input.nextInt();
  }

  void displaybookdata()
{
    System.out.println("Author is"+author);
    System.out.println("Title is"+title);
    System.out.println("Price is"+price);
    System.out.println("Number of copies are"+copies);
}
}
class magzine extends publication{
    int issue_number;
        Scanner input=new Scanner(System.in);
   static int total_order;
    void orderissue()
    {
        System.out.println("How many copies do you want");
        int order_Quantities=input.nextInt();
        copies=copies+order_Quantities;
        total_order=total_order+order_Quantities;
    }
    
void getmagzinedata()
{

System.out.println("Enter magzine title:");
title=input.nextLine();
System.out.println("Enter issue number");
issue_number=input.nextInt();
System.out.println("Enter magzine price");
price=input.nextInt();
System.out.println("enter copies");
copies=input.nextInt();

}

void displaymagzinedata()
{
    System.out.println("Title is"+title);
    System.out.println("Price is"+price);
    System.out.println("Number of copies are"+copies);
    System.out.println("Issue number is"+issue_number);
    
}
}

public class Assignment2_book {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        book arr[]=new book[10];
        
         System.out.println("how many books");
         int no_of_books=input.nextInt();
         
         for(int i=0;i<no_of_books;i++)
         {
             arr[i]=new book();
             arr[i].getbookdata();
             arr[i].displaybookdata();
         }
         
         int ans1;
         do
         {
             System.out.println("enter the choice 1.sale book 2.Give order for book 3.get total sale 4.get total order");
             int b_choice=input.nextInt();
             switch(b_choice)
             {
                 case 1:
                     String sale_name="OOP";
                     int flagb1=0;
                     for (int i=0;i<no_of_books;i++)
                     {
                         if(sale_name.compareTo(arr[i].title)==0)
                         {
                           System.out.println("found");
                           arr[i].salecopy();
                           flagb1=1;
                           break;
                         }
                     }
                     if(flagb1==0)
                         break;
                     
                 case 2:
                     int flagb=0;
                     String order_name="OOP";
                     for(int i=0;i<no_of_books;i++)
                     {
                         if(order_name.compareTo(arr[i].title)==0)
                         {
                             System.out.println("book found");
                             arr[i].ordercopies();
                             flagb=1;
                             break;
                         }
                     }
                     break;
                     
                 case 3:
                     System.out.println("Total SALe:"+book.total_sale);
                     break;
                     
                 case 4:
                     System.out.println("Total Order:"+book.total_order);
                     break;
             }
             System.out.println("Do you want to continue,press 100");
             ans1=input.nextInt();
         }
         while(ans1==100);
         
          magzine arr1[]=new magzine[10];
        
         System.out.println("how many magzines");
         int no_of_magzines=input.nextInt();
         
         for(int i=0;i<no_of_magzines;i++)
         {
             arr1[i]=new magzine();
             arr1[i].getmagzinedata();
             arr1[i].displaymagzinedata();
         }
         
         int ans2;
         do
         {
             System.out.println("enter the choice 1.sale magtzine 2.Give order for magzine 3.get total sale 4.get total order");
             int m_choice=input.nextInt();
             switch(m_choice)
             {
                 case 1:
                     String sale_name="OOP";
                     int flagm1=0;
                     for (int i=0;i<no_of_magzines;i++)
                     {
                         if(sale_name.compareTo(arr1[i].title)==0)
                         {
                           System.out.println("found");
                           arr1[i].salecopy();
                           flagm1=1;
                           break;
                         }
                     }
                     if(flagm1==0)
                         System.out.println("not found");
                         break;
                     
                 case 2:
                     int flag=0;
                     String order_name="OOP";
                     for(int i=0;i<no_of_magzines;i++)
                     {
                         if(order_name.compareTo(arr1[i].title)==0)
                         {
                             System.out.println("book found");
                             arr1[i].orderissue();
                            flag=1;
                             break;
                         }
                     }
                     break;
                     
                 case 3:
                     System.out.println("Total SALe:"+magzine.total_sale);
                     break;
                     
                 case 4:
                     System.out.println("Total Order:"+magzine.total_order);
                     break;
             }
             System.out.println("Do you want to continue,press 100");
             ans2=input.nextInt();
         }
         while(ans2==100);
                 
    }
    
    
}
