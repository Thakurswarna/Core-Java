package www.com.Methods;

public class Eg2 {
	static int SID=20;
	static String Sname="Kishore";
	static String Scourse="QA";
	static double Sfees=20000.00;
	
	public static void getSDetails() {
		System.out.println(Sname);
		System.out.println(SID);
		System.out.println(Scourse);
		System.out.println(Sfees);
	}
	public static void main(String[] args) {
		new Eg1().getSDetails();
	}

}



