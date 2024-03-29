/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
Constraints:
1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection_of_Two_Arrays_349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> unique = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            unique.add(nums1[i]);
        }
        Set<Integer> repeate = new HashSet<>();
        List<Integer> sol = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(unique.contains(nums2[i])&& !repeate.contains(nums2[i])){
                sol.add(nums2[i]);
                repeate.add(nums2[i]);
            }
        }
        int ans[]=new int [sol.size()];
        for(int i=0;i<sol.size();i++){
            ans[i]=sol.get(i);
        }
        return ans;
    }
}
