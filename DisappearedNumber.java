//used math.abs to find the positive value
//used position as value-1
//marked every non duplicate number as negative 
//looped again through the array to find the positive number
//upon positive numvber added it's index+1 to the list 
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result= new ArrayList<>();
        int n = nums.length;
        for(int i =0; i<n;i++){
            int value= Math.abs(nums[i]);
            int position= value-1;
            if(nums[position]>0){
                nums[position]=-nums[position];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                result.add(i+1);
            }
        }
        
        return result;
    }
}