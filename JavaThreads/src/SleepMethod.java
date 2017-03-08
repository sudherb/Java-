import java.lang.Thread;

public class SleepMethod extends Thread{

	@Override
	public void run() {
		for (int i = 1;i <=5;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
		//to get thread name we use Thread.currentThread().getName()+"--->" in output.
		
	}
	public static void main (String args[]){
		SleepMethod t1 = new SleepMethod();
		SleepMethod t2 = new SleepMethod();
		
		t1.start();
		t2.start();
	
	
	}

}

