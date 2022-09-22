package com.ArrayAssignment;

import java.util.ArrayList;

public class DS3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,2,1};
		int[] arr_copy = {1,2,3};
		int[] sorted = new int[(arr.length)];
		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				//System.out.println(arr[i] + " " + arr[j]);
				if(arr[i] > arr[j]) {
					sorted[i] = arr[j];
					//System.out.println(sorted[i]);
				}
			}
		}
		
		/*for(int i = 0; i < arr.length; i++) {
			System.out.println(sorted[i]);
			arr[i] = sorted[i];
		}*/
		
		/*for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}*/
		
	}

}
