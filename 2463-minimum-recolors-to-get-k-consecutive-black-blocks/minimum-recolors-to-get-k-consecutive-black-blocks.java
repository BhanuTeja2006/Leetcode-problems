class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int curcnt = 0;
        int mincnt = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W'){
                curcnt++;
            }
        }
        mincnt = curcnt;
        for(int right = k;right<blocks.length();right++){
            if(blocks.charAt(left) == 'W'){
                curcnt--;
            }
            if(blocks.charAt(right) == 'W'){
                curcnt++;
            }
            mincnt = Math.min(mincnt,curcnt);
            left++;
        }
        return mincnt;
    }
}