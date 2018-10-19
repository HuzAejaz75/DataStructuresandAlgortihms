import java.util.*;

/**
 * Created by huzaifa.aejaz on 10/18/18.
 */
public class networkDelayTime {
    public int networkDelayTime(int[][] times, int N, int K) {
        if (times == null || times.length == 0 || times[0].length == 0) {
            return -1;
        }
        int[][] grid = new int[N + 1][N + 1];
        for (int[] arr : grid) {
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        for (int[] curEdge : times) {
            grid[curEdge[0]][curEdge[1]] = curEdge[2];
        }

        int[] res = new int[N + 1];
        Arrays.fill(res, Integer.MAX_VALUE);
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(N, new Comparator<Integer>() {
            @Override
            public int compare(Integer c1, Integer c2) {
                return res[c1] - res[c2];
            }
        });
        minHeap.offer(K);
        res[K] = 0;
        while (!minHeap.isEmpty()) {
            Integer start = minHeap.poll();
            for (int i = 1; i <= N; i++) {
                int curWeight = grid[start][i];
                if (curWeight != Integer.MAX_VALUE && res[i] > res[start] + curWeight) {
                    res[i] = res[start] + curWeight;
                    minHeap.offer(i);
                }
            }
        }
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (res[i] == Integer.MAX_VALUE) {
                return -1;
            }
            count = Math.max(count, res[i]);
        }
        return count;
    }
}
