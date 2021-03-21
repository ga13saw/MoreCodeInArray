package com.code4you.main;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,2,3,5,5,64,34,9};
		int[] DupNum = {1,2,44,1};
		
		//boolean isDuplicate = containsDuplicate(distNum);
		//System.out.println(isDuplicate);
		//boolean containsDuplicate1 = containsDuplicate1(DupNum);
		//System.out.println(containsDuplicate1);
		int k = 3;
		rotate(nums,k);
	}

	private static void rotate(int[] nums, int k) {
		
		int[] tempNum= new int[nums.length];
		
		System.arraycopy(nums, 0, tempNum, k, nums.length - k);
		System.arraycopy(nums, nums.length - k, tempNum, 0, k);
		System.out.println(Arrays.toString(tempNum).replaceAll(" ", ""));
		//System.out.println(Arrays.asList(tempNum));
	}

	private static boolean containsDuplicate1(int[] distNum) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for (Integer integer : distNum) {
			if(set.add(integer)==false){
				return true;
			}
		}
		return false;
		
	}

	private static boolean containsDuplicate(int[] distNum) {
		
		for (int i = 0; i < distNum.length; i++) {
			for (int j = i+1; j < distNum.length; j++) {
				if(distNum[i] == distNum[j]){
					
					return true;
				}
				}
		}
		
		return false;
	}
	
	

}
