package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static void main(String[] args) {
        int[][] adj = {{2,3,1}, {0}, {0,4}, {0}, {2}};
        int V = 5;

        // ans starts here
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] visit = new boolean[V];

        q.add(0);
        visit[0]=true;

        while(!q.isEmpty()) {
            int node = q.remove();
            arr.add(node);

            for(int i:adj[node]) {
                if(!visit[i]) {
                    q.add(i);
                    visit[i]=true;
                }
            }
        }
        System.out.println(arr);


    }
}
