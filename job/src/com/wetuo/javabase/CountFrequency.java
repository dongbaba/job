package com.wetuo.javabase;


/*
 * 生成100个1~6之间的随机数，统计1~6每个数字出现的频率
 * */
public class CountFrequency {
	public static void main(String[] args) {
		int[] random = new int[100];
		int[] n = new int[6];
		int a;
		for(int i=0;i<100;i++) {
			a = (int) (Math.random()*6+1);
			random[i] = a;
			System.out.println(a);
			n[random[i]-1]++;   //精妙所在
		}//end for
		for(int i=0;i<6;i++) {
			System.out.println("数字 "+(i+1)+" 出现的概率= "+(n[i]/100.0)*100+"%");
		}
	}//endmain
}
