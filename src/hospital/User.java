package hospital; 
import java.util.Scanner;

public class User {
	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//User can be receptionist, patient or a doctor
		System.out.println("******** Welcome to the Hospital Management System! ********");
		System.out.println("Enter your choice:");
		System.out.println(" 1 - Receptionist \n 2 - Patient \n 3 - Doctor");
		
        int choice = sc.nextInt();
        
        
    do{
		   switch(choice)
		   {        
		         case 1: Receptionist r = new Receptionist();
		           r.Choice();
		          break;
		         case 2: Patient p = new Patient();
		           p.Choice();
		       break;
		         case 3: Doctor d = new Doctor();
		           d.Choice();
		       break;        
		   }
	   }while(choice!=4);
    sc.close();
	}

}
