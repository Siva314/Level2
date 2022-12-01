class Solution {
    public int findPeakElement(int[] nums) {
        int index=0,max=Integer.MIN_VALUE,length=nums.length;
        for(int i=0;i<length;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        return index;
    }
}
