package com.javaex.ex02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		InputStream in= new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		
		
		
		
		in.close();
		

	}

}
