import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);

            if (!groupedAnagrams.containsKey(sortedStr)) {
                groupedAnagrams.put(sortedStr, new ArrayList<>());
            }
            groupedAnagrams.get(sortedStr).add(str);
        }

        return new ArrayList<>(groupedAnagrams.values());
    }
}
