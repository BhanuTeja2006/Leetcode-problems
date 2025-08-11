class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    arr[i] = '\0';
                }
            }
            else if(arr[i] == '('){
                stack.push(i);
            }
        }
        while(!stack.isEmpty()){
            int j = stack.pop();
            arr[j] = '\0';
        }
        String res ="";
        for(char ch : arr){
            if(ch!='\0'){
                res += ch;
            }
        }
        return res;
        
    }
}