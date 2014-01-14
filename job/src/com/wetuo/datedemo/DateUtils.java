package com.wetuo.datedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class DateUtils  {
	public void main(String[] args) throws IOException{
		
		File file = new File("hello.txt");
		
		try {
			RandomAccessFile raf=new RandomAccessFile(file,"rw");
			raf.write('a');
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
