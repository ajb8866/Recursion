import java.io.File;
import java.util.Scanner;


public class FileASize {
	public static long getSize(File file) {
		long size = 0;
		return size;
	}
	public static void main(String[] args)
	{
		try (Scanner input = new Scanner (System.in)) {
			System.out.println("Please give a diretory or file");
			String str = input.nextLine();
			System.out.println("The size is: " + getSize(new File(str)));
		}
		
	}

}
