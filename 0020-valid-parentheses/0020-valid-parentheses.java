class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char c=st.peek();
                st.pop();
                if(c=='(' && s.charAt(i)==')'){
                    continue;
                }
                else if(c=='{' && s.charAt(i)=='}'){
                    continue;
                }
                else if(c=='[' && s.charAt(i)==']'){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
}