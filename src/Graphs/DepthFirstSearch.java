package Graphs;

import java.util.*;

/**
 * Created by huzaifa.aejaz on 6/30/18.
 */
public class DepthFirstSearch {
    public List<List<String>> findLadders(String start, String end, List<String> wordList) {
        HashSet<String> dict = new HashSet<String>(wordList);
        List<List<String>> res = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> nodeNeighbors = new HashMap<String, ArrayList<String>>();// Neighbors for every node
        HashMap<String, Integer> distance = new HashMap<String, Integer>();// Distance of every node from the start node
        ArrayList<String> solution = new ArrayList<String>();

        Set<String> visited = new HashSet<String>();


        dict.add(start);

        bfs(start, end, dict, nodeNeighbors, distance);
        dfs(start, end, dict, nodeNeighbors, distance, solution, res);
        return res;
    }



    // BFS: Trace every node's distance from the start node (level by level).
    private void bfs(String start, String end, Set<String> dict, HashMap<String, ArrayList<String>> nodeNeighbors, HashMap<String, Integer> distance) {
        for (String str : dict)
            nodeNeighbors.put(str, new ArrayList<String>());

        Queue<String> queue = new LinkedList<String>();
        queue.offer(start);
        distance.put(start, 0);

        while (!queue.isEmpty()) {
            int count = queue.size();
            boolean foundEnd = false;
            for (int i = 0; i < count; i++) {
                String cur = queue.poll();
                int curDistance = distance.get(cur);
                ArrayList<String> neighbors = getNeighbors(cur, dict);

                for (String neighbor : neighbors) {
                    nodeNeighbors.get(cur).add(neighbor);
                    if (!distance.containsKey(neighbor)) {// Check if visited
                        distance.put(neighbor, curDistance + 1);
                        if (end.equals(neighbor))// Found the shortest path
                            foundEnd = true;
                        else
                            queue.offer(neighbor);
                    }
                }
            }

            if (foundEnd)
                break;
        }
    }

    // Find all next level nodes.
    private ArrayList<String> getNeighbors(String node, Set<String> dict) {
        ArrayList<String> res = new ArrayList<String>();
        char chs[] = node.toCharArray();

        for (char ch ='a'; ch <= 'z'; ch++) {
            for (int i = 0; i < chs.length; i++) {
                if (chs[i] == ch) continue;
                char old_ch = chs[i];
                chs[i] = ch;
                if (dict.contains(String.valueOf(chs))) {
                    res.add(String.valueOf(chs));
                }
                chs[i] = old_ch;
            }

        }
        return res;
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

    // DFS: output all paths with the shortest distance.
    private void dfs(String cur, String end, Set<String> dict, HashMap<String, ArrayList<String>> nodeNeighbors, HashMap<String, Integer> distance, ArrayList<String> solution, List<List<String>> res) {
        solution.add(cur);
        if (end.equals(cur)) {
            res.add(new ArrayList<String>(solution));
        } else {
            for (String next : nodeNeighbors.get(cur)) {
                if (distance.get(next) == distance.get(cur) + 1) {
                    dfs(next, end, dict, nodeNeighbors, distance, solution, res);
                }
            }
        }
        solution.remove(solution.size() - 1);
    }
}
