class Solution {
    public String longestCommonPrefix(String[] v) {
        if(v.length==0){
            return "";  
        }
        
        String prefix = v[0];
        for(int i=1;i<v.length;i++){
                while(v[i].indexOf(prefix) !=0){
                    prefix=prefix.substring(0,prefix.length()-1);
                }
        }return prefix;
    }
    
}