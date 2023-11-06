class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] charCountS = new int[128];  // Assuming ASCII character set
        int[] charCountT = new int[128];  // Assuming ASCII character set

        for (int i = 0; i < s.length(); i++) {
            char currentCharS = s.charAt(i);
            char currentCharT = t.charAt(i);

            if (charCountS[currentCharS] != charCountT[currentCharT]) {
                return false;
            }
            
            // Update the counts
            charCountS[currentCharS] = i + 1;
            charCountT[currentCharT] = i + 1;
        }
        
        return true;
    }
}
