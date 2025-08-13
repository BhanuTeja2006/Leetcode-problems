class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(!Character.isDigit(ch)){
                stack.push(ch);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        String res = "";
        for(char c: stack){
            res += c;
        }
        return res;   
    }
}