/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
There is only one repeated number in nums, return this repeated number.
You must solve the problem without modifying the array nums and uses only constant extra space.
Example 1:
Input: nums = [1,3,4,2,2]
Output: 2
Example 2:
Input: nums = [3,1,3,4,2]
Output: 3
Example 3:
Input: nums = [3,3,3,3,3]
Output: 3
Constraints:
1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
All the integers in nums appear only once except for precisely one integer which appears two or more times.
Follow up:
How can we prove that at least one duplicate number must exist in nums?
Can you solve the problem in linear runtime complexity? */

import java.util.Arrays;
import java.util.HashSet;

public class Find_the_Duplicate_Number_287 {
    public int findDuplicate1(int[] nums) {
        boolean selected[] = new boolean[nums.length];
        for(int num :nums ){
            if(selected[num]){
                return num;
            }
            selected[num]=true;
        }
        return -1;
    }
    public int findDuplicate2(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(seen.contains(nums[i])){
                return nums[i];
            }
            else{
                seen.add(nums[i]);
            }
        }
        return -1;
    }
    public int findDuplicate3(int[] nums) {
        Arrays.sort(nums);
        int temp=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                temp= nums[i];
            }
        }
        return temp;
    }
}
