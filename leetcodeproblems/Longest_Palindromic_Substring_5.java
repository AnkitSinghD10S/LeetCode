/*Given a string s, return the longest palindromic substring in s.
 Example 1:
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:
Input: s = "cbbd"
Output: "bb"
*/
public class Longest_Palindromic_Substring_5 {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String a=s.substring(i,j+1);
                if(palin(a)){
                    if(ans.length()<a.length()) 
                    ans=a;
                }
            }
        }
        return ans;
    }
    public boolean palin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)){
                return false;
            }
        }
        return true;
    }    
}
