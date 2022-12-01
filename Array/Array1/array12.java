class Solution {
    public int searchInsert(int[] nums, int target) {
        int length=nums.length,index=0;
        for(int i=0;i<length;i++){
            int temp=nums[i];
            if(temp==target){
                return i;
            }
            if(temp>target){
                index=i;
                break;
            }
            else{
                index=i+1;
            }
        }
        return index;
    }
}
