/*
Name :- Aniket Singh
Assignment 8 :- File Handling

Problem Statement:-
  Implement a program for maintaining a student records database using File Handling. 
  Student has Student_id, name, Roll_no, Class, marks and address. Display the data 
  for five  students. 
*/

import java.io.*; 
import java.util.*; 

class Database {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	//creating bufferredReder class object
	// ---------------------- addRecords method ---------------------- //
	public void addRecords() throws IOException  {
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sample.txt",true)));
		String studentname, address,s;
		int studentid, rollno, Class;
		float marks;
		boolean addMore = false;
		do  {   
			System.out.print("\nEnter Student Name: ");
			studentname = br.readLine();  
			System.out.print("Student Id: "); 
			studentid = Integer.parseInt(br.readLine()); 
			System.out.print("Roll no: ");
			rollno = Integer.parseInt(br.readLine()); 
			System.out.print("Address: ");  
			address = br.readLine();  
			System.out.print("Class: ");
			Class = Integer.parseInt(br.readLine());  
			System.out.print("Marks : ");  
			marks = Float.parseFloat(br.readLine());
			  pw.println(studentname+" "+studentid+" "+rollno+" "+address+" "+Class+" "+marks);
			  System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : "); 
			  s = br.readLine();
			  if(s.equalsIgnoreCase("y")){  
				  addMore = true;
				  System.out.println();
				  }  
			  else  
				  addMore = false; 
		}
		while(addMore); 
		 pw.close(); 
		}
	public void readRecords() throws IOException  {
		try  {   
			BufferedReader file = new BufferedReader(new   FileReader("sample.txt")); 
			String name;
			int i=1;
			while((name = file.readLine()) != null)   {
				System.out.println(name);
				System.out.println("");   
				}   file.close(); 
		} 
		catch(FileNotFoundException e){ //Exception handling
			System.out.println("\nERROR : File not Found !!!");
		}  
	}
	public void searchRecords() throws IOException  {
		try  {   
			BufferedReader file = new BufferedReader(new   FileReader("sample.txt")); 
			String name;
			int flag=0; 
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter an id of the student you want to search: "); 
			String searchname=sc.next(); 
			while((name = file.readLine()) != null)   {   
				String[] line = name.split(" "); 
				if(searchname.equalsIgnoreCase(line[1])){   
					System.out.println("Record found");    
					System.out.println(name);  
					System.out.println("");  
					flag=1;    
					break;   
					}  
				} 
			if(flag==0)    
				System.out.println("Record not found"); 
			file.close();  
			}
		catch(FileNotFoundException e)  {
			System.out.println("\nERROR : File not Found !!!");
			}
		}  
	public void deleteRecords() throws IOException  {
		try  { 
			BufferedReader file1 = new BufferedReader(new FileReader("sample.txt")); 
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("new.txt",true)));
			String name;  
			int flag=0; 
			Scanner sc=new Scanner(System.in); //creating obj of scanner class
			System.out.print("Enter the name of the student you want to delete: ");  
			String searchname=sc.next();  
			while((name = file1.readLine()) != null)   {     
				String[] line = name.split(" ");     
				if(!searchname.equalsIgnoreCase(line[0])){
					pw.println(name);  
					flag=0; //modify value    
				}  
				else{  
					System.out.println("Record found");  //printing on console
					flag=1;
				}  
				}   file1.close();
				pw.close(); 
				File delName =  new File("sample.txt");
				File oldName =  new File("new.txt");   
				File newName =   new File("sample.txt");      	
				if(delName.delete())        
					System.out.println("deleted successfully");      
				else         
					System.out.println("Error");	
				if (oldName.renameTo(newName))           
					System.out.println("Renamed successfully");   
				else         
					System.out.println("Error");
		} 
		catch(FileNotFoundException e)  {//Exception handling
			System.out.println("\nERROR : File not Found !!!");  
			} 
		} 
	public void updateRecords() throws IOException  {
		try  {  
			BufferedReader file1 = new BufferedReader(new FileReader("sample.txt"));  
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("new.txt",true))); 
			String name;
			int flag=0;   
			Scanner sc=new Scanner(System.in); 
			System.out.print("Enter the name of the student you want to update: ");  
			String searchname=sc.next();  
			while((name = file1.readLine()) != null)   {  
			String[] line = name.split(" ");
			if(!searchname.equalsIgnoreCase(line[0])){   
				pw.println(name);       
				flag=0;   
					} 
				else   
					{    
				System.out.println("Record found");  
				System.out.print("Enter updated marks: "); 
				String up_mark=sc.next();  
				pw.println(line[0]+" "+line[1]+" "+line[2]+" "+line[3]+" "+line[4]+" "+up_mark);   
				flag=1; 
				}     
				} 
			file1.close(); 
				pw.close();   
				File delName =  new File("sample.txt");
				File oldName =  new File("new.txt");   
				File newName =   new File("sample.txt");  
				if(delName.delete())       
					System.out.println("record updated successfully"); 
				else     
					System.out.println("Error"); 
				if (oldName.renameTo(newName))       
					System.out.println("Renamed successfully");    
					System.out.println("Error");  
				}  
		catch(FileNotFoundException e)  {  
			System.out.println("\nERROR : File not Found !!!"); 
			} 
		} 		
	public void clear(String filename) throws IOException  { 
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename)));
		pw.close(); 
		System.out.println("\nAll Records cleared successfully !"); 
		} 
}

