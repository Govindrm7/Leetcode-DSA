

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                stack.push(current);
            } else if (map.containsValue(current)) {
                if (stack.isEmpty() || map.get(stack.pop()) != current) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}
