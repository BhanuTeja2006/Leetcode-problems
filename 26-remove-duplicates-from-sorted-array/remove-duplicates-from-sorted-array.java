class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 0;
        for(int num : nums){
            if((ptr == 0) || (num != nums[ptr-1])){
                nums[ptr] = num;
                ptr++;
            }
        }
        return ptr;        
    }
}