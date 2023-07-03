package Big_O;

/* Drop the Constants
 * It's very possible for O(N) code to run faster than O(1) code for specific inputs. 
 * Big O just describes the rate of increase.
 * 
 * Which one is faster?
 * 
 * */
public class Ex_03 {
	public static void minAndMax1(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int x : array) {
			if (x < min) min = x;
			if (x > max) max = x;
		}
		System.out.println(min + ", " + max);
	}
	
	public static void minAndMax2(int[] array) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int x : array) {
			if (x < min) min = x;
		}
		for (int x : array) {
			if (x > max) max = x;
		}		
		System.out.println(min + ", " + max);
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 5, 2, 2, 5, -1, 9, 3};
		minAndMax1(array);
		minAndMax2(array);
	}		
}
