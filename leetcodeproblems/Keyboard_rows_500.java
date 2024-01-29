import java.util.Scanner;
public class Keyboard_rows_500 {
    public static String[] findWords(String[] words) {
        System.out.print(words.length);
        if (words.length == 0) {
            return words;
        }
        String arr[] = new String[words.length];
        int j = 0;
        for (int i = 0; i < words.length; i++) {
            boolean r1 = row1(words[i]), r2 = row2(words[i]), r3 = row3(words[i]);
            if (r1 || r2 || r3) {
                arr[j] = words[i];
                j++;
            }
        }
        String arr1[] = new String[j];
        for (int i = 0; i < j; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    public static boolean row1(String s) {
        boolean flag = true;
        String str = "qwertyuiopQWERTYUIOP";
        for (int i = 0; i < s.length(); i++) {
            String s1 = Character.toString(s.charAt(i));
            flag = str.contains(s1);
            if ((!flag)) {
                return flag;
            }
        }
        return flag;
    }

    public static boolean row3(String s) {
        boolean flag = true;
        String str = "zxcvbnmZXCVBNM";
        for (int i = 0; i < s.length(); i++) {
            String s1 = Character.toString(s.charAt(i));
            flag = str.contains(s1);
            if ((!flag)) {
                return flag;
            }
        }
        return flag;
    }

    public static boolean row2(String s) {
        boolean flag = true;
        String str = "asdfghjklASDFGHJKL";
        for (int i = 0; i < s.length(); i++) {
            String s1 = Character.toString(s.charAt(i));
            flag = str.contains(s1);
            if ((!flag)) {
                return flag;
            }
        }
        return flag;
    }
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        String words[] =new String [5];
        for(int i=0;i<5;i++){
            words[i]=sc.next();
        }
        String newwords[] =findWords(words); 
        for(int i=0;i<newwords.length;i++){
            System.out.println(newwords[i]);
        }
    }
}
