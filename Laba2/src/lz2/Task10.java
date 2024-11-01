package lz2;

import java.util.Arrays; //Можно конечно сравнивать числа через if else, но мне опять же лень

public class Task10 {
	public static void main(String[] args) {		
		int[] numbers;
		numbers = new int[5];
		
		numbers[0] = Integer.parseInt(args[0]); 
		numbers[1] = Integer.parseInt(args[1]); 
		numbers[2] = Integer.parseInt(args[2]); 
		numbers[3] = Integer.parseInt(args[3]);
		numbers[4] = Integer.parseInt(args[4]);
		
		Arrays.sort(numbers);
		System.out.println(numbers[2]);
	}
}