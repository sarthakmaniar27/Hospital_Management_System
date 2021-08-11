package hospital;
import java.util.Scanner;


public class Receptionist extends User{
	Scanner sc = new Scanner(System.in);
	@SuppressWarnings("unused")
	private int r_id;
	@SuppressWarnings("unused")
	private String r_name;
	static String pName = "";
	static int pId = 0;
	static String dName = "";
	static int dId = 0;
	 
	public void Choice(){
	  System.out.println("Enter your choice:");
	  System.out.println(" 1 - GiveAppoint \n 2 - GenerateBill");
	        int choice = sc.nextInt();
	        
	        
	   switch(choice){        
	         case 1: GiveAppoint();
	          break;
	         case 2: GenerateBill();
	       break;
	         case 3:  main(null);
	   }
	   
	        
	      
	 }
	 public void GenerateBill(){
		 
     System.out.println("Enter Bill no: ");
	 int bill_id = sc.nextInt();
	 System.out.println("Enter Bill amount: ");
	 int bill_amt = sc.nextInt();

	  Billing B = new Billing(bill_id, bill_amt);
	  int b_no =B.getB_no();
	  int b_amt = B.getB_amt();
	  
	  
	  String p_name = pName ;
	  int p_id = pId;
	  
	  
	  System.out.println("Your bill has been successfully generated!\n");
	  System.out.println("Bill no: "+b_no +"\nPatient ID: "+p_id+"\nPatient Name: "+p_name+"\nBill Amount: "+b_amt);
	  
	  
	 }
	 
	 public void GiveAppoint(){

	  
	  System.out.println("Enter Patient id: ");

	  pId = sc.nextInt(); 
	  System.out.println("Enter Patient name: ");

	  pName = sc.next();
	  
	  System.out.println("Enter Doctor id: ");

	  dId = sc.nextInt();
	  System.out.println("Enter Doctor name: ");

	  dName = sc.next();
	  
	  
	 
	  
	 
	  Patient P = new Patient(pId, pName);
	  String p_name =P.getP_name();
	  int p_id = P.getP_id();
	  
	  Doctor D = new Doctor(dId, dName);
	  int d_id = D.getD_id();
	  String d_name = D.getD_name();
	  System.out.println("Your appointment has been confirmed "+p_name+"!");
	  System.out.println("\nPatient ID: "+p_id+"\nPatient Name: "+p_name+"\nAppointment with Doctor \nDoctor ID: "+d_id+
	    "\nDoctor Name: Dr. "+d_name);
	  
	 }

}
