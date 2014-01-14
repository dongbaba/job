package com.wetuo.propertydemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileDemo {
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os =null;
		try {
			is = new FileInputStream("D:\\temp\\is.txt");
			os = new FileOutputStream("D:\\temp\\os.txt");
			os.write('a');
			os.write('A');
			int i = 0;
			while(i<1000) {
				os.write('B');
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
