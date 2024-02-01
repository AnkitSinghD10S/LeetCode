import java.util.Arrays;

public class Divide_Array_Into_Arrays_With_Max_Difference_2966 {
    public int[][] divideArray(int[] nums, int k) {
        int len=nums.length;
        int arr[][]=new int[len/3][3];
        Arrays.sort(nums); 
        int m=0;
        for(int i=0;i<len/3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=nums[m++];
            }
        }
        for(int i=0;i<len/3;i++){
            if(arr[i][2]-arr[i][0]>k ||arr[i][2]-arr[i][1]>k||arr[i][1]-arr[i][0]>k){
                return new int [0][0];
            }
        }
        return arr;
    }
}