// ========================= MAIN CLASS =========================//
public class Filehandling{
	public static void main(String args[]) throws IOException  {  
		Database f = new Database();
		Scanner sc =new Scanner(System.in);
		System.out.println("");
		while(true) {
		System.out.print("1. Add Records\n2. Display Records\n3. Clear All Records\n4. Search Records"
				+ "\n5. Delete Records\n6. Update Records \n7. Exit\n\nEnter your choice : ");
		int choice = sc.nextInt();
		System.out.println("");
		switch(choice)  {   
		case 1:  
			f.addRecords(); 
			System.out.println("\n===================\n");
			break;  
		case 2:  	
			f.readRecords();
			System.out.println("\n===================\n");
			break;  
		case 3:  
			f.clear("sample.txt");
			System.out.println("\n===================\n");
			break;
		case 4:   
			f.searchRecords(); 
			System.out.println("\n===================\n");
			break; 
		case 5:    
			f.deleteRecords();
			System.out.println("\n===================\n");
		        break;    
		case 6:    
			f.updateRecords(); 
			System.out.println("\n===================\n");
			break;  
		case 7:  
			System.out.println("\n===================\n");
			System.exit(0);
		        break;  	
		default:  
			System.out.println("\nInvalid Choice !");
			System.out.println("\n===================\n");
			break; 
			} 
		}
	}    
}
/*
 
------------------------- OUTPUT -----------------------------------

1. Add Records
2. Display Records
3. Clear All Records
4. Search Records
5. Delete Records
6. Update Records 
7. Exit
Enter your choice : 1
Enter Student Name: Aniket
Student Id: 12
Roll no: 12
Address: pune
Class: 10
Marks : 489
Records added successfully !
Do you want to add more records ? (y/n) : y
Enter Student Name: om
Student Id: 34
Roll no: 34
Address: jalgaon
Class: 9
Marks : 479
Records added successfully !
Do you want to add more records ? (y/n) : y
Enter Student Name: yash
Student Id: 67
Roll no: 67
Address: Aurangabad
Class: 9
Marks : 467
Records added successfully !
Do you want to add more records ? (y/n) : y
Enter Student Name: Raj
Student Id: 76
Roll no: 76
Address: Dhule
Class: 10
Marks : 495
Records added successfully !
Do you want to add more records ? (y/n) : y
Enter Student Name: Harsh
Student Id: 39
Roll no: 39
Address: Satara
Class: 11
Marks : 481
Records added successfully !
Do you want to add more records ? (y/n) : n
====================================================
1. Add Records
2. Display Records
3. Clear All Records
4. Search Records
5. Delete Records
6. Update Records 
7. Exit
Enter your choice : 2
Aniket12 12 pune 10 489.0
om 34 34 jalgaon 9 479.0
yash 67 67 Aurangabad 9 467.0
Raj 76 76 Dhule 10 495.0
Harsh 39 39 Satara 11 481.0
====================================================
1. Add Records
2. Display Records
3. Clear All Records
4. Search Records
5. Delete Records
6. Update Records 
7. Exit
Enter your choice : 4
Enter an id of the student you want to search: 34
Record found
om 34 34 jalgaon 9 479.0
====================================================
1. Add Records
2. Display Records
3. Clear All Records
4. Search Records
5. Delete Records
6. Update Records 
7. Exit
Enter your choice : 5
Enter the name of the student you want to delete: om
Record found
deleted successfully
Renamed successfully
====================================================
1. Add Records
2. Display Records
3. Clear All Records
4. Search Records
5. Delete Records
6. Update Records 
7. Exit
Enter your choice : 6
Enter the name of the student you want to update: Aniket
Record found
Enter updated marks: 500
record updated successfully
Renamed successfully
====================================================
1. Add Records
2. Display Records
3. Clear All Records
4. Search Records
5. Delete Records
6. Update Records 
7. Exit
Enter your choice : 3
All Records cleared successfully !
====================================================
1. Add Records
2. Display Records
3. Clear All Records
4. Search Records
5. Delete Records
6. Update Records 
7. Exit
Enter your choice : 7
====================================================
*/
