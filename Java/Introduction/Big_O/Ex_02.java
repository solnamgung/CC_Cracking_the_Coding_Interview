package Big_O;
/* runtime complexity : Linear 
 * the cost of algorithms grows linearly - > O(n) , O(n+n), O(n + m)
 */
public class Ex_02 {
	public static int pairSum(int a, int b) {
		return a + b;
	}
	
	public static int pairSumSequence(int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += pairSum(i, i + 1);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int s = pairSumSequence(4);
		System.out.println(s);
	}		
}
/*
 * There will be roughly O(n) calls to pairSum, 
 * However, those calls do not exist simultaneously on the call stack. 
 * so you only need O(1) space.
 * */
 