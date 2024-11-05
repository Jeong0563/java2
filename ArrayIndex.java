package day8;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		int nums[] = new int[3];
		int nums[] = new int[10];
		int i = 0;
		while(i < nums.length) {
			nums[i] = scan.nextInt();
			i++;
		}
		for(int j = 0; j<nums.length; j++) {
			if(nums[j] % 2!= 0)
			System.out.println(nums[j]);
		}

	}

}
