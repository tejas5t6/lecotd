class Solution {
    public String smallestSubsequence(String s) {
        int[] freq = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : s.toCharArray()) {

            freq[c - 'a']--;

            if (seen[c - 'a'])
                continue;

            while (!stack.isEmpty()
                    && stack.peek() > c
                    && freq[stack.peek() - 'a'] > 0) {

                seen[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            seen[c - 'a'] = true;
        }
        StringBuilder ans = new StringBuilder();
        for (char ch : stack)
            ans.append(ch);
        return ans.toString();
    }
}