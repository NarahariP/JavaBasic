package com.hari;

public class LargestSumContiguousSubArrayExample {

	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println(maxAubArraySum(arr));
	}

	private static int maxAubArraySum(int[] arr) {
		int sum = 0, temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];
			if (sum < temp)
				sum = temp;
			if (temp < 0)
				temp = 0;
		}
		return sum;
	}
}
