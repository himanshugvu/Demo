package org.test;

public class Damru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		for(int i=0;i<a*2-1;i++){
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=0; j<(a-i);j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
