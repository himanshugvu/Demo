package org.thread;

public class ClasswithThread extends Thread {
boolean stop=false;
	public void run(){
		for(int i=0;i<100000;i++){
			System.out.println(i);
			if(stop)
				return;
		}
	}
}
