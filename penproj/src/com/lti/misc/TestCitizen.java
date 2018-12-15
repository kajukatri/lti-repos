package com.lti.misc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class TestCitizen {
	public static void main(String[] args) {
		Address address1=new Address("The adr","MG rd","mumbai","4279474");
		Address address2=new Address("Kali ","Dr rd","mumbai","4277674");
		LocalDate date1=LocalDate.of(2002, 10, 10);//y-m-d

		Citizen cz1=new Citizen("1111_2344_44","Amit",address1,date1);
		System.out.println(cz1);
		date1=date1.plusMonths(5);
		
		Citizen cz2=new Citizen("1111_8744_44","Sumit",address2,date1);
		System.out.println(cz2);
		date1=date1.minusYears(2);
		
		Citizen cz3=new Citizen("1111_9874_44","Dumit",address1,date1);
		System.out.println(cz3);

	//	Citizen citizens[]= {cz1,cz2,cz3};
		
		try(FileOutputStream fr=new FileOutputStream("C:\\mkg\\citizendata2.txt");
				//FileInputStream fis=new FileInputStream("C:\\mkg\\citizendata.txt");
				ObjectOutputStream fw=new ObjectOutputStream(fr))
		//ObjectInputStream fo=new ObjectInputStream(fis))
		{
			fw.writeObject(cz1);
			fw.writeObject(cz2);
			fw.writeObject(cz3);
		//	fw.writeObject(citizens);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("no such file");
		}
catch(IOException e){
	e.printStackTrace();
			System.out.println("kuch toh gadbad kia");
		}
	
		
	}
}
