/**
 * 
 */
package org.test;

/**
 * @author himanshu
 *
 */
public class Bracket {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int n=5;
			String[] arr = new String[2*n];
			int cnt=1,i,j;
			for(i=0;i<(2*n);i++){
				if(i<(2*n)/2){
					arr[i]="(";
				}else{
					arr[i]=")";
				}
				System.out.print(arr[i]);
			}
			System.out.println();
			for(i=0;i<(2*n)/2-1;i++){
				System.out.print("(");
				for(j=(2*n)/2;j<(2*n);j++){
					String a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
					System.out.println();
				}
				System.out.print(")");
			}
	}

}
