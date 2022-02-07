-----------------------------------------------------
Name:Aniket Singh
Title:Interface
-----------------------------------------------------

interface vehicle
{
    void gear_up();
    void speed_up();
    void Apply_Breaks();
}

 class Bicycle implements vehicle
{
    public void gear_up()
    {System.out.println("GEar change for bicycle is activated");}
    
      public void speed_up()
    {System.out.println("Speed up for bicycle is activated");}
      
        public void Apply_Breaks()
    {System.out.println("Apply breaks for bicycle is activated");}
}

 class Bike implements vehicle
{
    public void gear_up()
    {System.out.println("GEar change for bike is activated");}
    
      public void speed_up()
    {System.out.println("Speed up for bike is activated");}
      
        public void Apply_Breaks()
    {
        System.out.println("Apply breaks for bike is activated");
    }
}

 class Car implements vehicle
{
    public void gear_up()
    {
        System.out.println("GEar change for Car is activated");
    }
    
      public void speed_up()
    {
        System.out.println("Speed up for Car is activated");
    }
      
        public void Apply_Breaks()
    {
        System.out.println("Apply breaks for Car is activated");
    }
}
public class Assignment5_interfaceVehicle {
    public static void main(String[] args)
    {
        Bicycle A=new Bicycle();
        Bike B=new Bike();
        Car C=new Car();
        
        A.gear_up();
        A.speed_up();
        A.Apply_Breaks();
        
        B.gear_up();
        B.speed_up();
        B.Apply_Breaks();
        
        C.gear_up();
        C.speed_up();
        C.Apply_Breaks();
    } 
}
-------------------------------------------------------------
OUTPUT:
-------------------------------------------------------------
GEar change for bicycle is activated
Speed up for bicycle is activated
Apply breaks for bicycle is activated
GEar change for bike is activated
Speed up for bike is activated
Apply breaks for bike is activated
GEar change for Car is activated
Speed up for Car is activated
Apply breaks for Car is activated
BUILD SUCCESSFUL (total time: 0 seconds)
