class Solution {
    public int search(int[] nums, int target) {
        int L=0;
        int R=nums.length-1;
        while(L+1<R){
            int mid=(L+R)/2;
            if(nums[mid]<target) L=mid;
            else R=mid;
        }
        return nums[L]==target? L:nums[R]==target? R: -1;
    }
}
