package com.nsc.mosh.array;

public class ArrayAnswer {
	
	 public static void main(String[] args) {
		 
		Array arr = new Array(5);
	
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.insert(5);
	
		System.out.println(arr.indexOf(5));
		arr.print();
	 }
}
