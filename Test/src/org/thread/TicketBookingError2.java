package org.thread;

public class TicketBookingError2 implements Runnable {
	
	int wanted;
	int available=1;
	
	TicketBookingError2(int number){
		wanted=number;
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (this) {
		System.out.println("Available = "+available);
		Thread t=Thread.currentThread();
		if(available>=wanted){
			System.out.println(wanted+" ticket alotted to"+t.getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		available=available-wanted;
	}
	else{
		System.out.println("no ticket available");
	}
		}
		}
}
