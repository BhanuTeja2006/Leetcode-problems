class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character,Integer> dict = new HashMap<>();
        int left = 0;
        int cnt = 0;
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            dict.put(ch,dict.getOrDefault(ch,0)+1);
            while(dict.size() == 3){
                cnt += s.length() - right;
                char dch = s.charAt(left);
                dict.put(dch,dict.get(dch)-1);
                if(dict.get(dch) == 0){
                    dict.remove(dch);
                }
                left++;
            }
        }
        return cnt;

        
    }
}