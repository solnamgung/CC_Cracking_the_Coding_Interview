package codeWithMosh;

import java.sql.SQLOutput;
import java.util.Arrays;

/*
 * runtime complexity of Array :
 * O(1) and O(n)
 * Delete O(1) and O(n) : delete memory & index\
 * create, insert, removeAt, indexOf
 */

public class Array {

	public int[] items;
	public int count;  // default 0
	
	public Array(int length) {
		items = new int[length];
	}
	
	public void insert(int item) {
		items[count++] = item;
	}
	
	public void insertAt(int item, int index) {
		if(index < 0 || index > count) 
			throw new IllegalArgumentException();
		
		for(int i = count-1; i >= index; i--) {
			items[i+1] = items[i];
		}
		items[index] = item;
		count++;		
	}
	
	public String toString( ) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i < count; i++) {
			sb.append(items[i]);
			if(i != count-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		
		return sb.toString();
	}

}





