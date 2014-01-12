package com.wetuo.javabase;
/*
 * 求完数：即该数的因子之和等于其本身
 * */
public class PerfectNum {
	public static void main(String[] args) {
		for(int i=1;i<1000;i++) {
			int sum= 0;
			//循环求因子，并累加
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			//判断因子之和是否等于本身，如果相等则输出
			if(sum==i) {
				System.out.print(sum+" ");
			}
		}
	}
}
