package org.thread;

public class TicketBookingError1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketBookingError2 tt=new TicketBookingError2(1);
		
		Thread t1=new Thread(tt);
		Thread t2=new Thread(tt);
		
		t1.setName("Bhosdi Ka");
		t2.setName("Chut Maari Ka");
		
		t1.start();
		t2.start();
	}

}
