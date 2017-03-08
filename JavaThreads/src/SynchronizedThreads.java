
public class SynchronizedThreads extends Thread{

	public  synchronized void run() {
		// TODO Auto-generated method stub
		
			for (int i = 1;i <=5;i++){
				System.out.println(Thread.currentThread().getName()+"--->"+i);
			}
			//to get thread name we use Thread.currentThread().getName()+"--->" in output.
			
		}
		public static void main (String args[]){
			Thread t1 = new SynchronizedThreads();
			Thread t2 = new SynchronizedThreads();
			
			t1.start();
			t2.start();
		
	}


}