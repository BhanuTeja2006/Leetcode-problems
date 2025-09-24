class Solution {
    public int[] decode(int[] encoded, int first) {
        int len=encoded.length+1;
        int [] arr=new int [len];
        arr[0]=first;
       
        for(int i=0;i<len-1;i++ ){
            arr[i+1]=arr[i]^encoded[i];
           
        }
        return arr;
    }
}