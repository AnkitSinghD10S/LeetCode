public class nimGame {
    public boolean canWinNim(int n) {
        return n%4!=0;
    }
    public static void main(String [] args){
        nimGame G = new nimGame();
        System.out.print(G.canWinNim(6));
    }
}
