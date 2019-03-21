package com.Exercice.exo1;

public class Chaine {
	/**
	 * Fields
	 */
	String ch;
	/**
	 * Constructor with fields
	 */
	public Chaine(String ch) {
		this.ch = ch;
	}
	
	/**
	 * Empty constructor
	 */
	public Chaine() {}

	/**
	 * Lognueur return the lenghth of the string ch
	 */
	public int Longeur() {
		return ch.length();
	}
	
	public void afficher() {
		for(int i =0;i<ch.length();i++) {
			System.out.print(ch.charAt(i)+"   " );
		}
	}
	
	/**
	 * if appartient return -1 it means ch doesn't include x
	 * @param x
	 * @return
	 */
	public boolean appartient(char x) {
		return ch.indexOf(x)!=-1?true:false;
	}
	
	public int nbChiffre() {
		int nb = 0;
		for(int i=0;i<ch.length();i++) {
			if(Character.isDigit(ch.charAt(i))) nb++;
		}
		return nb;
	}
	
	public int nbCharacter() {
		int nb = 0;
		for(int i=0;i<ch.length();i++) {
			if(Character.isLetter(ch.charAt(i))) nb++;
		}
		return nb;
	}
	
	public int nbSymbol() {
		int nb =0;
		for(int i=0;i<ch.length();i++) {
			boolean test1= (Character.isLetter(ch.charAt(i))==false)&&(Character.isDigit(ch.charAt(i))==false);
			if(test1) {
				nb ++;
			}else return 0;
		}
		return nb;
	}
	
	public boolean estEgal(String s2) {
		return ch.equals(s2);
	}
	
	public boolean isPalind() {
		return ch.equals(new StringBuffer().append(ch).reverse().toString());
	}
	
	public boolean isReverse(String s2) {
		String reverse = new StringBuffer().append(ch).reverse().toString();
		return reverse.equals(s2);
	}

	public String getCh() {
		return ch;
	}

	public void setCh(String ch) {
		this.ch = ch;
	}
	
	
	
	

}

