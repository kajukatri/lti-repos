package com.lti.misc.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {

	public static void main(String[] args) {
		int i=0;
try(FileInputStream fr=new FileInputStream("C:\\mkg\\c.png");
		FileOutputStream fw=new FileOutputStream("C:\\mkg\\d.png"))
{
while((i=fr.read())!=-1)		
{
	//System.out.print(i);
	//System.out.print((char)i);
fw.write(i);
	}
System.out.print("done......");
}
catch(FileNotFoundException e){
	e.printStackTrace();
	System.out.println("no such file");
}
catch(IOException e){
	System.out.println("kuch toh gadbad kia");
}
finally {
//	fr.close();
	
}
	}

}
