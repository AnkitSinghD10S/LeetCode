public class ArraySortedandRotate {
    public  boolean check(int[] nums) {
        int len = nums.length;
        int i=1;
        boolean flag = false;
        while(i<len){
            int f =1;
            int temp=nums[len-1];
            for(int j=len-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=temp;
            for(int k=0;k<len-1;k++){
                if(nums[k]>nums[k+1]){
                    f=0;
                }
            }
            if(f==1){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String [] args ){
        ArraySortedandRotate Ar = new ArraySortedandRotate();
        int nums[]={3,4,5,1,2};
        System.out.println(Ar.check(nums));
        int nums2[]={2,1,3,4};
        System.out.println(Ar.check(nums2));
    }
}
