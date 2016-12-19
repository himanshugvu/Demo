package org.test;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		for(int i=1;i<=a;i++){
			if(i%2!=0){
				for(int j=0;j<a-i;j++){
					System.out.print("   ");
				}
				for(int k=0;k<i;k++){
					if((2*i-k-1)<=9){
					System.out.print("  "+(2*i-k-1));
					}
					else{
						System.out.print(" "+(2*i-k-1));
					}
				}
			}
			else{
				for(int k=0;k<a-1;k++){
					System.out.print("   ");
				}
				for(int j=0;j<i;j++){
				System.out.print("  "+(i+j));
				}
			}
		System.out.println("");	
		}
		}

	}

