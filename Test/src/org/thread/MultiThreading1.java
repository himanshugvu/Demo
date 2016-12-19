package org.thread;

public class MultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultiThreading2 m1=new MultiThreading2("Guard");
MultiThreading2 m2=new MultiThreading2("Serve");

Thread t1=new Thread(m1);
Thread t2=new Thread(m2);
	t1.start();
	t2.start();
	}

}
