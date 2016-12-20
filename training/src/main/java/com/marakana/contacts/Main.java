package com.marakana.contacts;

import java.util.Arrays;

public class Main {

	public static void merge(int[] a, int[]b){
		int[] output=new int[a.length+b.length];
		int ai=0, bi=0;
		for(int i=0; i<output.length-1; i++){
			if( ai!=a.length-1 && a[ai]<b[bi])
				output[i] =a[ai++];
			else
				output[i] =b[bi++];
			System.out.println("ai "+ai+"bi "+bi+" o "+output[i]);
		}
		//output[output.length-1]= ai>bi?a[++ai]:b[++bi];
		System.out.println(Arrays.toString(output));
	}
	public static void main(String[] args) {
		merge(new int[]{1,2,3,4},new int[]{1,2,3,4});
	}
}
