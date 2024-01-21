public class Largest3SameDigitNumberinString2264{
    // public static String largestGoodInteger(String num) {
    //     int currentnum = 0;
    //     String currentsub="";
    //     int len = num.length()-3;
    //     for(int i=0;i<len;i++){
    //         char currentch=num.charAt(i);
    //         int prevnum = 0;
    //         String prevString="";
    //         if(currentch==num.charAt(i+1) && currentch==num.charAt(i+2) ){
    //             // System.out.println(currentch);
    //             prevString=""+currentch + currentch+currentch;
    //             prevnum=Integer.parseInt(String.valueOf(prevString));
    //             i+=2;
    //         }
    //         if(prevnum>currentnum){
    //             currentnum=prevnum;
    //             currentsub=prevString;
    //         }
    //     }
    //     return currentsub;
    // }
    public static String largestGoodInteger(String num) {
        int target = -1;
        for (int i = 0; i < num.length() - 2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                int current = Integer.parseInt(num.substring(i, i + 3));
                if (current > target) {
                    target = current;
                }
            }
        }
        if (target != -1) {
            if (target == 0) {
                return target + "00";
            }
            return Integer.toString(target);
        }
        return "";
    }
    public static void main(String[] args){
        String s1="6777133339";
        System.out.println(largestGoodInteger(s1));
    }
}