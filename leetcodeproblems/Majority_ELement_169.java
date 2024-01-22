import java.util.Arrays;
import java.util.Scanner;
public class Majority_ELement_169 {
    // public static int majorityElement(int[] nums) {
    //     int count = 0, candidate = 0;
    //     for(int i : nums){
    //         if(count == 0){
    //             candidate = i;
    //             count++;
    //         }else{
    //             if(candidate == i){
    //                 count++;
    //             }else{
    //                 count--;
    //             }
    //         }
    //     }
    //     return candidate;
    // }

    // public int majorityElement(int[] arr) {
    //     Arrays.sort(arr);
    //     int element = arr[arr.length/2];
    //     return element;
    // }

    public static int majorityElement(int[] arr) {
        float len =arr.length;
        if(len==1){
            return arr[0];
        }
        float major=(len)/2;
        int element=0;
        Arrays.sort(arr);
        for(int i=0;i<len;i++){
            int count=1;
            int currentEl=arr[i];
            for(int j=i+1;j<len;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count>major){
                    element=currentEl;
                    break;
                }
                if(arr[i]!=arr[j]){
                    break;
                }
            }
        }
        return element;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[]= new int [len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();    
        }
        majorityElement(arr);
    }
}