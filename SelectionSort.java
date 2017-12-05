/**
 * SelectionSort is a class that uses the selection sort algorithm 
 *to sort elements of an array into ascending order.
 * 
 * @author Ellen Sutton
 * @version 23/10/17
 */

import java.util.Arrays;

public class SelectionSort {
	
	
	/**
	 * swap is a method that swaps two elements of an array
	 * @param numbers The array in which the elements to be swapped are in
	 * @param a The element to be swapped with b
	 * @param b The element to be swapped with a
	 */
	private static void swap(int[] numbers, int a, int b){
		int temp = numbers[a];
		numbers[a] = numbers[b];
		numbers[b] = temp;
	}
	
	/**
	 * selectionSort is a method that uses the selection sort algorithm to sort the elements of an array into increasing order
	 * @param numbers The array to be sorted
	 * @return The sorted array
	 */
	public static int[] selectionSort(int[] numbers){
		for (int counter = 0; counter < numbers.length; counter++){
			int minimum = counter;
			for (int i = counter+1; i < numbers.length; i++){
				if (numbers[i] < numbers[minimum])
					minimum = i;
			}
			swap(numbers,counter,minimum);
		}
		return numbers;
	}
	
	public static void main(String[] args){
		int[] array = {4, 3, 6, 1, 9, 2};
		
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(array));
		selectionSort(array);
		System.out.println("After sorting:");
		System.out.println(Arrays.toString(array));

	}

}
