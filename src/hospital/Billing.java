package hospital;

public class Billing{

//	 private int b_no = 201;
//	 private int b_amt = 1000;
	private int b_no;
	 private int b_amt;
	 
	 public Billing(int b_no, int b_amt) {
		this.b_no = b_no;
		this.b_amt = b_amt;
	}
	 
	
	 Patient P = new Patient();
	 String p_name =P.getP_name();
	 int p_id = P.getP_id();
	 
	 public String getP_name() {
	  return p_name;
	 }
	 public int getB_no() {
	  return b_no;
	 }
	 public int getB_amt() {
	  return b_amt;
	 }
	 public Patient getP() {
	  return P;
	 }
	 public int getP_id() {
	  return p_id;
	 }

	 
	 
	 
	}