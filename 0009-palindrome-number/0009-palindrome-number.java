class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false; // Negative numbers can't be palindromes
        }
        
           int originalNum = x;
        int reversedNum = 0;
        
        while (x != 0) {
            int remainder = x % 10;
            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }
        
       if (originalNum == reversedNum) {
       return true;
       }
    else {
        return false;
    }
    }
}