package com.wetuo.propertydemo;

import java.io.File;

public class FileDemo2 {
	public static void main(String[] args) {
		File file = new File("D:\\temp\\two");
		File f[] = file.listFiles();
		System.out.println(f.length);
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].getPath());
		}
		
	}
}
