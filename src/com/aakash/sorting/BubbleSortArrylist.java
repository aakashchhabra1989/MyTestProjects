package com.aakash.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSortArrylist {

	public static void main(String arg[]){
		int n;
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of element to insert: ");
		//n= sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		/*System.out.println("Enter Numbers: ");
		for (int i=0;i<n;i++){
			arr.add(sc.nextInt());
		}*/
		arr.add(5);
		arr.add(57);
		arr.add(56);
		arr.add(54);
		arr.add(53);
		sortArray(arr);
		for (int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}

	}
	
	public static void sortArray(List<Integer> arr ){
		int temp;
		for (int i=0; i<arr.size();i++){
			for(int j=i+1; j<arr.size(); j++){
				if(arr.get(i)>arr.get(j)){
					temp = arr.get(i);
					arr.set(i,arr.get(j));
					arr.set(j,temp);
				}
			}
		}
	}
}
