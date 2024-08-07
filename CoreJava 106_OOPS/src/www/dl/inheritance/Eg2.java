package www.dl.inheritance;
//Multiple
class One{
	public void M1() {
		System.out.println("One");
	}
}
class Two extends One{
	public void M2() {
		System.out.println("Two");
	}
}
class Three extends Two{
	public void M3() {
		System.out.println("Three");
	}
}
public class Eg2 {
public static void main(String[] args) {
	Three three=new Three();
	three.M1();
	three.M2();
	three.M3();
}
}
