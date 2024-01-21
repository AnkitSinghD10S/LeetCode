public class Moves_Zeros_283 {
    public static void moveZeroes(int[] nums) {
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]==0){
    //                 nums[i]=nums[j];
    //                 nums[j]=0;
    //             }
    //         }
    //         System.out.println(nums[i]);
    //     }
    // }


    // public static void moveZeroes(int[] nums) {
    //     int i = 0;
    //     for(int num:nums){
    //         if(num!=0){
    //             nums[i]=num;
    //             i++;
    //         }
    //     }
    //     while(i<nums.length){
    //         nums[i]=0;
    //         i++;
    //     }
    //     for(int j=0;j<nums.length;j++){
    //         System.out.print(nums[j]);
    //     }

    int i=0;
    int len=nums.length;
    for(int j=0;j<len;j++){
        if(nums[j]!=0){
            nums[i]=nums[j];
            i++;
        }
    }
    for(int j=i;j<len;j++){
        nums[j]=0;
    }
    for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]);
        }
    }
    public static void main(String[] args) {
        int arr[] ={-1,5,-3,-34,0,34,-3,0};
        moveZeroes(arr);
    }
}
