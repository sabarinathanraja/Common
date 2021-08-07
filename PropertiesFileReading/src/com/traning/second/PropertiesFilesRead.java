package com.traning.second;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFilesRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
		FileReader fr=new FileReader("Files/db.properties");
		FileInputStream fis=new FileInputStream("Files/db.properties");
		Properties p=new Properties();
		Properties p1=new Properties();
		p.load(fr);
		p1.load(fis);
			
		//through FileReader
		System.out.println(p.getProperty("username"));
		System.out.println(p.getProperty("password"));
		
		//through Input Stream
		System.out.println(p1.getProperty("username"));
		System.out.println(p1.getProperty("password"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file is not found in the given location");
		}
		catch(IOException e1)
		{
			System.out.println("Not able to read");
		}
	}

}
