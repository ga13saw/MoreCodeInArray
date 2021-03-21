package com.code4you.main;

import java.util.Arrays;
import java.util.HashSet;

public class showDuplicateValue {

	public static void main(String[] args) {
		int[] nums = {1,2,3,5,5,64,34,9};
		int[] DupNum = {1,2,44,1};
		int[] newArr = {2,4,4,2,3,6,7};
		int[] newArr2 = {2,4,5,4,2,3,6,7};
		
		int isDuplicate = containsDuplicate1(DupNum);
		//System.out.println(isDuplicate);
		//boolean containsDuplicate1 = containsDuplicate1(DupNum);
		//System.out.println(containsDuplicate1);
		//int k = 3;
		//rotate(nums,k);
		
		int twoValue = isTwoValue(nums);
		System.out.println(twoValue);
	}

	private static int isTwoValue(int[] nums) {
		int count=0;
		for (int i : nums) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[j] == i){
					count++;
				}
			}
			if (count > 1) {
				return i;
			} else{
				count=0;
			} 
		}
		return -1;
		
	}

	private static void rotate(int[] nums, int k) {
		
		int[] tempNum= new int[nums.length];
		
		System.arraycopy(nums, 0, tempNum, k, nums.length - k);
		System.arraycopy(nums, nums.length - k, tempNum, 0, k);
		System.out.println(Arrays.toString(tempNum).replaceAll(" ", ""));
		//System.out.println(Arrays.asList(tempNum));
	}

	private static int containsDuplicate1(int[] distNum) {
		
		HashSet<Integer> set = new HashSet<>();
		
		for (Integer integer : distNum) {
			if(set.add(integer)==false){
				return integer;
			}
		}
		return -1;
		
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
