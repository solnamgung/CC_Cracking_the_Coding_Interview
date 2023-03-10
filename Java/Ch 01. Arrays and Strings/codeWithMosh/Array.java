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
	
	public void resizeIsRequired() {
		if(items.length == count ) {
			int[] newItems = new int[count * 2];
			
			for(int i = 0; i < count; i++) 
				newItems[i] = items[i];
			
			items = newItems;
		}
	}
	
	
	public void insert(int item) {
		resizeIsRequired();
		items[count++] = item;
	}
	
// Note that I've extracted the login for resizing the array into 
// this method so we can reuse in insert() and insertAt() methods.
	
	public void insertAt(int item, int index) {
		if(index < 0 || index > count) 
			throw new IllegalArgumentException();
		
		resizeIsRequired();
		
		for(int i = count-1; i >= index; i--) {
			items[i+1] = items[i];
		}
		items[index] = item;
		count++;		
	}


	/* "count-i-1" vs "count-1-i" are not the same
	 * because they compute different indices when reversing an array.
	 */
	public void reverse() {
		int[] newItems = new int[count];
		
		
		for(int i = 0; i < count; i++) {
			newItems[i] = items[count - i -1];
		}
		items = newItems;
	}
	
	
//	
//	public int max() {
//		
//		return ;
//	}
//	
//	public Array intersect(Array other) {
//		
//	}
//	
//	public void removeAt(int index) {
//		
//	}
//	
//	public int indexOf(int item) {
//		
//		return;
//	}
//	
	
	
	public void print() {
		String str = "[ ";
		
		for(int i = 0; i < count; i++) {
			if(i == count - 1 ) {
				str += items[i] + " ]";
			} else {
				str += items[i] +", ";
			}
		}
		 System.out.println(str);
	}
	
//	public String toString( ) {
//		StringBuilder sb = new StringBuilder();
//		sb.append("[");
//		for(int i = 0; i < count; i++) {
//			sb.append(items[i]);
//			if(i != count-1) {
//				sb.append(", ");
//			}
//		}
//		sb.append("]");
//		
//		return sb.toString();
//	}

}





