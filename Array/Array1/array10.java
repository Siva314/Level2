class Solution {
    public int jump(int[] nums) {
        int length=nums.length;
        if(length<3 && length>0){
            return length-1;
        }
        int jumps=0,temp=0,t1=0;
        for(int i=0;i<length-1;i++){
            temp=Math.max(temp,i+nums[i]);
            if(i==t1){
                jumps++;
                t1=temp;
            }
        }
        return jumps;
    }
}
