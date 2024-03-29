/*Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.
Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
Example 2:
Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.
 */

import java.util.HashSet;
import java.util.Set;

public class Minimum_Common_Value_2540 {
    // HashSet impelementation
   public int getCommon1(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                return num;
            }
        }
        return -1;
    }  

    // Two Pointer approch
    public int getCommon2(int[] nums1, int[] nums2) {
        int first=0;
        int second=0;
        while(first<nums1.length && second<nums2.length){
            if(nums1[first]==nums2[second]){
                return nums1[first];
            }
            else if(nums1[first]>nums2[second]){
                second++;
            }
            else{
                first++;
            }
        }
        return -1;
    }

    // Two pointer faster approch 
    public int getCommon3(int[] nums1, int[] nums2) {
        int first=0;
        int second=0;
        int len1=nums1.length;
        int len2=nums2.length;
        if(nums1[len1-1]<nums2[0] || nums1[0]>nums2[len2-1]){
            return -1;
        }
        while(first<nums1.length && second<nums2.length){
            if(nums1[first]==nums2[second]){
                return nums1[first];
            }
            else if(nums1[first]>nums2[second]){
                second++;
            }
            else{
                first++;
            }
        }
        return -1;
    }

}
