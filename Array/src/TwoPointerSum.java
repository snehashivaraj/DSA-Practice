// Two-pointer approach to find a pair and three-pointer approach to find a triplet that sums to a target

import java.util.*;

public class TwoPointerSum{ 

	// Finds two numbers in a sorted array that sum up to the target
	public static ArrayList<Integer> targetSum(int[] arr,int target){

		int left_pointer = 0;
		int right_pointer = arr.length-1;
		ArrayList<Integer> found_incidies = new ArrayList<Integer>();
		while (left_pointer < right_pointer) {
			int sum = arr[left_pointer]+arr[right_pointer];
			if(sum==target){
				System.out.println("Found in ");
				found_incidies.add(left_pointer);
				found_incidies.add(right_pointer);
				return found_incidies;	  // Return as soon as we find a valid pair	
			}
			else if (sum<target){
				left_pointer++; // Increase left pointer if sum is too small
			}
			else {
				right_pointer--; // Decrease right pointer if sum is too large
			}
		}
		System.out.println("NOt found");
		return found_incidies;
	}
}
class ThreePointers{

	// Finds three numbers in a sorted array that sum up to the target
	public static void threeSum(int[] arr,int target){
		ArrayList<Integer> searched = new ArrayList<>();
		for(int i=0;i<arr.length-2;i++){   //length - 2 because length - 1 = right_pointer till
			int left_pointer = i;
			int mid_pointer	=i+1;   // mid is second element
			int right_pointer = arr.length-1;
			while(mid_pointer < right_pointer){
				int sum = arr[left_pointer]+arr[right_pointer]+arr[mid_pointer];
				if(sum==target){
					searched.add(left_pointer);
					searched.add(mid_pointer);
					searched.add(right_pointer);
					System.out.println("Three incidices of 3 sum is : " +left_pointer+" "+mid_pointer+" " +right_pointer);
					return;
				}
				else if(sum<target){
					mid_pointer	++;
				}
				else {
					right_pointer--;
				}
			}

		}
		System.out.println("Not found ");
		return;

	}
}
class PairAndTripletSumMainClass{

	public static void main(String... fvjhdf){

		int[] a = {1,2,3,4,5,6};
		int tar = 10;
		ArrayList<Integer> res = TwoPointerSum.targetSum(a,tar);
		System.out.println(res);

		int[] mid_ar = {3,4,5,6,7};
		int targe = 14;
		ThreePointers.threeSum(mid_ar,targe);
		return;
	}
}