class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zcnt = 0;
        int maxlen = 0;
        int curlen = 0;
        for(int right = 0;right<nums.length;right++){
            if(nums[right] == 0){
                zcnt++;
            }
            while(zcnt > k){
                if(nums[left] == 0){
                    zcnt--;
                }
                left++;
            }
            curlen = right - left+1;
            maxlen = Math.max(maxlen,curlen);
        }
        return maxlen;  
    }
}