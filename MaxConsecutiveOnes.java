class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cmax=0;
        int cpresent=0;
        for (int i=0; i<nums.length; i++){
            if(nums[i]==0){
                cmax= Math.max(cpresent, cmax);
                cpresent=0;
                
            }
            else{
                cpresent++;
            }
            cmax= Math.max(cpresent, cmax);
        }
        return cmax;
    }
}