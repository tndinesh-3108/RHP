class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        Arrays.sort(nums);
        int mini = nums[0], maxi = nums[nums.length - 1], index = 0;
        while(mini<maxi){
            if(nums[index]==mini){
                mini++;
                index++;
                continue;
            }
            else{
                while(mini<nums[index]){
                    missing.add(mini++);
                }
                index++;
                mini++;
            }
        }
        return missing;
    }
}