import java.util.Arrays;
import java.util.Scanner;

public class Maximum_Number_of_Coins_You_Can_Get_1561 {
    public static int maxCoins(int[] arr) {
        int len = arr.length;
        int n=len/3;
        int sum=0;
        int count=0;
        len=len-2;
        Arrays.sort(arr);
        while(count<n){
            sum+=arr[len];
            len-=2;
            count++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=maxCoins(arr);
        System.out.println(max);
        sc.close();
    }
}
