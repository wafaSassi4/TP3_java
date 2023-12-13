package exercice1;

public class Main {
	static int count;
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
