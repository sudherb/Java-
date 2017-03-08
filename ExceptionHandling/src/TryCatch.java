
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int a=50/0;
		} catch (ArithmeticException e){System.out.println(e);}
		
		System.out.println("rest of the code");

	}

}
