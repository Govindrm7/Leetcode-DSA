class Solution {
    public int characterReplacement(String s, int k) {
        
        int [] arr=new int [26];
        int res=0;
        int max=0;

        int l=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'A']++;

            max=Math.max(max,arr[s.charAt(i)-'A']);

            if(i-l+1-max>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }res=Math.max(res,i-l+1);
        }
            return res;
        
        
    }
}