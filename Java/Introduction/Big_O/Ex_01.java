package Big_O;

/*
 * Big O time is the language and metric we use to describe the efficiency of algorithms. 
 * Not understanding it thoroughly can really hurt you in developing an algorithm. 
 * Not only might you be judged harshly for not really understanding big 0, 
 * but you will also struggle to judge when your algorithm is getting faster or slower.
 */
public class Ex_01 {
	
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
