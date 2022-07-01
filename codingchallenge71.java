//to find the sum of any array on Java 8

import java.util.stream.*;

public class codingchallenge71 {
	public static void main(String[] args) {
		int[] array = {1, 2, 88, 9, 100, 50};
		IntStream stream = IntStream.of(array);
		int sum = IntStream.of(array).sum();
		System.out.println("Sum of array elements is: " + sum);
		
		
		
		
		}
}
