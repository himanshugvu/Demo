package org.test;

import java.util.Scanner;

public class Search {

	static int limit;
	static int[] number;
	static int count=0;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the limit");
		number=new int[scan.nextInt()];
		limit=number.length;
		for(int i=0; i<limit;i++){
			System.out.println("Please enter "+i+" element");
			number[i]=scan.nextInt();
		}
		getNumber();
		System.out.println(count);
	}
	
	public static void getNumber(){
		for(int i=0;i<limit-1;i++){
			if(number[i]>number[i+1]){
				count++;
				sortNumber(i);
			}
		}
	}
	
	public static void sortNumber(int i){
		int temp=0;
		temp=number[i];
		for(int j=i;j<limit-1;j++){
			number[j]=number[j+1];
		}
		number[limit-1]=temp;
		getNumber();
	}
}
