// package edu.usfca.cs.cs245;

public class BinaryIterativeSearch implements Practice2Search{

	public int search(int [] arr, int target){

		int min = 0;
		int max = arr.length-1;
		int mid;

		while(min <= max){

			mid = (min + max)/2;

			if(arr[mid] ==target ){

				return mid;
			}
			if(arr[mid] < target){

				max = mid - 1;
			}

			min = mid + 1;
		}

		return -1;
	}
	public String searchName(){

		return("BinaryIterativeSearch");
	}


}
