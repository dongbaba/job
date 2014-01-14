package com.wetuo.propertydemo;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) {
		/*
		 * File file = new File("D:\\temp"); //判断文件是否存在
		 * System.out.println("exists: "+file.exists());
		 * System.out.println("can write:"+file.canWrite());
		 * System.out.println("can read:" +file.canRead());
		 * System.out.println("can execute:"+file.canExecute());
		 * System.out.println("is directory:"+file.isDirectory());
		 * System.out.println("absolutePath:"+file.getAbsolutePath());
		 * System.out
		 * .println("free space:"+file.getFreeSpace()/1024d/1024d/1024d+"M");
		 * System.out.println("name:"+file.getName());
		 * System.out.println("parent:"+file.getParent()); try {
		 * System.out.println("CanonicalFile: "+file.getCanonicalFile()); }
		 * catch (IOException e) { e.printStackTrace(); } try {
		 * System.out.println("CanonicalPath: "+file.getCanonicalPath()); }
		 * catch (IOException e) { e.printStackTrace(); }
		 */
		StringBuffer path = new StringBuffer();
		path.append("D:\\temp\\one");
		File file = null;
		/*for (int i = 0; i < 200; i++) {
			
				path.append("\\d" + i);

		}*/
		file = new File("D:\\temp\\one\\d0");
		deleteFile(file);

	}
//循环遍历目录并删除文件跟目录
	public static void deleteFile(File f) {
		if(f.isDirectory()) {
			File[] fs = f.listFiles();
			for(int i=0;i<fs.length;i++) {
				deleteFile(fs[i]);
			}
			f.delete();
		} else if(f.isFile()) {
			f.delete();
		} 
		
		
	}
}
