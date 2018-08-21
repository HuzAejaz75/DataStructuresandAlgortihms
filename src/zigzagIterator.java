import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by huzaifa.aejaz on 8/16/18.
 */
public class zigzagIterator {
    LinkedList<Iterator> list;
    public zigzagIterator(List<List<Integer>> lists) {
        list = new LinkedList<Iterator>();
        for(List<Integer> l : lists){
            if(!l.isEmpty())list.add(l.iterator());
        }
    }

    public int next() {
        Iterator poll = list.remove();
        int result = (Integer)poll.next();
        if(poll.hasNext()) list.add(poll);
        return result;
    }

    public boolean hasNext() {
        return !list.isEmpty();
    }
}
