package com.aakash.sorting;

import java.util.Scanner;

public class BubbleSortArr {

	public static void main(String arg[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of element to insert: ");
		n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sortArray(arr);
		for (int i = 0; i < n; i++)

		{

			System.out.print(arr[i] + " ");
		}

	}

	public static int[] sortArray(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
