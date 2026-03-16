class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        int res = 0;
        for(int i : g){
            while(j<s.length && i>s[j]){
                j++;
            }
            if(j == s.length){
                return res;
            }
            else{
                j++;
                res++;
            }
        }
        return res;
    }
}