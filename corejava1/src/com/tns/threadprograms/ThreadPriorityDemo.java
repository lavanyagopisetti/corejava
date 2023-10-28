package com.tns.threadprograms;

public class ThreadPriorityDemo extends Thread {
	public void run() {
		System.out.println("Threa Thread "+ Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriorityDemo t1=new ThreadPriorityDemo();
		ThreadPriorityDemo t2=new ThreadPriorityDemo();
		ThreadPriorityDemo t3=new ThreadPriorityDemo();
		          t1.start();
		          t2.start();
		          t3.start();
		   System.out.println("prioty of thread"+ t1.getName() +":" +t1.getPriority());       

	}

}
