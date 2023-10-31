public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder rev = new StringBuilder();
        
        // Add leading zeros if binary string length is less than 32
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        
        for (int i = binary.length() - 1; i >= 0; i--) {
            rev.append(binary.charAt(i));
        }
        
        String reversedBinary = rev.toString();
        int reversed = Integer.parseUnsignedInt(reversedBinary, 2);
        return reversed;
    }
}