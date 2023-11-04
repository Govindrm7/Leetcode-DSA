class Solution {
    public boolean isPalindrome(String s) {
        // Remove non-alphanumeric characters and convert to lowercase
        String x = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = x.length() - 1;

        while (i < j) {
            if (x.charAt(i) != x.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
