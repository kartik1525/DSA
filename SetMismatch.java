//sorted array and then looped through the array to find the duplicate and missing number
// to find the duplicate number we check if the current number is equal to the previous number
// to find the missing number we check if the current number is greater than the previous number + 1
// if the last number is not equal to the length of the array then the missing number is the length of the array
class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate=-1;
        int missing=1;
       for(int i=1; i<nums.length;i++){
        if(nums[i]==nums[i-1]){
            duplicate=nums[i];
        }
        else if(nums[i]> nums[i-1]+1){
            missing=nums[i-1]+1;
        }
       }
       if(nums[nums.length-1]!=nums.length){
        missing=nums.length;
       }
       return new int[] {duplicate, missing};
    }
}