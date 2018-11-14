
import java.io.*;
import java.util.*;

public class bfsGraph {
	private int vertices; //stores the number of vertices
	private LinkedList<Integer> adj[];
	bfsGraph(int v){
		vertices=v ;
		adj= new LinkedList[v];
		for(int i=0;i<v;i++){
			adj[i]=new LinkedList();
		}	
	}
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	void bfs(int s){
		boolean visited[]= new boolean[vertices];
		LinkedList<Integer> queue= new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0){
			s=queue.poll();
			System.out.println(s +"" );
			Iterator<Integer> i =adj[s].listIterator();
			while(i.hasNext()){
				int n=i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bfsGraph g = new bfsGraph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.bfs(2); 
	}

}
