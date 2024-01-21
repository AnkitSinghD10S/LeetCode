public class Plus_one_66 {
    public static int[] plusOne(int[] digits) {
        String num="";
        int len = digits.length;
        for(int i=0;i<len;i++){
            num+=digits[i];
        }
        num+=1;
        System.out.print(num);
        // String s =Integer.toString(num);
        int arr[]=new int [num.length()];
        for(int i=0;i<num.length();i++){
            arr[i]=num.charAt(i)-'0';
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1,0};
        arr=plusOne(arr);
    }
}
