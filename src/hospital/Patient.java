package hospital;
import java.util.Scanner;

public class Patient extends User{
	
	Scanner sc = new Scanner(System.in);
	 private int p_id;
	 private String p_name;
	 
	 public Patient() {
	}
	 
	 public Patient(int p_id, String p_name) {
		this.p_id = p_id;
		this.p_name = p_name;
	}
	 
	 public void Choice(){
	  System.out.println("Welcome "+Receptionist.pName);	 
	  System.out.println("Enter your choice:");
	  System.out.println(" 1 - PayBill");
	        int choice = sc.nextInt();
	        
	        
	   switch(choice){        
	         case 1: PayBill();
	          break;
	         case 2: main(null);
	     
	   }

	 }
	 
	 public int getP_id() {
	  return p_id;
	 }

	 public void setP_id(int p_id) {
	  this.p_id = p_id;
	 }

	 public String getP_name() {
	  return p_name;
	 }

	 public void setP_name(String p_name) {
	  this.p_name = p_name;
	 }
	 
	 public void PayBill(){
	  System.out.println("Thanks for paying the bill!");
	 }

}
