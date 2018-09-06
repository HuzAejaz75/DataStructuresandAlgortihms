import java.util.*;

/**
 * Created by huzaifa.aejaz on 9/2/18.
 */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap();
        for(String str : words){
            if(!map.containsKey(str)) map.put(str, 0);
            map.put(str, map.get(str) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(map.get(a) == map.get(b)) return b.compareTo(a);
                return map.get(a) - map.get(b);
            }
        });
        int size = 0;
        for(String str : map.keySet()){
            if(size < k){
                pq.offer(str);
                size++;
            }else{
                if(map.get(str) >= map.get(pq.peek())){
                    pq.offer(str);
                    pq.poll();
                }
            }
        }
        List<String> list = new ArrayList();
        while(!pq.isEmpty()){
            list.add(0, pq.poll());
        }
        return list;
    }
}
