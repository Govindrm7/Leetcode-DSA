import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);
        BigInteger ans = a.add(b);
        return String.valueOf(ans);    }
}
