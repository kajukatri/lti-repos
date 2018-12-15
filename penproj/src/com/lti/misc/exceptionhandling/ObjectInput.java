package com.lti.misc.exceptionhandling;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.lti.misc.Citizen;

public class ObjectInput {

	public static void main(String[] args) {
		List <Citizen> citizenlist=new ArrayList<>();
		try(FileInputStream fis=new FileInputStream("C:\\mkg\\citizendata2.txt");//source
				ObjectInputStream fo=new ObjectInputStream(fis))//sink
		{
			/*Citizen citizen=(Citizen)fo.readObject();
			System.out.println(citizen);*/
			while(true) {
			//Citizen [] citizen1=(Citizen[])fo.readObject();
		Citizen citizen1=(Citizen)fo.readObject();
		citizenlist.add(citizen1);	
	/*	for(Citizen c: citizen1)
		{
			System.out.println(c);
		}*/
		} }
		catch (EOFException e)
		{
			System.out.println("end of file");
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			System.out.println("end of file1");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("end of file2");
		//	e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("end of file3");
			//e.printStackTrace();
		}
		
		System.out.println(citizenlist);
	}

}
