/*Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
Example 1:
Input: left = 5, right = 7
Output: 4
Example 2:
Input: left = 0, right = 0
Output: 0
Example 3:
Input: left = 1, right = 2147483647
Output: 0
Constraints:
0 <= left <= right <= 231 - 1*/
public class Bitwise_AND_of_Numbers_Range_201 {
    public int rangeBitwiseAnd(int left, int right) {
        while(left<right){
            right=right&(right-1);
        }
        return (left&right);
    }
}    
