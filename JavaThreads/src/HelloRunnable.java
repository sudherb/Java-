
public class HelloRunnable implements Runnable{
	//Implements runnable is another way to create a thread.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			for (int i = 1;i <=5;i++){
				System.out.println(Thread.currentThread().getName()+"--->"+i);
			}
			//to get thread name we use Thread.currentThread().getName()+"--->" in output.
			
		}
		public static void main (String args[]){
			Thread t1 = new Thread (new HelloRunnable());
			Thread t2 = new Thread(new HelloRunnable());
			
			t1.run();
			t2.run();
		
	}

}
