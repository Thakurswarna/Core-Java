package www.com.Methods;

public class Eg1 {
	int SID=20;
	String Sname="Kishore";
	String Scourse="QA";
	double Sfees=20000.00;
	
	public void getSDetails() {
		System.out.println(Sname);
		System.out.println(SID);
		System.out.println(Scourse);
		System.out.println(Sfees);
	}
	public static void main(String[] args) {
		new Eg1().getSDetails();
	}

}
