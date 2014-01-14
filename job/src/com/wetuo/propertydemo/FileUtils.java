package com.wetuo.propertydemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtils {
	public static void copy(String source,String target) {
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(source);
			os = new FileOutputStream(target);
			int len = 0;
			byte[] buf = new byte[1024];
			while((len=is.read(buf))>0) {
				os.write(buf, 0, len);
			}
			System.out.println("¸´ÖÆ³É¹¦");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	public static void main(String[] args) {
		FileUtils.copy("D:\\temp\\testprops.xml", "D:\\temp\\copy_testprops.xml");
	}
}
