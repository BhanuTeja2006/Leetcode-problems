class Solution {
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        for(int i=0;i<res.length;i += 2*k){
            int left = i;
            int right = Math.min(i+k-1,res.length-1);
            while(left<right){
                char temp = res[left];
                res[left] = res[right];
                res[right] = temp;
                left++;
                right--; 
            }
        }
        return new String(res);
    }
}