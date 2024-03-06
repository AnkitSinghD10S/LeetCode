/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
Return the merged string.
Example 1:
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
Example 2:
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
Explanation: Notice that as word2 is longer, "rs" is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
Example 3:
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
Explanation: Notice that as word1 is longer, "cd" is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
 */
public class Merge_Strings_Alternately_1768 {
    public String mergeAlternately1(String word1, String word2) {
        String ans="";
        while(word1.length()!=0 && word2.length()!=0){
            ans+=word1.charAt(0);
            ans+=word2.charAt(0);
            word1=word1.substring(1);
            word2=word2.substring(1);
        }
        ans+=word1;
        ans+=word2;
        return ans;
    }
}
