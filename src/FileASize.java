import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class FileASize {
	public static long getSize(File file) {
		long size = 0;
		if (file.isDirectory())
			{
				File[] files = file.listFiles();
				List<File> xFiles = new LinkedList<>(Arrays.asList(files));
				for(File f : xFiles)
				{
					size +=getSize(f);
				}
			}
		else {
		size += file.length();
		}
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
