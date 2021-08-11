package hospital;
import java.util.Scanner;


public class Doctor extends User{
	
   Scanner sc = new Scanner(System.in);
   private int d_id;
   private String d_name;
 
 public Doctor() {
}
 
 public Doctor(int d_id, String d_name) {
	this.d_id = d_id;
	this.d_name = d_name;
}  
 public int getD_id() {
  return d_id;
 }

 public void setD_id(int d_id) {
  this.d_id = d_id;
 }

 public String getD_name() {
  return d_name;
 }

 public void setD_name(String d_name) {
  this.d_name = d_name;
 }

 public void Choice(){
	 System.out.println("Welcome Dr. "+Receptionist.dName+","+Receptionist.pName+" is next!");
  System.out.println("Enter your choice:");
  System.out.println(" 1 - CheckPatient");
  
        int choice = sc.nextInt();
        
        
   switch(choice){        
         case 1: CheckPatient();
          break;
         case 2: main(null);
     
   }
 }
 
 public static void CheckPatient(){
  
  String p_name = Receptionist.pName;
  String d_name = Receptionist.dName;
  System.out.println("Dr. "+d_name+" has checked patient "+p_name);
 }

}
