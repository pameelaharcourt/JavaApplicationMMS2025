import java.util.Arrays;

public class UsingArraysClass{
	public static void main (String[] args) {
		// to indicate the number of size your array should carry, we used this method below
		int[] myArrays = new int[5];
		
		Arrays.fill(myArrays, 10);
		
		for(int myNum : myArrays) {
			System.out.printf("%d%n", myNum);
		}
		
		int[] numbers = {6,2,5,9,1,3,7,4,8,10};
		Arrays.sort(numbers);
		
		//You can have a method that will copy the array, and you also used numbers.length to give you the length of the arrays
		int[] copy = Arrays.copyOf(numbers, numbers.length);
		System.out.println("========= where we copy array =========");
		for(int copyNum : copy) {
			System.out.printf("%d%n", copyNum);
		}
		
		// to get the index of 7, i need to sort the arrays first, then used binary search to get the index of 7
		int index = Arrays.binarySearch(numbers,7);
		System.out.println("The element index is " + index);
		
		for(int num : numbers) {
			System.out.printf("%d%n",num);
		}
	}
}