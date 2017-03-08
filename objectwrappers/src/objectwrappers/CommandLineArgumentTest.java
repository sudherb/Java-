package objectwrappers;

public class CommandLineArgumentTest {
	// To create values to string in main method right click on Run AS command use 
	//run configurations to update argument values.
	

	public static void main(String[] args) {
		int sum = 0;
		
		for( int a = 0; a<args.length; a++)
		sum = sum+ Integer.parseInt(args[a]);
		System.out.println(sum);
		

	}

}
