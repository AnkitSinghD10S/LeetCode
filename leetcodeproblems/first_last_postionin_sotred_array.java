public class first_last_postionin_sotred_array {
    public static int[] searchRange(int[] nums, int target) {
        int [] arr ={-1,-1};
        // first occurence
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }
        // second occurence
            for(int i=nums.length-1;i>=0;i--){
                if(nums[i]== target){
                    arr[1]=i;
                    break;
                }
            }
            return arr;
        }
        public static void main(String[] args) {
            int arr[]={1,23,4,5,6,7,8,8,9};
            int target = 8;
            int ans [] = searchRange(arr,target);
            for(int i=0;i<ans.length;i++){
                System.out.print(ans[i]+" ");
            }
        }
}
