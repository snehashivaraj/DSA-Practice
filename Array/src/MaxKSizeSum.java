//Max k sub using sliding window ; the sum doing is divided in SumKarray.java


public class MaxKSizeSum{

	public static int ksumMax(int[] arr, int k){

		int sum =0;
		for(int i=0;i<k;i++){
			sum+=arr[i];
		}
		int max_sum =sum;
		for(int j=k;i<arr.length;i=j++){
			if(sum>max_sum){
				max_sum=sum;
			}
			sum+=arr[j]-arr[j-k];
		}
		return max_sum;
	}
}

class MaxSumMainClass{

	public static void main(String... fsfd){

		int[] a= {7,6,5,4,3,2,1};
		int k_t = 3;

		int max_res = MaxKSizeSum.ksumMax(a,k_t);
		System.out.println("THe maximum sum is "  +max_res);
		return;
	}
}