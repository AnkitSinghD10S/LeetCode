public class MaxConsecutiveOnes485 {
        public static int findMaxConsecutiveOnes(int[] nums) {
            int count =0;
            int max = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==1 ){
                    count++;
                }
                else{
                    count =0;
                }
                if(max<count){
                max= count;
                }
            }
            return max;
        }
        public static void main(String [] args){
            int arr[]={1,1,1,1,0,1,1,1,1};
            System.out.print(findMaxConsecutiveOnes(arr));
        }
    }
