package www.dl.inheritance;
//Multiple Inheritance is not supported by Java ( to overcome this issue we use Interface)
class Onee{
	public void M1() {
		System.out.println("One");
	}
}
class Two extends Onee{
	public void M2() {
		System.out.println("Two");
	}
}
 class Three extends Two{
	 public void M3() {
		 System.out.println("Three");
	 }
 }
public class Eg3 {

}
