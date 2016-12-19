package org.test;

public class Number1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8,b=3,count=0;
		for(int i=0;i<100;i++){
		if(b==2){
		if(i>8){
		break;
		}
		else{
		StringBuffer s=new StringBuffer();
		s.append(i+","+(a-i));
		System.out.print(s);
		count++;
		}
		}
		else{
		StringBuffer s=new StringBuffer();
		for(int k=0;k<b-2;b++){
		s.append("(0,");
		}
		}
		}
		System.out.println(count);
		}

}
