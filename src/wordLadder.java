import java.util.*;

/**
 * Created by huzaifa.aejaz on 6/29/18.
 */
public class wordLadder
{
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        LinkedList<String> queue = new LinkedList<>();
        HashMap<String,Integer> distance = new HashMap<>();
        Set<String> visited = new HashSet<String>();
        distance.put(beginWord,1);
        for(String x:wordList){
            visited.add(x);
        }
        queue.add(beginWord);
        visited.remove(beginWord);
        while (!queue.isEmpty()){
            String v = queue.poll();
            List<String> neighbours = getAdj(v,visited);
            for(String w:neighbours){
                distance.put(w,distance.get(v)+1);
                queue.add(w);
                visited.remove(w);
                if(w.equals(endWord)){
                    return distance.get(w);
                }
            }
        }
        return 0;
    }

    private List<String> getAdj(String polled, Set<String> visited) {
        List<String> list = new ArrayList<>();
        char []array = polled.toCharArray();
        for(int i=0;i<array.length;i++){
            for(char a='a';a<='z';a++){
                char save = array[i];
                array[i] = a;
                String changed = String.valueOf(array);
                if(visited.contains(changed)){
                    list.add(changed);
                }
                array[i]= save;
            }
        }
        return list;
    }
}
