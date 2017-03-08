
public class Multiplecatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ int a=10/0; }
		catch (ArithmeticException e){System.out.println(e);}
		catch (ArrayIndexOutOfBoundsException e){System.out.println(e);}
		catch (Exception e){System.out.println(e);}
		
		System.out.println("rest of the code");
		//greeting
		
		

	}

}
