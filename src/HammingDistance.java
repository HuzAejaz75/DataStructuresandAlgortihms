/**
 * Created by huzaifa.aejaz on 7/15/18.
 */
public class HammingDistance {
   /* public int hammingDistance(int x, int y) {
        int res=0;
        while(x!=0||y!=0){
            if(x!=0&&y!=0){
                if(x%2!=y%2){res+=1;}
                x/=2;
                y/=2;
            }else if(x!=0){
                if(x%2!=0) {res+=1;}
                x/=2;
            }else if(y!=0){
                if(y%2!=0){res+=1;}
                y/=2;
            }
            continue;
        }
        return res;
    }*/

   public int HammingDistance(int x, int y){
       int a=x^y;

       int count=0;
       while(a>0){
           count+=a&1;
           a>>=1;
       }
       return count;

   }
}
