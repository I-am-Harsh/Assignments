package project1;
import java.util.*;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileExample {
	
	void createFile()
	{
		/*try {
			FileOutputStream out=new FileOutputStream("abc.txt");
			String str="Hello";
			byte b[]=str.getBytes();
			out.write(b);
			out.close();
			System.out.println("File Created");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
	}
	void readFile()
	{
		int ret;
		int c=0,w=0;
		int characters=0;
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream("abc.txt");
			while((ret=fin.read())!= -1)
			{
				characters++;
				if((char)ret == '\n') 
					c++;
				
				if((char)ret ==' '|| (char)ret == '\n')
					w++;
			}
			
			
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
			fin.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}
		System.out.println("Number of lines : "+(c+1));
		System.out.println("Number of words : "+(w+1));
		System.out.println("Number of Characters : "+(characters-c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileExample obj=new FileExample();
		obj.createFile();
		obj.readFile();
		
	}

}
