import java.util.ArrayList;
import java.util.List;

public class Lexicographical_Numbers_386 {
    // public List<Integer> lexicalOrder(int n) {
    //     ArrayList list = new ArrayList();
    //     lexico(n,0,list);
    //     list.remove(0);
    //     return list;
    // }
    // public void lexico(int n,int num,ArrayList list){
    //     if(num>n){
    //         return;
    //     }
    //     list.add(num);
    //     int i=0;
    //     if(num==0){
    //         i++;
    //     }
    // for(;i<=9;i++){
    //     lexico(n,num*10+i,list);
    //     }
    // }

    public List<Integer> lexicalOrder(int n) {
        ArrayList list = new ArrayList();
        for(int i=1;i<=9;i++){
        lexico(n,i,list);
        }
        return list;
    }
    public void lexico(int n,int num,ArrayList list){
        if(num>n){
            return;
        }
        list.add(num);
        
    for(int i=0;i<=9;i++){
        lexico(n,num*10+i,list);
        }
    }
}
