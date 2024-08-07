package www.dl.abs;

abstract class A{
	public void m1() {
		System.out.println("M1 Method");
	}
	public abstract void m2();
}
class B extends A{

	@Override
	public void m2() {
		System.out.println("M2 Method");
		
	}
	
}
public class Client1 {
 public static void main(String[] args) {
	A a=new B();
	a.m1();
	a.m2();
}
}
