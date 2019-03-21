package com.Exercice.exo1;

public class ProgChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * initial VS
		 */
		Chaine[] VS = new Chaine[]{
				new Chaine("hello"),new Chaine("12354"), new Chaine("hlo145$$$"),new Chaine("-+/*"),
				new Chaine("olleh"),new Chaine("ada"),new Chaine("coloc"),new Chaine("hello"),new Chaine("hello")
		};
		/**
		 * initial VT
		 */
		int[] VT = new int[VS.length];
		/**
		 * initial VT with elements
		 */
		for(int i=0;i<VS.length;i++) {
			VT[i]=VS[i].Longeur();
		}
	
		/**
		 * display element which contains *-+/$=)"à" ..
		 */
		System.out.print("\nshowing elements which contains symbols ..");
		boolean found = false;
		for(int i = 0;i<VS.length;i++) {
			if(VS[i].nbSymbol()>0) {
				System.out.print("\n"+VS[i].getCh());
				found = true;
			}
		}
		if(found == false) System.out.print("\nno such elements found");
		System.out.println("\nOperation done ..");
		/**
		 * Display elements which include z
		 */
		System.out.print("\nshowing elements which include z ..");
		found = false;
		for(int i = 0;i<VS.length;i++) {
			if(VS[i].appartient('z')) {
				System.out.println(VS[i].getCh());
				found = true;
			}
		}
		if(found == false) System.out.print("\nno such elements found");
		System.out.println("\nOperation done ..");
		/**
		 * Display if exist reverse elements
		 */
		System.out.print("\ncheck for reverse elements ..");
		found = false;
		for(int i=0;i<VS.length-1;i++) {
			for(int j=1;j<VS.length;j++) {
				if(VS[i].isReverse(VS[j].getCh())) found = true;
			}
		}
		if(found == false) System.out.print("\nno such elements found");
		else System.out.print("\nsuch elements exist");
		System.out.println("\nOperation done ..");
		/**
		 * Palindrome
		 */
		int nb = 0;
		for(int i=0;i<VS.length;i++) {
			if(VS[i].isPalind()) nb++;
		}
		if(nb == 0) System.out.print("\nno such elements found");
		else System.out.print("\nsuch elements exist "+nb+" times");
		System.out.println("\nOperation done ..");
		/**
		 * VS[0] nb repetition
		 */
		nb = 0;
		for(int i=0;i<VS.length;i++) {
			if(VS[0].estEgal(VS[i].getCh())) nb++;
		}
		if(nb == 1) System.out.print("\nno such elements found");
		else System.out.print("\nsuch elements exist "+nb+" times");
		System.out.println("\nOperation done ..");
		
		
		
 	}

}

