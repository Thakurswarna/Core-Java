package www.com.elements;

public class Const {
 public Const() {
	 System.out.println("Default Const");
 }
 public Const(int a) {
	 System.out.println(a);
 }
 public static void main(String[] args) {
	Const con=new Const();
	Const con1=new Const(10);
}
}
