package com.wetuo.propertydemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertyDemo {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("country", "china");
		prop.put("province", "jiangxi");
		prop.put("city", "jian");
		String path1 = "D:\\temp\\testprops.properties";
		//String path2 = "D:\\temp\\testprops2.properties";
		String path3 = "D:\\temp\\testprops.xml";
		try {
			OutputStream os = null;
			String str = "你好";
			byte[] bytes = str.getBytes("UTF-8");
			prop.store(new FileOutputStream(path1), "properties文件格式");
		//	prop.store(new FileWriter(path2), "writer 格式输出");
		//	prop.storeToXML(new FileOutputStream(path3), "xml格式");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
