import java.util.Scanner;
public class Divisor_Game_1025 {
    public boolean divisorGame(int n) {
        return n%2==0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        Divisor_Game_1025 g =new Divisor_Game_1025();
        System.out.println(g.divisorGame(n));
        sc.close();    
    }
}
