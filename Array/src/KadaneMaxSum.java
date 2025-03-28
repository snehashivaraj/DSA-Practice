// Implements Kadane's Algorithm to find the maximum sum subarray efficiently.

import java.util.Arrays;

public class KadaneMaxSum{

	// Returns only the maximum sum of any contiguous subarray using Kadane's Algorithm.

	public static int returnMaxSum(int[] arr){

		int max_sum = arr[0];
		int current_sum = 0;
		for(int i=0;i<arr.length;i++){
			current_sum += arr[i];
			if (current_sum	> max_sum){
				max_sum = current_sum;
			}
			if (current_sum < 0 ){
				current_sum	= 0;

			}
		}

		return max_sum;
	}

	// Returns the actual subarray that gives the maximum sum and print the max sum.

	public static int[] returnMaxSumSubArray(int[] arr){

		int max_sum	= arr[0];
		int current_sum = 0;
		int start = 0; 
		int end = 0; 
		int search = 0;

		for(int i=0;i<arr.length;i++){
			current_sum	+= arr[i];
			if(current_sum	> max_sum){
				max_sum	= current_sum;
				start = search;
				end = i;
			}
			if(current_sum < 0){

				current_sum = 0;

				search = i+1; // reassigning 
			}
		}
		System.out.println("The maximum sum is " +max_sum);
		return Arrays.copyOfRange(arr,start,end+1);
	}
}

// Test the implementation with a sample array.

class MainKadanesClass{

	public static void main(String[] args) {

		int[] ar = {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
		int max_sum_res = KadaneMaxSum.returnMaxSum(ar);
		System.out.println("Maximum sum of sub arrays "+max_sum_res);

		System.out.println("Found in the following sub array: ");

		int[] max_subarray = KadaneMaxSum.returnMaxSumSubArray(ar);

		System.out.println(Arrays.toString(max_subarray));
	
	}
}