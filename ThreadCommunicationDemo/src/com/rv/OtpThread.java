package com.rv;

public class OtpThread extends Thread {
	final static int OTP =12345;
	@Override
	public void run() {
		synchronized (this) {
			System.out.println("OTP is : "+OTP );
			System.out.println("Enter OTP...");
			this.notify();
		}
	}
}
