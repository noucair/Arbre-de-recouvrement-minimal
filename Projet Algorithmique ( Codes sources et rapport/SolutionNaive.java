package sN;


import java.util.ArrayList;
import java.util.Scanner;



public class SolutionNaive {
	
	static Scanner scan;
	public static String a;
	public static int b;
	public static int [][] graph;
	public static int c;
	public static int n;
	public static int m;
	public static int total;





	@SuppressWarnings("unchecked")
	public static void main(String[] args){
		
		scan = new Scanner(System.in);
		
		System.out.println("Veuillez entrer le nombres des sommets dans votre graphe");
		
		a = scan.nextLine();
		
        b = Integer.parseInt(a); // Nombres des sommets du graphe
        
	    graph = new int [b][b]; // le graphe 
	    
	    ArrayList<Integer> L[]=new ArrayList[b];
	   


	    System.out.println("Veuillez entrer le poids entre les sommets de ce graphe");
       for(int i = 0; i < b; i++){
    	   L[i]=new ArrayList<>(); // listes des bords reliès avec le sommets i
			for(int j = 0; j < b; j++){
				
				if (  i==j) {
					graph[i][j]=0;
				}
				else {
		    	   System.out.println("Le poids du bord: "+i+" -> "+j+"");

				graph[i][j] = scan.nextInt();
				}
				
				
				
				L[i].add(graph[i][j]);
			}
		}
       // Algorithme :
           for(int u = 0; u < b ; u++){
   			int [] liste;
   			liste = VM(L[u]);
   			n=u;
   			m=liste[1];
   			L[m].set(u, 0);
   			total += liste[0];
   			System.out.println("Le poids des sommets "+n+" -> "+m+"");
   		}
           
 			System.out.println("Remarque: le bord qui forme un cycle et a le plus grand poids et le bord additionel " );

  			System.out.println("Le poids de l'arbre couvrant:" +total);

	}
	// Méthode pour trouver la valeur minimal des poids dans la liste L[i] et sa position
	public static int[] VM(ArrayList<Integer> l) { 
		
		
	       int maxVal = Integer.MAX_VALUE;
	       int a = 0;
	       int [] resultat;
	 
	       for(int i = 0; i < l.size(); i++){
	         if(l.get(i) < maxVal & l.get(i) > 0 ) {
	        	 
	         
	           maxVal = l.get(i);
	           a = i;
	         }
	       }
	       
	       resultat = new int [] {maxVal,a};
		return resultat;
	}
	
	
	
}


	
