/**
 * Created by huzaifa.aejaz on 7/17/18.
 */
public class countbits {
    public int numSetBits(long a) {
        int count = 0;
        for(int i = 1; i < 33; i++){
            if(shiftAndCount(a,i)){
                count++;
            }
        }
        return count;
    }

    private boolean shiftAndCount(long a, int i){
        return (a &(1 << i)) != 0;
    }
}
