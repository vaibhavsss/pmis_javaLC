import java.util.*;

class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> set = new HashSet<>();
        int l = 0, r = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') l++;
            else if (c == ')') {
                if (l > 0) l--;
                else r++;
            }
        }

        dfs(s, 0, l, r, 0, new StringBuilder(), set);
        return new ArrayList<>(set);
    }

    void dfs(String s, int i, int l, int r, int b,
             StringBuilder cur, Set<String> set) {
        if (b < 0 || l < 0 || r < 0) return;

        if (i == s.length()) {
            if (l == 0 && r == 0 && b == 0)
                set.add(cur.toString());
            return;
        }

        char c = s.charAt(i);

        if (c == '(') {
            if (l > 0) dfs(s, i + 1, l - 1, r, b, cur, set);
            cur.append(c);
            dfs(s, i + 1, l, r, b + 1, cur, set);
            cur.deleteCharAt(cur.length() - 1);
        } else if (c == ')') {
            if (r > 0) dfs(s, i + 1, l, r - 1, b, cur, set);
            if (b > 0) {
                cur.append(c);
                dfs(s, i + 1, l, r, b - 1, cur, set);
                cur.deleteCharAt(cur.length() - 1);
            }
        } else {
            cur.append(c);
            dfs(s, i + 1, l, r, b, cur, set);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}