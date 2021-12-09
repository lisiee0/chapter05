package com.javaex.ex06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		Reader rd= new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br= new BufferedReader(rd);
		
		List<Person> pList= new ArrayList<Person>();
		String line, name, hp, company, info;
		
		while(true) {
			line= br.readLine();
			if(line==null) {
				break;
			}
			name= line.split(",")[0];
			hp= line.split(",")[1];
			company= line.split(",")[2];
			
			Person np= new Person(name, hp, company);
			pList.add(np);
		}
		
		for(Person p: pList) {
			p.showInfo();
		}
		
		// 여기까지 txt 파일 읽고 List에 저장하기
		
		// 아래부터 데이터 추가후 다시 출력하기
		Scanner sc= new Scanner(System.in);
		
		System.out.println("=======================================");
		System.out.println("데이터를 입력하세요.");
		
		
		info= sc.nextLine();
		name= info.split(",")[0];
		hp= info.split(",")[1];
		company= info.split(",")[2];
		Person np01= new Person(name, hp, company);
		pList.add(np01);
		
		System.out.println("=======================================");
		
		for(Person p: pList) {
			p.showInfo();
		}
		
		// 현재까지 pList를 txt 파일로 만들기
		
		Writer wr= new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw= new BufferedWriter(wr);
		
		for(Person p: pList) {
			bw.write(p.save());
			bw.newLine();
		}
		
		sc.close();		
		br.close();
		bw.close();
	}
}
