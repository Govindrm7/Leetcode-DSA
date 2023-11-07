class Solution {
    public int strStr(String haystack, String needle) {
        boolean s= haystack.contains(needle);
        if(!s)
        {
        return -1;
        }
        else
        {
          
            int i=haystack.indexOf(needle);
            return i;
        }
    }
}