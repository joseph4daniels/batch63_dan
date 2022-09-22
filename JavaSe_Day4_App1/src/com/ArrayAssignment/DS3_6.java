package com.ArrayAssignment;

public class DS3_6 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int newSize;
		int checkCopy = 0;
		for(int i = 0; i < arr.length; i++) {
	        for(int j = 0; j < arr.length; j++) {
	        	if(arr[i] == arr[j]) {
	        		checkCopy = checkCopy + 1;
	        	}
	        }
	        if(checkCopy == 2) {

	        }
	        
		}
	}

}
