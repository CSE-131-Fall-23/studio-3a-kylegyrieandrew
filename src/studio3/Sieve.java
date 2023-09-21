package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please input the size of the list");
		int arrayMax = in.nextInt()-1;
		
		boolean[] marked = new boolean[arrayMax];
		
		//fill array
		for(int i = 0; i < arrayMax; i++) {
			int j = i+2;
			
			if(marked[i]==false) {
				for(int x = (j*2)-2; x< arrayMax; x+=j ) {
					marked[x] = true;
					
				
				}
			}
			
		}
		
		//print prime numbers
		for(int i = 0; i < arrayMax-1; i++) {
			if(marked[i]==false) {
				System.out.print(i+2 + " ");
			}
		}
		
		
	}

}
