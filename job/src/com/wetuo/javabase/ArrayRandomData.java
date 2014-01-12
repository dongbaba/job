package com.wetuo.javabase;

public class ArrayRandomData {
	char[] datas ;
	public ArrayRandomData() {
		String str = "abcdefghijklmnopqrstuvwxyz1234567890";
		datas = str.toCharArray();
	}
	public String getRandomData() {
		char[] rands = new char[4];
		int index;
		for(int i=0;i<4;i++) {
			index = (int)(Math.random()*datas.length);
			rands[i] = datas[index];
		}
		return new String(rands);
	}
	public static void main(String[] args) {
		ArrayRandomData ard = new ArrayRandomData();
		String randomData = ard.getRandomData();
		System.out.println("Ëæ»úÊýÊÇ£º"+randomData);
	}
}
