import java.util.Arrays;
public class genrate_paranthesis_22 {
    public static void main(String[] args) {
        List<String>arraylist=new ArrayList<>();
        int n=3;
        int o=0;
        int c=0;
        String ans="";
        gen(o,c,ans,n,arraylist);
    }
    public static void gen(int o,int c,String ans ,int n, List<String>arraylist){
        if(o==n && c==n){ 
            System.out.println(ans);
            return;
        }
        if(o<n){
            gen(o+1,c,ans+"(",n,arraylist);
        }
        if(c<o){
            gen(o,c+1,ans+")",n,arraylist);
        }
    }
    
}
