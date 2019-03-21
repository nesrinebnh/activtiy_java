package com.Exercice.exo1;

import java.util.Scanner;

public class ProgStrBuilder {
	public static void main(String[] args) {
		StringBuilder[] T = new StringBuilder[100];
		/**
		 * initial t
		 */
		Scanner scanner = new Scanner( System.in );
		System.out.print("how many of element do you want to add: ");
		int n = scanner.nextInt();
		
		for(int i = 0;i<n;i++) {
			System.out.print("donner la "+i+" chaine: ");
			String temp = scanner.next();
			T[i] = new StringBuilder(temp);
			
		}
		System.out.print("thank you\n");
		/**
		 * display elements maj
		 */
		System.out.print("\nStart maj operation .. ");
		for(int i =0;i<n;i++) {
			System.out.print("\nelement n°"+i+" is "+T[i].toString().toUpperCase()+"\n");
		}
		System.out.print("\noperation Done.");
		/**
		 * replace 3rd char with -
		 */
		System.out.print("\nStart maj operation .. ");
		for(int i =0;i<n;i++) {
			T[i].setCharAt(2, '-');
		}
		System.out.print("\noperation Done.");
		/**
		 * display elements maj
		 */
		System.out.print("\nStart maj operation .. ");
		for(int i =0;i<n;i++) {
			System.out.print("\nelement n°"+i+" is "+T[i].toString().toUpperCase()+"\n");
		}
		System.out.print("\noperation Done.");
	}

}

