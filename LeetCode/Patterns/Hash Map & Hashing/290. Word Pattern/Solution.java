class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        List<String> list = Arrays.asList(words);
        for (int i =0; i < pattern.length(); i++) {
            if (pattern.indexOf(pattern.charAt(i)) != list.indexOf(words[i])){
                return false;
            }
        }
        return true;
    }
}