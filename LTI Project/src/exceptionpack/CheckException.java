package exceptionpack;
import java.io.*;

public class CheckException {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Soumajit\\myfile.txt");
		//throws: it is used to throw the exception
int k;
while((k=fis.read())!=-1)
{
	System.out.println((char)k);
}
	fis.close();
	}

}
