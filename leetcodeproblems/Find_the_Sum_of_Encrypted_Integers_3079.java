/*You are given an integer array nums containing positive integers. We define a function encrypt such that encrypt(x) replaces every digit in x with the largest digit in x. For example, encrypt(523) = 555 and encrypt(213) = 333.
Return the sum of encrypted elements.
Example 1:
Input: nums = [1,2,3]
Output: 6
Explanation: The encrypted elements are [1,2,3]. The sum of encrypted elements is 1 + 2 + 3 == 6.
Example 2:
Input: nums = [10,21,31]
Output: 66
Explanation: The encrypted elements are [11,22,33]. The sum of encrypted elements is 11 + 22 + 33 == 66.
Constraints:
1 <= nums.length <= 50
1 <= nums[i] <= 1000*/
public class Find_the_Sum_of_Encrypted_Integers_3079 {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=encrypt(num);
        }
        return sum;
    }
    public static int encrypt(int n){
        int big=0,count =0;
        while(n!=0){
            int a = n%10;
            big=Math.max(big,a);
            count++;
            n/=10;
        }
        int num=0;
        for(int i=0;i<count;i++){
            num=num*10+big;
        }
        return num;
    }
}
