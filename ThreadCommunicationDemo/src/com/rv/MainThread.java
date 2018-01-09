package com.rv;

import java.util.Scanner;

public class MainThread {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		OtpThread o = new OtpThread();
		Scanner sc = new Scanner(System.in);
		o.start();
		synchronized (o) {
			System.out.println("Enter Name : ");
			String name=sc.nextLine();
			System.out.println("Enter Mobile Number : ");
			String mobile = sc.next();
			System.out.println("Generate OTP.......");
			o.wait(100);
			
			int otp1=sc.nextInt();
			if(OtpThread.OTP==otp1)
			{
				System.out.println("Payment Success...");
			}
			else
			{
				System.out.println("Failed.....Try Again Later");
			}
		}
	}

}
