package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		
		InputStream in= new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader inr= new InputStreamReader(in);
		BufferedReader br= new BufferedReader(inr);
		Writer wr= new FileWriter("C:\\javaStudy\\file\\PhoneDB01.txt");
		BufferedWriter bw= new BufferedWriter(wr);
		
		
		List<Friend> fList= new ArrayList<Friend>();
		String info, name, hp, company;
		
		while(true) {
			
			info= br.readLine();
			if(info==null) {
				break;
			}
	
			name= info.split(",")[0];
			hp= info.split(",")[1];
			company= info.split(",")[2];
			Friend newfriend= new Friend(name, hp, company);
			fList.add(newfriend);
			bw.write(newfriend.contact(name, hp, company));
			
		}
		
		for(Friend f: fList) {
			f.showInfo();
		}
		
		Friend f01= new Friend("유재석", "011-9999-7777", "02-900-9888");
		fList.add(f01);
		bw.write(f01.contact(name, hp, company));
		
		bw.close();
		br.close();
	}
	
		
}
