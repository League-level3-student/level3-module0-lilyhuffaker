package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String a[] = {"hi","help","hello"};
		strings(a);
		reverseStrings(a);
		everyOther(a);
		radnomOrder(a);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void strings(String arr[]) {
		System.out.println("normal:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	 //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void reverseStrings(String arr[]) {
		System.out.println("Backwards:");
		for(int i = arr.length-1; i > -1; i--) {
			System.out.println(arr[i]);
		}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void everyOther(String arr[]) {
		System.out.println("Every Other:");
		for(int i = 0; i < arr.length; i+=2) {
			System.out.println(arr[i]);
		}
	}
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void radnomOrder(String arr[]) {
		Random randy = new Random();
		System.out.println("Random:");
		
	}
}
