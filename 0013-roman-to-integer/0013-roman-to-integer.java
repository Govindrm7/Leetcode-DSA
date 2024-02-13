class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> h = new HashMap<>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        int ans = 0;
        int n = s.length();
        char prev = s.charAt(n-1);
        
        for(int i=n;i>0;i--){
            char curr = s.charAt(i-1);
            if(h.get(curr)<h.get(prev))
                ans-=h.get(curr);
            else
                ans+=h.get(curr);
            prev = curr;
        }
        return ans;
    }
}