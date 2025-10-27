class Solution {
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int pcnt = 0;
        for(String row : bank){
            int ccnt = 0;
            for(char ch : row.toCharArray()){
                if(ch == '1'){
                    ccnt++;
                }
                
            }
            if(ccnt > 0){
                res += pcnt * ccnt;
                pcnt = ccnt;
            }
        }
        return res;
    }
}