import java.util.ArrayList;
import java.util.List;

public class Letter_Combinations_of_a_Phone_Number_17 {
    public List<String> letterCombinations(String digits) {
        String[] d = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        gen(digits, "", ans, d);
        return ans;
    }

    public void gen(String num, String s, List<String> ans, String[] d) {
        if (num.length() == 0) {
            ans.add(s);
            return;
        }
        char ch = num.charAt(0);
        String p = d[ch - '0'];
        for (int i = 0; i < p.length(); i++) {
            gen(num.substring(1), s + p.charAt(i), ans, d);
        }
    }
}