package org.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int numb=0;
		try{
		numb=scanner.nextInt();
		}
		catch(InputMismatchException ex){
			
		}
     System.out.println(factorialNumber(numb));
	}
	
	public static int factorialNumber(int n){
		if(n<=1){
			return 1;
		}
		else{
			return n*factorialNumber(n-1);
		}
	}

}
