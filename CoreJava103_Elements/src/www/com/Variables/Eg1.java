package www.com.Variables;

public class Eg1 {
	//Instance V (Non Static)
	 

		int productId = 4768; 
		String productName = "Mac";
		double productPrice = 100000.00;
		String productDescription = "M3 Chip";
		String address = "Hyd";
		
		public static void main(String[] args) {
			
			System.out.println(new Eg1().productId);
			System.out.println(new Eg1().productName);
			System.out.println(new Eg1().productPrice);
			System.out.println(new Eg1().productDescription);
			System.out.println(new Eg1().address);
		}
	}

