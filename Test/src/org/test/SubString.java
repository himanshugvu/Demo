package org.test;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1="abcdefghij";
         String s2="abcaabcijab";
         if(s1.length()>=s2.length()){
        	 for(int i=0;i<s2.length();i++){
        		 if(s2.substring(i).equals(s1.substring(0,s2.length()-i))){
        			 System.out.println(s2.substring(i));
        		 }
        	 }
         }
         else{
        	 for(int i=0;i<s1.length();i++){
        		 if(s1.substring(0,s1.length()-i).equals(s2.substring(s2.length()-s1.length()+i))){
        			 System.out.println(s1.substring(0,s1.length()-i));
        		 }
        	 }
         }
	}

}
