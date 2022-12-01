package testing;

import java.util.*;

public class Test12 {
	
	public static void main(String[] args){
		
        int[] arr=new int[] {7,10 ,4 ,3, 20 ,15};
		System.out.println(sumOfNumber(arr,3,2));
    }
	
	public static int sumOfNumber(int[] nums, int k,int n) {
		Arrays.sort(nums);
        int length=nums.length,first=0,second=0;
		if(k>length||n>length) {
			return -1;
		}
        for(int i=0;i<length;i++) {
        	if(i==k-1) {
        		first=nums[i];
        	}
        	if(i==length-n) {
        		second=nums[i];
        	}
        }
        return first+second;
    }
}

