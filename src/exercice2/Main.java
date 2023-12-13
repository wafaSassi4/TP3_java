package exercice2;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
	static AtomicInteger count;
	/*
	 * public static synchronized void incremante(){
		for(int i=0;i<1000;i++) {
			Main.count++;
		}
	}
	 * */
	
	
	 public static void incremante(){
		for(int i=0;i<1000;i++) {
			count.getAndIncrement();
		}
	}
	public static void main(String[]args)throws InterruptedException {
		concurrency1 c=new concurrency1();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t2.start();
		t1.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}

}
