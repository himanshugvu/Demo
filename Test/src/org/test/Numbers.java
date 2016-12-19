package org.test;

import java.util.ArrayList;

public class Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8,b=2,count=0;
		ArrayList<String> number=new ArrayList<String>();
		ArrayList<String> finalNumber=new ArrayList<String>();
		for(int i=1;i<a+1;i++){
		if(i>a){
		break;
		}
		else{
		String s=i+","+(a-i);
		number.add(s);
		count++;
		}
		}
		if(b>2){
		for(int j=0;j<b-2;j++){
			finalNumber.clear();
			for(int k=0;k<number.size();k++){
			for(int l=0;l<number.size();l++){	
				int sum=0;
				for(String s2:number.get(l).toString().split(",", j+2)){
					sum=sum+Integer.parseInt(s2);
				}
				if(sum+k==8){
				String s1=k+","+number.get(l);
				finalNumber.add(s1);
				}
			}
			}
			number.clear();
			number.addAll(finalNumber);
			
		}
		}
		if(b==2){
			System.out.print(number);
			}
		else{
		System.out.println(finalNumber);
		}
		System.out.println(count);
	}

}
