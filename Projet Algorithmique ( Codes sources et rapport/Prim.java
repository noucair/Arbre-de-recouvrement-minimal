package alPRIM;

import java.util.Scanner;


public class Prim {
	
	static Scanner scan;
	public static String a;
	public static int b;
	public static int [][] graph;
	public static int [] L;
	public static int c;
	public static int n;
	public static int m;
	public static int total;





	public static void main(String[] args){
		
		scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le nombres des sommets dans votre graphe");
		
		a = scan.nextLine();
		
        b = Integer.parseInt(a);
        
	    graph = new int [b][b]; // le graphe 
	    L = new int [b]; // liste des sommets passè par l'algorithme pas à pas
	    
	    System.out.println("Veuillez entrer le poids entre les sommets de ce graphe");
       for(int i = 0; i < b; i++){
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

       L[0] = 1; //On suppose que l'algorithme commence par 0 donc ce sommet est visitè par l'algorithme
       for(int i = 1; i < b; i++){
    	   L[i] =0; // on initialise les autres sommets à 0
       }
       
       for(int u = 0; u < b-1 ; u++){
			
			c = Integer.MAX_VALUE;
			for(int i = 0; i < b; i++){
			
			if(L[i]==1){
			
				for(int j = 0; j < b; j++){
				
					if(L[j]==0){
						
						if(c > graph[i][j]){
							
							c = graph[i][j];
							n = i;
							m = j;
							}	
					}
				}
			}
			}
			L[m] = 1;
			total += c;
			System.out.println("Le poids des sommets "+n+" -> "+m+" : "+c);
		}
       
		System.out.println("Le poids total est "+ total);
		
	}

}
