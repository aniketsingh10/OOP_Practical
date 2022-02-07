-----------------------------------------------------
Name:Aniket Singh
Title:Employee Salary Calculation
-----------------------------------------------------

//inheritance

class employee{
String Name;
int id;
String email;
int Gross_Salary,Net_Salary,BPay,PF,DA,HRA,Club_fund;

void calculate_Salary()
{
    DA=BPay*86/100;
    HRA=BPay*4/100;
    PF=BPay*10/100;
    Club_fund=(int)(BPay*0.1/100);
    Gross_Salary =BPay+DA+HRA+PF+Club_fund;
    Net_Salary=BPay+DA+HRA-PF-Club_fund;
    System.out.println("Gross Salary is"+Gross_Salary);
    System.out.println("Net Salary is"+Net_Salary);

}

}

class Programmer extends employee
{
void SetBPay()
{
    BPay=15000;
}
}
class Team_Lead extends employee
{
void SetBPay()
{
    BPay=12000;
}
}
class Assistant_Project_Manager extends employee
{
void SetBPay()
{
    BPay=18000;
}
}
class Project_Manager extends employee
{
void SetBPay()
{
    BPay=20000;
}
}

public class Assignment3_employee {

   
    public static void main(String[] args) {
    Programmer xyz= new Programmer();
     xyz.SetBPay();
     xyz.calculate_Salary();
     
     Team_Lead abc=new Team_Lead();
     abc.SetBPay();
     abc.calculate_Salary();
     
     Assistant_Project_Manager pqr=new Assistant_Project_Manager();
     pqr.SetBPay();
     pqr.calculate_Salary();
     
     Project_Manager tuv=new Project_Manager();
     tuv.SetBPay();
     tuv.calculate_Salary();
   
    }   
}
-------------------------------------------------------------
OUTPUT:
-------------------------------------------------------------

Gross Salary is 30015
Net Salary is 26985
Gross Salary is 24012
Net Salary is 21588
Gross Salary is 36018
Net Salary is 32382
Gross Salary is 40020
Net Salary is 35980
BUILD SUCCESSFUL (total time: 0 seconds)
