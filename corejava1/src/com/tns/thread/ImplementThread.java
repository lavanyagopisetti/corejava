package com.tns.thread;

public class ImplementThread implements Runnable {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementThread ob=new ImplementThread();
		Thread t=new Thread(ob);//implementable class method
	}

	@Override
	public void run() {
		System.out.println("Runnable interface");
		
	}

}
