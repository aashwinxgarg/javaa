package graphs;


public class representationInJava {
    public static void main(String[] args) {

        // INPUT THROUGH A MATRIX -- WAY 1

        // int n = 3,m = 3;
        // int adj[][] = new int[n+1][n+1];

        // // edge 1--2
        // adj[1][2]=1;
        // adj[2][1]=1;

        // // edge 2--3
        // adj[2][3]=1;
        // adj[3][2]=1;

        // // edge 1--3
        // adj[1][3]=1;
        // adj[3][1]=1;

        // for(int i=0;i<adj.length;i++) {
        //     System.out.println(Arrays.toString(adj[i]));
        // }




        // INPUT THROUGH AN ARRAYLIST -- WAY 2

        // int n=3, m=3;
        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // for(int i=0;i<n+1;i++) {
        //     adj.add(new ArrayList<Integer>());
        // }

        // // edge 1--2
        // adj.get(1).add(2);
        // adj.get(2).add(1);

        // // edge 2--3
        // adj.get(2).add(3);
        // adj.get(3).add(2);

        // // edge 1--3
        // adj.get(1).add(3);
        // adj.get(3).add(1);

        // for(int i=0;i<n+1;i++) {
        //     for(int j=0;j<adj.get(i).size();j++) {
        //         System.out.print(adj.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }




        // INPUT THROUGH ARRAYLIST -- WAY 2 -- DIRECTED GRAPH
        
        // int n=3, m=3;
        // ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // for(int i=0;i<n+1;i++) {
        //     adj.add(new ArrayList<>());
        // }

        // // edge 1-->2 
        // adj.get(1).add(2);

        // // edge 2-->3
        // adj.get(2).add(3);

        // // edge 1-->3
        // adj.get(1).add(3);

        // for(int i=0;i<n+1;i++) {
        //     for(int j=0;j<adj.get(i).size();j++) {
        //         System.out.print(adj.get(i).get(j)+" ");
        //     }
        //     System.out.println();
        // }

        

    }
}