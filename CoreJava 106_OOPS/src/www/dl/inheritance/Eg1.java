package www.dl.inheritance;
 
class A{
	public void M1() {
		System.out.println("M1");
	}
}
class B extends A{
	public void M2() {
		System.out.println("M2");
	}
}
public class Eg1 {
 public static void main(String[] args) {
	B b=new B();
	b.M1();
	b.M2();
}
}
