import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        int [][]adjMatrix=new int[v][v];
        for(int i=0;i<e;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            adjMatrix[a][b]=1;
            adjMatrix[b][a]=1;    
        }
        boolean [] visited=new boolean[v];
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<v;i++){
            if(!visited[i]){
                visited[i]=true;
                queue.add(i);
                while(!queue.isEmpty()){
                    int vertex=queue.poll();
                    System.out.print(vertex+" ");
                    for(int j=0;j<v;j++){
                        if(adjMatrix[vertex][j]==1&&!visited[j]){
                            visited[j]=true;
                            queue.add(j);
                        }
                    }
                }
            }
        }  
    }
}
