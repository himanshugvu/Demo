package org.thread;

import java.io.IOException;

public class ThreadSample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//Thread t=Thread.currentThread();
//System.out.println(t+t.getName());
		ClasswithThread cwt=new ClasswithThread();
		Thread t=new Thread(cwt);
		t.start();
		
		System.in.read();
		cwt.stop=true;
		
		
		
		
	}

}
