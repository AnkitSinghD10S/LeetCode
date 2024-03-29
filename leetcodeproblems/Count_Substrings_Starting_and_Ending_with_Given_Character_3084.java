/*You are given a string s and a character c. Return the total number of 
substrings of s that start and end with c.
Example 1:
Input: s = "abada", c = "a"
Output: 6
Explanation: Substrings starting and ending with "a" are: "abada", "abada", "abada", "abada", "abada", "abada".
Example 2:
Input: s = "zzz", c = "z"
Output: 6
Explanation: There are a total of 6 substrings in s and all start and end with "z".
Constraints:
1 <= s.length <= 105
s and c consist only of lowercase English letters */
public class Count_Substrings_Starting_and_Ending_with_Given_Character_3084 {
    public long countSubstrings(String s, char c) {
        long n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                n++;
            }
        }        return n*(n+1)/2;
    }
}
