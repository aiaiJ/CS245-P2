// package edu.usfca.cs.cs245;

public class BinaryRecursiveSearch implements Practice2Search{

	public int search(int [] arr, int target){

		return search(arr, target, arr.length - 1, 0);
	}

	public int search(int [] arr, int target, int max, int min){

		if(max < min){

			return -1;
		}
		// 
		int mid = (max+min)/2;

		if(arr[mid] == target){

			return mid;
		}
		if(arr[mid] < target){

			return search(arr, target, mid-1, min);
		}
		else

			return search(arr, target, max, mid+1);
	}

	public String searchName(){

		return ("BinaryRecursiveSearch");
	}






}
