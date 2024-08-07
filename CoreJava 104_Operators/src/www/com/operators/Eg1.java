package www.com.operators;

public class Eg1 {
 public int add(int a,int b) {
	 return a+b;
 }
 public int remainder(int a,int b) {
	 return a%b;
 }
 
 public static void main(String[] args) {
	System.out.println(new Eg1().add(20, 10));
	System.out.println(new Eg1().add(200, 10));
}
}
