package com.Exercice.exo1;

import java.util.Scanner;

public class ProgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * initial table
		 */
		String[] T = new String[100];
		/**
		 * initial scanner
		 */
		Scanner scanner = new Scanner( System.in );
		/**
		 * add items to T
		 */
		System.out.print("how many of element do you want to add: ");
		int n = scanner.nextInt();
		for(int i = 0;i<n;i++) {
			System.out.print("donner la "+i+" chaine: ");
			T[i]= scanner.next();
		}
		System.out.print("thank you\n");
		/**
		 * display elements maj
		 */
		System.out.print("Start maj operation .. ");
		for(int i =0;i<n;i++) {
			System.out.print("element n°"+i+" is "+T[i].toUpperCase()+"\n");
		}
		System.out.print("operation done");
		/**
		 * display elements min
		 */
		System.out.print("Start min operation .. ");
		for(int i =0;i<n;i++) {
			System.out.print("element n°"+i+" is "+T[i].toLowerCase()+"\n");
		}
		System.out.print("operation done");
		/**
		 * display elements which end with ant
		 */
		System.out.print("showing elements contains ant at the end ...");
		boolean found = false;
		for(int i=0;i<n;i++) {
			String temp = T[i];
			if(temp.length()>3) {
				if((temp.charAt(temp.length()-3) == 'a')&&(temp.charAt(temp.length()-2) == 'n')&&(temp.charAt(temp.length()-1) == 't') ) {
					System.out.print("\n"+temp);
					found = true;
				}
			}
		}
		if(found == false) System.out.print("\n nothing found\noperation done");
		/**
		 * display elements which start with info
		 */
		System.out.print("\nshowing elements start with info ...");
		found = false;
		for(int i=0;i<n;i++) {
			String temp = T[i];
			if(temp.length()>4) {
				if((temp.charAt(0) == 'i')&&(temp.charAt(1) == 'n')&&(temp.charAt(2) == 'f')&&(temp.charAt(2) == 'o')){
					System.out.print("\n"+temp);
					found = true;
				}
			}
		}
		if(found == false) System.out.print("\n nothing found\noperation done");

	}

}
