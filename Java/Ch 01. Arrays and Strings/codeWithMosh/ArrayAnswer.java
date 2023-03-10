package codeWithMosh;

public class ArrayAnswer {
	
	 public static void main(String[] args) {
		 
		Array arr = new Array(10);
	
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.insert(5);
		
		arr.insertAt(100, 2);
	
		System.out.println(arr.toString());
		
		
	 }
}
