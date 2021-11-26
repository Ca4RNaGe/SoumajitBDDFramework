package exceptionpack;

public class ArrayException {

	public static void main(String[] args) {
		try {
			int[] arr= {10,33,44,55};
			System.out.println("the ele is "+arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error : the inder specified is not correct!");
			System.out.println(e);
		}

	}

}
