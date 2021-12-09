package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		Reader fr= new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br= new BufferedReader(fr);
		List<Person> pList= new ArrayList<Person>();
		
		while(true) {
			
			String line= br.readLine();
			if(line==null) {
				break;
			}
			
			String[] dataArray= line.split(",");
			
			String name= dataArray[0];
			String hp= dataArray[1];
			String company= dataArray[2];
			
			Person newperson= new Person(name, hp, company);
			pList.add(newperson);
			
		}
		
		for(Person p: pList) {
			p.showInfo();
		}
		br.close();
		
	}
}
