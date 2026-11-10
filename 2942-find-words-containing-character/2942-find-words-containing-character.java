class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
       int i = 0;
        List<Integer> arr = new ArrayList<>();
        for (String word : words) {
            for (char wrd : word.toCharArray()) {
                if (wrd == x) {
                    arr.add(i);
                    break;
                }
            }
            i++;
        }
        return arr;
    }
}