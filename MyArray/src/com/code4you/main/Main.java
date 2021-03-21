package com.code4you.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		/*
		 * int[] numbers = {13,12,55,43,77,88}; //sSystem.out.println(a); int[]
		 * numbers1 = {12,66,43,67,89}; int[] number2 = {17,46,73,22,89};
		 * Arrays.sort(numbers); String string = Arrays.toString(numbers);
		 * System.out.println(string);
		 * 
		 * int binarySearch = Arrays.binarySearch(numbers, 55);
		 * System.out.println(binarySearch);
		 * 
		 * List<int[]> asList = Arrays.asList(numbers);
		 * 
		 * int[] copyOf = Arrays.copyOf(numbers, 10); for (int i : copyOf) {
		 * System.out.println(i); }
		 */

		String diwaliMsg = "hello banta";
		/*
		 * StringBuilder reverse = new StringBuilder();
		 * 
		 * System.out.println(diwaliMsg.length()); for (int i =
		 * diwaliMsg.length()-1; i > -1 ; i--) {
		 * 
		 * //reverse =reverse + diwaliMsg.charAt(i);
		 * reverse.append(diwaliMsg.charAt(i)); }
		 * System.out.println("Reverse String is: "+reverse);
		 * 
		 * reverse.append(diwaliMsg); System.out.println(reverse.reverse());
		 */

		/*
		 * LinkedList<Character> list = new LinkedList<Character>(); for (int i
		 * = 0; i < diwaliMsg.length(); i++) { list.push(diwaliMsg.charAt(i)); }
		 * System.out.println(list.size()); for (int i = 0; i < list.size();i++)
		 * { System.out.print(list.pop()); } //using Stack String reverse =
		 * reverse(diwaliMsg); System.out.println(reverse);
		 */

		// using stringBuilder
		// StringBuilder reverseUsingSB = reverseUsingSB(diwaliMsg);
		// System.out.println(reverseUsingSB);

		// char array
		// System.out.println(reverseByCharArr(diwaliMsg));

		// char array2
		//reverseByCharArr2(diwaliMsg);
		
		//using ArrayList object
		reverseUsingArrList(diwaliMsg);

	}

	private static void reverseUsingArrList(String diwaliMsg) {
		char[] charArray = diwaliMsg.toCharArray();
		List<Character> list = new ArrayList<>();
		for (char c : charArray) {
			list.add(c);
		}
		Collections.reverse(list);
		ListIterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next());
			
		}
	}

	private static void reverseByCharArr2(String diwaliMsg) {
		System.out.println("inside reverseByCharArr2");
		char[] charArray = diwaliMsg.toCharArray();
		int left, right = 0;

		right = charArray.length - 1;

		for (left = 0; left <= right; left++, right--) {
			char temChar = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temChar;
		}
		for (char c : charArray) {
			System.out.print(c);

		}

	}

	private static String reverseByCharArr(String diwaliMsg) {
		char[] charArray = diwaliMsg.toCharArray();

		String tempChar = "";
		for (int i = 0; i < charArray.length; i++) {
			tempChar = tempChar + charArray[charArray.length - i - 1];
		}

		return tempChar;
	}

	public static String reverse(String wish) {

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < wish.length(); i++) {

			stack.push(wish.charAt(i));
		}

		String temp = null;
		while (!stack.isEmpty()) {
			temp += stack.pop();
		}

		return temp;
	}

	public static StringBuilder reverseUsingSB(String wish) {

		StringBuilder builder = new StringBuilder(wish);

		return builder.reverse();
	}

}
