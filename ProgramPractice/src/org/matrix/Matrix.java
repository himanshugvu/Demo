package org.matrix;

public class Matrix {

	public static int count=0;
	static String[] input={"A#A#K","A#S#K","A#K#K"};
	static String word="S";
	static int k;
	public static void main(String[] args){
		for(int i=0;i<input.length;i++){
			for(int j=0;j<(input.length)*2-1;j=j+2){
				if(word.length()==1){
					if(String.valueOf(input[i].charAt(j)).equalsIgnoreCase(word)){
						count++;
					}
				}
				else{
				matchWord(i,j);
				}
				
			}
		}
		System.out.println(count);
	}
	
	public static void matchWord(int l,int m){
		checkHorizontal(l,m);
		checkVertical(l,m);
		checkDiagonalDown(l,m);
		checkDiagonalUp(l,m);
	}
	public static void checkHorizontal(int l,int m){
		StringBuilder newWord=new StringBuilder();
		for(k=0;k<word.length();k++){
			if(m>(input.length)*2-1){
				return;
			}
			else{
			newWord.append(input[l].charAt(m));
			m=m+2;
			}
		}
		if(word.equalsIgnoreCase(newWord.toString())){
			count++;
		}
	}
	public static void checkVertical(int l,int m){
		StringBuilder newWord=new StringBuilder();
		for(k=0;k<word.length();k++){
			if(l>input.length-1){
				return;
			}
			else{
				newWord.append(input[l].charAt(m));
				l++;
				}
		}
		if(word.equalsIgnoreCase(newWord.toString())){
			count++;
		}
	}
	public static void checkDiagonalDown(int l,int m){
		StringBuilder newWord=new StringBuilder();
		for(k=0;k<word.length();k++){
			if(l>input.length-1||m>(input.length)*2-1){
				return;
			}
			else{
				newWord.append(input[l].charAt(m));
				l++;
				m=m+2;
				}
		}
		if(word.equalsIgnoreCase(newWord.toString())){
			count++;
		}
	}
	public static void checkDiagonalUp(int l,int m){
		StringBuilder newWord=new StringBuilder();
		for(k=0;k<word.length();k++){
			if(l<0||m>(input.length)*2-1){
				return;
			}
			else{
				newWord.append(input[l].charAt(m));
				l--;
				m=m+2;
				}
		}
		if(word.equalsIgnoreCase(newWord.toString())){
			count++;
		}
	}
	
}
