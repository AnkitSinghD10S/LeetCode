import java.util.Arrays;
public class Merge_2_sorted_array_88 {
    public static void merge(int[] arr1, int m, int[] arr2, int n) {
        int j=m;
        for(int i=0;i<n;i++){
            arr1[j]=arr2[i];
            j++;
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        
    }
    public static void main(String[] args) {
        int []arr1={4,5,6,0,0,0};
        int m=arr1.length;
        int []arr2={1,2,3};
        int n=arr2.length;
        merge(arr1,m,arr2,n);
    }
}
