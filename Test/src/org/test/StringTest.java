package org.test;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="ab,12,23,,22,11,ss,hh,42";
		String[] sb=str.split(",");
		for(int i=0;i<sb.length;i++){
			try{
				if(sb[i].equals("")){
					System.out.println("-1");
				}
				else{
				Integer a=Integer.parseInt(sb[i]);	
				System.out.println("1");
				}
			}
			catch(Exception e){
				System.out.println("0");
			}
			//System.out.println(sb[i]);
		}
	}

}
