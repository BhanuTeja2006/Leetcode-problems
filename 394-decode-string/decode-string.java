class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ']'){
                String res = "";
                while(!stack.isEmpty() && !stack.peek().equals("[")){
                    res = stack.pop() + res;
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
                String repnum = "";
                while(!stack.isEmpty() && stack.peek().matches("\\d")){
                    repnum = stack.pop() + repnum;
                }
                int n = Integer.parseInt(repnum);
                String repstr ="";
                for(int i=0;i<n;i++){
                    repstr += res;
                }
                stack.push(repstr);
            }
            else{
                stack.push(String.valueOf(ch));
            }  
        }
        String decstr = "";
        for(String r : stack){
            decstr += r;
        }
        return decstr;
    }
    
}