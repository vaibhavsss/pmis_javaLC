class Solution {
    public String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            char firstChar = sb.charAt(0);
            
            if (vowels.indexOf(firstChar) != -1) {
                sb.append("ma");
            } else {
                sb.deleteCharAt(0);
                sb.append(firstChar).append("ma");
            }
            
            sb.append("a".repeat(i + 1));
            
            if (i > 0) res.append(" ");
            res.append(sb);
        }
        
        return res.toString();
    }
}