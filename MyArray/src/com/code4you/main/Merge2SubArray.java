package com.code4you.main;

import java.util.Arrays;

public class Merge2SubArray {

	public static void main(String[] args) {
		int[] num1 = {1,2,3,4};
		int[] num2 = {9,10,11};
		
		//normal loop
		//mergetoSingleArray(num1,num2);
		
		//System.arrayCopy
		int[] mergeUsingbuildMtd = mergeUsingbuildMtd(num1,num2);
		
		System.out.println(Arrays.toString(mergeUsingbuildMtd));
	}

	private static int[] mergeUsingbuildMtd(int[] num1, int[] num2) {
		
		int[] mergeArray = new int[num1.length+num2.length];
		
		System.arraycopy(num1, 0, mergeArray, 0, num1.length);
		System.arraycopy(num2, 0, mergeArray, num1.length, num2.length);
		
		
		return mergeArray;
		
	}

	private static void mergetoSingleArray(int[] num1, int[] num2) {
		
		int[] mergeArray = new int[num1.length+num2.length];
	
		for (int i = 0; i < num1.length; i++) {
			
			mergeArray[i]  = num1[i];
		}
		System.out.println(Arrays.toString(mergeArray));
		for (int i = num1.length, j=0; i < mergeArray.length; i++,j++) {
			mergeArray[i] = num2[j];
		}
		
		System.out.println(Arrays.toString(mergeArray));
		
	}

}
