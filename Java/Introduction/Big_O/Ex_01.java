package Big_O;

/*
 * Big O time means, we could describe the data transfer "algorithm" runtime as
 * Logarithmic(ex:binary search) is more efficient and scalable than Linear
 * exponential is on logarithmic time,
 * constant O(1)  
 */

public class Ex_01 {
 
	// code with mosh
	public void greet(String[] names) {
		// O(1) space
		
		//O(n) space
		String[] copy = new String[names.length];
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("hi " + names[i]);
		}
	}
	
	
	
	public static int sum(int n) {
  		if (n <= 0) {
			return 0;
		}
		return n + sum(n-1);
	}
	
	public static void main(String[] args) {
		int s = sum(4);
		System.out.println(s);
	}

	
}




