package kruskal;

import java.util.Scanner;



public class Kruskal {
	
	static Scanner scan;
	public static String a;
	public static int b;
	public static int [][] graph;
	public static int [] L;
	public static int n;
	public static int m;
	public static int x;
	public static int y;
	public static int nS = 1;
	public static int min;
	public static int total;





	public static void main(String[] args){
		
		scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le nombres des sommets dans votre graphe");
		
		a = scan.nextLine();
		
        b = Integer.parseInt(a); // Nombre des sommets
        
	    graph = new int [b][b]; // le graphe 
	    L = new int [b]; // liste pour montrer le predecesseur de chaque sommet

	    System.out.println("Veuillez entrer le poids entre les sommets de ce graphe");
       for(int i = 0; i < b; i++){
    	   
    	   L[i] = -1;
			for(int j = 0; j < b; j++){
				
				if (  i==j) {
					graph[i][j]=0;
				}
				else {
		    	   System.out.println("Le poids du bord: "+i+" -> "+j+"");

				graph[i][j] = scan.nextInt();
				}
				
				if(graph[i][j]==0){
					
					graph[i][j] = Integer.MAX_VALUE;
					
				}
				
			}
			
		}
       
       //Algorithme 
       
      while (nS < b){
			
    	   
			min = Integer.MAX_VALUE;
			
			for(int i = 0; i < b; i++){
				
				for(int j = 0; j < b; j++){
					
					if(graph[i][j] < min){
						
						min = graph[i][j];
						n = i;
						m = j;
						
					}
					
				}
				
			}
			x = n;
			y = m;
			
			while(L[x]!=-1) {
				x = L[x];
			}
			
			while(L[y]!=-1) {
				y = L[y];
			}
			 
			
			if(y!=x){
				nS ++;
				System.out.println("Le poids des sommets: " + n + "->" + m+" Min : " + min);
				total+=min;
				if (L[m] == -1) {
				L[m] = n;
				}
				
			}
			
			graph[n][m] = graph[m][n] = Integer.MAX_VALUE;
			
		}
		
		System.out.println("Le poids total est "+total);
	
       
	}
	
}